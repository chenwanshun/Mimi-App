package com.dreamfly.mimi.beanfacotry;

import java.util.ArrayList;



import com.dreamfly.mimi.bean.Contact;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.Log;

public class ContactFactory extends BaseBeanFactory {

	  private Uri  contactUri;
	  private String [] phoneProjection;
	  private int phoneNameIndex;
	  private int phoneNumberIndex;
	  private int phonePhotoIdIndex;
	  private int phoneContactIdIndex;
	  
	public ContactFactory(Context mContext) {
		super(mContext);
		this.initial();
	}
    private void initial()
    {
    	 this.contactUri=Phone.CONTENT_URI;
    	 this.phoneProjection=new String[]
         {Phone.DISPLAY_NAME,Phone.NUMBER,Phone.PHOTO_ID,Phone.CONTACT_ID};
    	 this.phoneNameIndex=0;
    	 this.phoneNumberIndex=1;
    	 this.phonePhotoIdIndex=2;
    	 this.phoneContactIdIndex=3;
    	 
    }
	protected void prepareCusor() {
          
		   this.entityList=new ArrayList<Contact>();
		   this.mCursor=this.mContext.getContentResolver().
				   query(this.contactUri,this.phoneProjection, null, null, null);
		   if(this.mCursor!=null)
		   {
			    Log.i("lzw", "read contact");
			    while(this.mCursor.moveToNext())
			    {
			    	 Contact mContact=new Contact();
			    	 String phoneNumber=this.mCursor.getString(this.phoneNumberIndex);
			    	 String phoenName=this.mCursor.getString(this.phoneNameIndex);
			    	 long  contactId=this.mCursor.getLong(this.phoneContactIdIndex);
			    	 long photoId=this.mCursor.getLong(this.phonePhotoIdIndex);
			    	 mContact.setContactId(contactId);
			    	 mContact.setContactName(phoenName);
			    	 mContact.setPhoneNumber(phoneNumber);
			    	 mContact.setPhotoId(photoId);
			    	 this.entityList.add(mContact);
			    }
			    this.mCursor.close();
		   }
	        
	}

} 	
