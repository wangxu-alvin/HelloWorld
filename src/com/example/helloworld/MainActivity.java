package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	private SparseArray<Button> buttons = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		buttons = new SparseArray<Button>();
		Button btSetting = (Button) findViewById(R.id.setting);
		Button btContacts = (Button) findViewById(R.id.contacts);
		Button btChats = (Button) findViewById(R.id.chats);
		Button btNews = (Button) findViewById(R.id.news);
		btSetting.setOnClickListener(this);
		btContacts.setOnClickListener(this);
		btChats.setOnClickListener(this);
		btNews.setOnClickListener(this);
		buttons.put(R.id.setting, btSetting);
		buttons.put(R.id.contacts, btContacts);
		buttons.put(R.id.chats, btChats);
		buttons.put(R.id.news, btNews);
		
		// final InputMethodManager imm = (InputMethodManager) MainActivity.this
		// .getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
		// EditText tv1 = (EditText) this.findViewById(R.id.editText1);
		// tv1.setOnTouchListener(new View.OnTouchListener() {
		// @Override
		// public boolean onTouch(View v, MotionEvent arg1) {
		// Toast toast = Toast.makeText(MainActivity.this, " «Œ“1",
		// Toast.LENGTH_SHORT);
		// toast.show();
		// boolean bool = imm.showSoftInput(v,
		// InputMethodManager.SHOW_FORCED);
		// return true;
		// }
		// });
	}

	@Override
	public void onClick(View view) {
		for (int i = 0; i < buttons.size(); i++) {
			Button bt = buttons.valueAt(i);
			if (bt.getId() == view.getId()) {
				bt.setTextColor(Color.RED);
				if (bt.getId() == R.id.setting) {
					startActivity(new Intent(MainActivity.this, SettingActivity.class));
				}
			} else {
				bt.setTextColor(Color.BLACK);
			}
		}
	}
}
