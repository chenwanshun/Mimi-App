package com.dreamfly.mimi.beanfacotry;

import java.util.ArrayList;
import java.util.List;

import com.dreamfly.mimi.bean.BaseBean;

import android.content.Context;
import android.database.Cursor;


/**
 * 利用andorid的contentProvider去获取系统的联系人的工厂包
 * 采用工程模式来建立这个包
 * 向外生产各种对象（短信，通话记录，联系人对象）
 * @author asus
 *
 */
public abstract class BaseBeanFactory {
                
	             protected Context mContext;
	             protected  List   entityList;
	             protected Cursor mCursor;
	             
	             public  BaseBeanFactory(Context mContext)
	             {
	                  this.mContext=mContext;	    
	             }
	             
	             
	             public  List  getBeanList()
	             {
	            	    this.prepareCusor();
	            	    if(this.entityList!=null)
	            	    {
	            	    	return(this.entityList);
	            	    }else{
	            	        this.entityList=new ArrayList();
	            	        return(this.entityList);
	            	    }
	             }
	             
	             protected  abstract void prepareCusor();
	               
}
