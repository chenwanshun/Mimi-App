package com.dreamfly.mimi.adapter;

import java.util.List;
import com.dreamfly.mimi.beanfacotry.BaseBeanFactory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/**
 * 这个包主
 * 要是短信，联系人，通话记录列表信息的适配器加载包
 * 采用策略模式或者模板模式来写这个继承体系
 * @author lzw
 *
 */
public class MimiBaseAdapter extends BaseAdapter {

	protected  List  mInfoList;
	protected  BaseBeanFactory mBaseBeanFactory;
	protected  Context mContext;
	
	public MimiBaseAdapter(Context mContext,List mInfoList)
	{ 
		 this.mInfoList=mInfoList;
		 this.mContext=mContext;
	}
	public int getCount() { 
		return (this.mInfoList.size());
	}

	public Object getItem(int position) {
		return (this.mInfoList.get(position));
	}

	public long getItemId(int position) {
		return (position);
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
		return null;
	}

}
