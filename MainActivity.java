package com.example.sumeshkumar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button admin,user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		admin=(EditText)findViewById(R.id.editText1);
		user=(EditText)findViewById(R.id.editText2);
		
		
	}
}
