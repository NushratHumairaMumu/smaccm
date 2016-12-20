package edu.umn.cs.crisys.tb.codegen.common.emitters.Port.VMSharedMem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import edu.umn.cs.crisys.tb.TbException;
import edu.umn.cs.crisys.tb.TbFailure;
import edu.umn.cs.crisys.tb.codegen.common.emitters.EmitterFactory;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortConnectionEmitter;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortEmitter;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortListEmitterCamkesVM;
import edu.umn.cs.crisys.tb.model.OSModel;
import edu.umn.cs.crisys.tb.model.connection.PortConnection;
import edu.umn.cs.crisys.tb.model.port.OutputDataPort;
import edu.umn.cs.crisys.tb.model.port.PortFeature;
import edu.umn.cs.crisys.tb.util.Util;

/*
 * Pape - sorry, I was playing with the Java 8 lambdas today;  
 * sorry if this is illegible, but it sure is fun!
 */
public class PortListEmitterSimpleVMDataport implements PortListEmitterCamkesVM {

   public List<PortEmitter> getOutputVmPorts(List<PortFeature> pl) {
      return pl.stream()
              .map(p -> EmitterFactory.port(p))
              .filter(p -> (p instanceof PortEmitterSimpleVMDataport &&
                            p.getModelElement() instanceof OutputDataPort))
              .sorted((PortEmitter p1, PortEmitter p2) -> 
                          p1.getQualifiedName().compareTo(p2.getQualifiedName())) 
              .collect(Collectors.toList());
   }
   
   public List<PortConnectionEmitter> getVMConnections(List<PortConnection> connections) {
      return connections.stream()
               .map(p -> EmitterFactory.portConnection(p))
               .filter(p -> p instanceof PortConnectionEmitterVMDataport)
               .sorted((PortConnectionEmitter p1, PortConnectionEmitter p2) -> 
                        p1.getName().compareTo(p2.getName()))
               .collect(Collectors.toList());
   }
   
   @Override
   public String getCamkesAddVMComponentLevelDeclarations(OSModel vm, List<PortFeature> pl) {
      // TODO Auto-generated method stub
      String result = ""; 
      result += getOutputVmPorts(pl).stream()
         .map(output ->  
            "dataport " + output.getType().getCamkesName() + " " + output.getQualifiedName() + ";" + System.lineSeparator())
         .collect(Collectors.joining(""));
      return result;
   }

   @Override
   public String getCamkesAddAssemblyFileVMDeclarations(OSModel vm, List<PortFeature> pl) {
      return "";
   }

   public ST getTemplateST(String stName) {
      STGroupFile template = Util.createTemplate("PortEmitterSimpleVMDataport.stg");
      return template.getInstanceOf(stName); 
   }
   
   @Override
   public String getCamkesAddAssemblyFileVMConfigDeclarations(OSModel vm, List<PortFeature> pl) {
      // O.k., here we need to generate numbers to go along with 
      // the output ports for the VM, but this is now easy.
      List<PortEmitter> ports = getOutputVmPorts(pl); 
      return ports.stream()
         .map(p -> {
            ST st = getTemplateST("assemblyConfigPort");
            st.add("port", p);
            st.add("vm", EmitterFactory.model(vm));
            st.add("index", ports.indexOf(p) + 1);
            return st.render();})
         .collect(Collectors.joining(""));
   }

   @Override
   public String getCamkesAddAssemblyFileVMCompositionDeclarations(OSModel vm, List<PortFeature> pl) {
      // add in the connections; note for this we really don't need the portlist, 
      // but the connection list from the VM.
      
      String result = 
         getVMConnections(vm.getHostSourceToVMDestConnections()).stream()
         .map(p -> {
            ST st = getTemplateST("connectCamkesSourceToVm");
            st.add("connection", p);
            st.add("vm", EmitterFactory.model(vm));
            return st.render(); })
         .collect(Collectors.joining(""));
      result += 
         getVMConnections(vm.getHostDestToVMSourceConnections()).stream()
         .map(p -> {
            ST st = getTemplateST("connectVmtoCamkesDest");
            st.add("connection", p);
            st.add("vm", EmitterFactory.model(vm));
            return st.render();
         })
         .collect(Collectors.joining(""));
      return result;
   }

   @Override
   public void getAddLinuxVMFiles(OSModel vm, List<PortFeature> pf, File linuxDir) {
      File HFile = new File(linuxDir, "camkes_init");
      try (BufferedWriter hwriter = new BufferedWriter(new FileWriter(HFile))) { 
        ST st = getTemplateST("camkesInitBody");
        String dpinit_pairs = getOutputVmPorts(pf).stream()
           .map(p -> "/dev/" + p.getQualifiedName() + " " + "8192 ")
           .collect(Collectors.joining(" "));
        dpinit_pairs += System.lineSeparator() 
              + "# note: this 8192 value is total crap; need to find type size";
        st.add("dpinit_pairs", dpinit_pairs);   
        st.add("event_inits", "");
        hwriter.append(st.render());
      } catch (IOException e) {
        throw new TbException("IOException occurred during write of linux buffer: " + e);
      }
   }
   
}
