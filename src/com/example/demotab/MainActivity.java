package com.example.demotab;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	void create() {

		
		LinearLayout mainlinear=(LinearLayout)findViewById(R.id.horizontallinear);
		
		for (int i = 0; i < 10; i++) {

			LinearLayout linear = new LinearLayout(getApplicationContext());
			linear.setOrientation(LinearLayout.VERTICAL);
			LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			linear.setLayoutParams(parms);
			linear.setTag("1" + i);

			ImageView img = new ImageView(this);

			LinearLayout.LayoutParams imgvwDimens = new LinearLayout.LayoutParams(
					100, 50);
			img.setLayoutParams(imgvwDimens);
            img.setImageResource(R.drawable.ic_launcher);
			// SET SCALETYPE
			img.setScaleType(ScaleType.CENTER_CROP);
            img.setTag("2"+i);
			linear.addView(img);
			mainlinear.addView(linear);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
