package com.dreamfly.mimi.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dreamfly.mimi.activity.R;
import com.dreamfly.mimi.bean.Contact;
import com.dreamfly.mimi.beanfacotry.ContactFactory;

public class ContactListViewAdapter extends MimiBaseAdapter {

	
	public ContactListViewAdapter(Context mContext,List mInfoList) {
		super(mContext,mInfoList);
		
	}
	public View getView(int position, View contentView, ViewGroup viweGroup) {
		  ViewHolder viewHolder=null;
		  Contact mContact=(Contact)this.mInfoList.get(position);
		  if(contentView==null)
		  {
			  contentView=LayoutInflater.from(mContext).inflate(R.layout.contact_item_layout, null);
			  viewHolder=new ViewHolder();
			  this.bindID(viewHolder, contentView);
			  this.setContactInfo(mContact, viewHolder);
			  contentView.setTag(viewHolder);
			  
		  }else{
			  viewHolder=(ViewHolder)contentView.getTag();
			  this.setContactInfo(mContact, viewHolder);
		  }
		  return(contentView);
	}
	
	
	private class ViewHolder{
		     
		      TextView txtContactItemContact;
		      TextView txtContactItemPhoneNum;
		      ImageView imgContactItemContactHead; 
	}
   
	private void bindID(ViewHolder viewHolder,View contentView)
	{
		     viewHolder.imgContactItemContactHead=
		    		 (ImageView)contentView.findViewById(R.id.img_contactitem_contacthead);
		     viewHolder.txtContactItemPhoneNum=(TextView)contentView.findViewById(R.id.txt_contantitem_contactphone);
		     viewHolder.txtContactItemContact=(TextView)contentView.findViewById(R.id.txt_contactitem_contact);
	}
	
	private void setContactInfo(Contact contact,ViewHolder viewHolder)
	{
		 viewHolder.txtContactItemContact.setText(contact.getContactName());
		 viewHolder.txtContactItemPhoneNum.setText(contact.getPhoneNumber());
	}

}
