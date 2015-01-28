package com.dreamfly.mimi.beanfacotry;

import java.util.ArrayList;
import java.util.List;

import com.dreamfly.mimi.bean.BaseBean;

import android.content.Context;
import android.database.Cursor;


/**
 * ����andorid��contentProviderȥ��ȡϵͳ����ϵ�˵Ĺ�����
 * ���ù���ģʽ�����������
 * �����������ֶ��󣨶��ţ�ͨ����¼����ϵ�˶���
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
