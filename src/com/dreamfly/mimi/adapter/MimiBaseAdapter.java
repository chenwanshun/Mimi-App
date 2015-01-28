package com.dreamfly.mimi.adapter;

import java.util.List;
import com.dreamfly.mimi.beanfacotry.BaseBeanFactory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/**
 * �������
 * Ҫ�Ƕ��ţ���ϵ�ˣ�ͨ����¼�б���Ϣ�����������ذ�
 * ���ò���ģʽ����ģ��ģʽ��д����̳���ϵ
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
