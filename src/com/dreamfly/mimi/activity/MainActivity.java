package com.dreamfly.mimi.activity;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
/**
 * 这个对象主要是加载XML布局和视图的activity
 * @author asus
 *
 */
public class MainActivity extends Activity {

	
	  private Button btn;
	  
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		this.btn=(Button)this.findViewById(R.id.btn_mainactivity_testdemo);
		this.btn.setOnClickListener(new OnClickListener(){
			  public void onClick(View v){
				  startActivity(new Intent().setClass(MainActivity.this,ContactsActivity.class));
			  }
		});
		
	}


}
