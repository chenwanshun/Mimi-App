package com.dreamfly.mimi.activity;

import java.util.List;

import com.dreamfly.mimi.adapter.ContactListViewAdapter;
import com.dreamfly.mimi.adapter.MimiBaseAdapter;
import com.dreamfly.mimi.bean.Contact;
import com.dreamfly.mimi.beanfacotry.BaseBeanFactory;
import com.dreamfly.mimi.beanfacotry.ContactFactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class ContactsActivity extends Activity {

	
     private ListView  listviewContactActivityShowContact;
	 private MimiBaseAdapter mContactAdpater;
     private BaseBeanFactory mBaseBeanFactory;
	 private List<Contact> mContactList;
     
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.contact_activity);
		this.initial();
	}
	
	private void initial()
	{
		   this.listviewContactActivityShowContact=(ListView)this.findViewById(R.id.listview_contactactivity_showcontact);
	       this.mBaseBeanFactory=new ContactFactory(this);
		   this.mContactList=this.mBaseBeanFactory.getBeanList();
		   if(this.mContactList!=null)
		   {
		       this.mContactAdpater=new ContactListViewAdapter(this,this.mContactList);
		       this.listviewContactActivityShowContact.setAdapter(mContactAdpater);
		   }
	}
	
}
