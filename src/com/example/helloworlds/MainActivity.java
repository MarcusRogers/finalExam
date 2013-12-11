package com.example.helloworlds;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
							
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Wassup Dr. IM!?", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		CheckBox cBox = (CheckBox) findViewById(R.id.checkBox1);
		cBox.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{

		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				
					Toast toast = Toast.makeText(getApplicationContext(), "I am the CheckBox" +
								  " and I will do the CHECKING1", 3);
					toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
					toast.show();
		
			
			}
		});
		
		final Button blueButton = (Button) findViewById(R.id.button2);
		blueButton.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
							
				blueButton.setBackgroundColor(Color.BLUE);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
