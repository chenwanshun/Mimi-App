package com.dreamfly.mimi.bean;
import java.io.Serializable;
public class BaseBean implements Serializable { 
	
	   private int dataBaseID;
	   
	   public void setDataBaseID(int dataBaseID)
	   {
		     this.dataBaseID=dataBaseID;
	   }
	   public int  getDataBaseID()
	   {
		   return(this.dataBaseID);
	   }
	  

}
