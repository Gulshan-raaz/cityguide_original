package com.my.newproject3;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class AlldataActivity extends AppCompatActivity {
	
	
	private double first = 0;
	private double second = 0;
	private double third = 0;
	private double fourth = 0;
	
	private LinearLayout linear4;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear15;
	private LinearLayout linear5;
	private LinearLayout linear14;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear29;
	private LinearLayout linear31;
	private LinearLayout linear37;
	private LinearLayout linear45;
	private LinearLayout linear13;
	private TextView textview2;
	private ImageView imageview2;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear52;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview26;
	private LinearLayout linear22;
	private TextView textview7;
	private ImageView imageview3;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private LinearLayout linear30;
	private TextView textview12;
	private ImageView imageview4;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview30;
	private TextView textview31;
	private TextView textview32;
	private LinearLayout linear38;
	private TextView textview17;
	private ImageView imageview5;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	
	private Intent transfer = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.alldata);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview29 = (TextView) findViewById(R.id.textview29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (first == 0) {
					linear14.setVisibility(View.VISIBLE);
					imageview2.setRotation((float)(180));
					first++;
				}
				else {
					linear14.setVisibility(View.GONE);
					imageview2.setRotation((float)(0));
					first--;
				}
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "11");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "12");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "13");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "14");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "15");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (second == 0) {
					linear23.setVisibility(View.VISIBLE);
					imageview3.setRotation((float)(180));
					second++;
				}
				else {
					linear23.setVisibility(View.GONE);
					imageview3.setRotation((float)(0));
					second--;
				}
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "21");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "22");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "23");
				
				startActivity(transfer);
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "24");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "25");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "26");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "27");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (third == 0) {
					linear31.setVisibility(View.VISIBLE);
					imageview4.setRotation((float)(180));
					third++;
				}
				else {
					linear31.setVisibility(View.GONE);
					imageview4.setRotation((float)(0));
					third--;
				}
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "31");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "32");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "33");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "34");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "35");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "36");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("disticpos", getIntent().getStringExtra("disticpos"));
				transfer.putExtra("statepos", getIntent().getStringExtra("statepos"));
				transfer.putExtra("place", "37");
				transfer.setClass(getApplicationContext(), AlldatalistviewActivity.class);
				startActivity(transfer);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (fourth == 0) {
					linear45.setVisibility(View.VISIBLE);
					imageview5.setRotation((float)(180));
					fourth++;
				}
				else {
					linear45.setVisibility(View.GONE);
					imageview5.setRotation((float)(0));
					fourth--;
				}
			}
		});
	}
	private void initializeLogic() {
		linear14.setVisibility(View.GONE);
		linear23.setVisibility(View.GONE);
		linear31.setVisibility(View.GONE);
		linear45.setVisibility(View.GONE);
		first = 0;
		second = 0;
		third = 0;
		fourth = 0;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
