package com.dreamfly.mimi.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/**
 * 
 * 后台服务的包，
 * 这个包主要处理一些activity中不能完成的工作
 * 比如网络请求，上传数据到服务器，与activity同步的问题
 * @author lzw
 *
 */
public class BaseSerivces extends Service {
    
	  
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
