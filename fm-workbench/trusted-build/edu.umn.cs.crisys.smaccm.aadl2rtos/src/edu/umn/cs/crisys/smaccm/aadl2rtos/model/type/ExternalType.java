package edu.umn.cs.crisys.smaccm.aadl2rtos.model.type;

import java.util.ArrayList;
import java.util.List;

public class ExternalType extends Type {

  public String headerName; 
  public String typeId;
  
  public ExternalType(String tid, String headerName) { 
    this.typeId = tid;
    this.headerName = headerName;
  }
  
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public String getHeaderName() {
    return headerName;
  }
  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result
        + ((headerName == null) ? 0 : headerName.hashCode());
    result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ExternalType other = (ExternalType) obj;
    if (headerName == null) {
      if (other.headerName != null)
        return false;
    } else if (!headerName.equals(other.headerName))
      return false;
    if (typeId == null) {
      if (other.typeId != null)
        return false;
    } else if (!typeId.equals(other.typeId))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "ExternalType [typeName=" + this.getTypeId() + ", headerName=" + headerName + "]";
  }

  @Override
  public boolean isBaseType() {
    return false;
  }

  @Override
  public List<Type> dependencies() {
    return new ArrayList<Type>();
  }

  @Override
  public CType getCType(int indent) {
    return new CType(this.getTypeId(), "");
  }
  
}
