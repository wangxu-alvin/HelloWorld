package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		final InputMethodManager imm = (InputMethodManager) MainActivity.this
//				.getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
		setContentView(R.layout.activity_main);
//		EditText tv1 = (EditText) this.findViewById(R.id.editText1);
//		tv1.setOnTouchListener(new View.OnTouchListener() {
//			@Override
//			public boolean onTouch(View v, MotionEvent arg1) {
//				Toast toast = Toast.makeText(MainActivity.this, " «Œ“1",
//						Toast.LENGTH_SHORT);
//				toast.show();
//				boolean bool = imm.showSoftInput(v,
//						InputMethodManager.SHOW_FORCED);
//				return true;
//			}
//		});
	}
}
