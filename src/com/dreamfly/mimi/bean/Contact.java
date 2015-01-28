package com.dreamfly.mimi.bean;

import com.dreamfly.mimi.bean.BaseBean;
public class Contact extends BaseBean {
	
	
	        private String phoneNumber;
	        private long  contactId;
	        private long photoId;
	        private String contactName;
	        
	        public void  setPhoneNumber(String phoneNumber)
	        {
	        	  this.phoneNumber=phoneNumber;
	        }
	        
	        public String getPhoneNumber()
	        {
	        	return(this.phoneNumber);
	        }
	        
	        public void setContactId(long contactId)
	        {
	        	this.contactId=contactId;
	        }
	        public long getContactId()
	        {
	        	return(this.contactId);
	        }
	        
	        public void setPhotoId(long photoId)
	        {
	        	this.photoId=photoId;
	        }
	        public long getPhotoId()
	        {
	        	return(this.photoId);
	        }
	        
	        public void setContactName(String contactName)
	        {
	        	this.contactName=contactName;
	        }
	        public String getContactName()
	        {
	        	return(this.contactName);
	        }

}
