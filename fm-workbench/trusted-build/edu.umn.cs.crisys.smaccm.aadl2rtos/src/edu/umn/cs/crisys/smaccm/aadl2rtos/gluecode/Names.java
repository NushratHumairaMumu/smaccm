package edu.umn.cs.crisys.smaccm.aadl2rtos.gluecode;

/**
 * @author Mead, Whalen
 * 
 * TODO: many things; most importantly figure out the numbering scheme for events/signals.
 *   For signals, we get either 8, 16, or 32 of 'em (total).
 *   However, we can allocate them on a per-thread basis.
 *   So this means that a thread can have at most 32 dispatchers
 *     (which should be plenty in any system I can imagine).
 *   Each dispatcher (signal) should have an id that is derived from its thread
 *     implementation.
 *   Possibly its position in the dispatcher list.
 *
 * TODO: For events, how do we know that they will be processed?  Suppose they are 
 *   queued (buffered), and we send signals to wake up a thread.  If the thread already has 
 *   waiting events, what do we do?  Do we empty out the event queues one at a 
 *   time? (This may lead to starvation for other queues).  Do we cycle through each queue?
 *
 * TODO: Test regimen: test with queue full, queue empty, queue full/empty at 
 *   size limits.
 * 
 */
import org.osate.aadl2.DirectionType;

import edu.umn.cs.crisys.smaccm.aadl2rtos.Aadl2RtosException;
import edu.umn.cs.crisys.smaccm.aadl2rtos.ast.ArrayType;
import edu.umn.cs.crisys.smaccm.aadl2rtos.ast.PointerType;
import edu.umn.cs.crisys.smaccm.aadl2rtos.ast.Type;
import edu.umn.cs.crisys.smaccm.aadl2rtos.thread.InterruptServiceRoutine;
import edu.umn.cs.crisys.smaccm.aadl2rtos.thread.MyPort;
import edu.umn.cs.crisys.smaccm.aadl2rtos.thread.SharedData;
import edu.umn.cs.crisys.smaccm.aadl2rtos.thread.SharedDataAccessor;
import edu.umn.cs.crisys.smaccm.aadl2rtos.thread.ThreadImplementation;

public class Names {
	// private ArrayList<String> semaphoreList = new ArrayList<String>();

  static public String getCFileName(String sysInstanceName) {
    return sysInstanceName + ".c";
  }

  static public String getHFileName(String sysInstanceName) {
    return sysInstanceName + ".h";
  }    

  static public String getCalendarFnName() {
    return "smaccm_thread_calendar";
  }
  
  static public String getSystickInitializerFnName() {
    return "smaccm_initialize_px4_systick_interrupt";
  }

  static public String getISRFnName(InterruptServiceRoutine r) {
    return r.getHandlerName();
  }

  static public String getThreadImplMainFnName(ThreadImplementation tw) {
    return tw.getGeneratedEntrypoint();
  }

  static public String getThreadImplReaderFnName(String commPrim, String tName, String varName) {
    if (commPrim != null) {
      return commPrim;
    } else {
      return tName + "_read_" + varName;
    }
  }
  
  static public String getThreadImplReaderFnName(MyPort inp) {
    return getThreadImplReaderFnName(inp.getCommPrimFnNameOpt(), inp.getOwner().getName(), inp.getName());
  }
  
  static public String getThreadImplReaderFnName(SharedDataAccessor inp) {
    return getThreadImplReaderFnName(inp.getCommPrimFnNameOpt(), inp.getOwner().getName(), inp.getName());
  }

  static public String getThreadImplWriterFnName(String commPrim, String tName, String varName) {
    if (commPrim != null) {
      return commPrim;
    } else {
      return tName + "_write_" + varName;
    }
  }
  
  static public String getThreadImplWriterFnName(MyPort inp) {
    return getThreadImplWriterFnName(inp.getCommPrimFnNameOpt(), inp.getOwner().getName(), inp.getName());
  }

  static public String getThreadImplWriterFnName(SharedDataAccessor inp) {
    return getThreadImplWriterFnName(inp.getCommPrimFnNameOpt(), inp.getOwner().getName(), inp.getName());
  }
  
  static public String getReaderWriterFnName(MyPort inp) {
    if (inp.getDirection() == DirectionType.IN) {
      return getThreadImplReaderFnName(inp);
    } else if (inp.getDirection() == DirectionType.OUT){
      return getThreadImplWriterFnName(inp);
    } else {
      throw new Aadl2RtosException("Attempting to generate name for unsupported IN_OUT port");
    }
    
  }
  
  
  static public String getInputQueueIsEmptyFnName(ThreadImplementation impl, MyPort inp) {
    return impl.getName() + "_is_empty_" + inp.getName();
  }
  
  static public String createRefParameter(Type ty, String id) {
    Type elemTy = (ty instanceof ArrayType) ?
        ty : new PointerType(ty);
    return elemTy.getCType().varString(id);
  }
  
  static public String getVarRef(Type ty, String id) {
    return (ty instanceof ArrayType) ? id : ("&" + id);
  }
  
}