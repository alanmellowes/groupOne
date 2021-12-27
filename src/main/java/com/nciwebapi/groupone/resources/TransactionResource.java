package com.nciwebapi.groupone.resources;

/**
 *
 * @author Alan.Mellowes
 */
public class TransactionResource {
   private static final long serialVersionID = 1L;
   private Long id;
public Long getId(){
     return id;
}
  public void setId(Long Id){
    this.id = id;
  }
@Override
 public int hashCode() {
     int hash =0;
     hash+=(id!=null?id.hashCode():0);
     return hash;
  }

 @Override
 public boolean equals(Object object) {
    if(!(object instanceof TransactionResource)){
        return false;
   }
    TransactionResource other = (TransactionResource) object;
    if((this.id==null&&other.id!=null)||(this.id!=null&&!this.id.equals(other.id))){
        return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.nciwebapi.groupone.resources.TransactionResource[ id=" + id + " ]";
    }
    
}
