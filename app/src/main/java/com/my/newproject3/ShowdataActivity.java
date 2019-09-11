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
import android.support.v7.widget.Toolbar;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;

public class ShowdataActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private String x = "";
	private String y = "";
	private String z = "";
	private HashMap<String, Object> mp = new HashMap<>();
	private HashMap<String, Object> cmt = new HashMap<>();
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear17;
	private ScrollView vscroll1;
	private ListView listview1;
	private LinearLayout linear20;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear19;
	private ImageView imageview1;
	private ImageView imageview6;
	private ImageView imageview3;
	private TextView textview2;
	private TextView textview1;
	private Button button1;
	private Button button2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private EditText edittext1;
	private ImageView imageview7;
	
	private Intent transfer = new Intent();
	private DatabaseReference recentview = _firebase.getReference("cityguide/recent");
	private ChildEventListener _recentview_child_listener;
	private SharedPreferences file;
	private DatabaseReference cmnt = _firebase.getReference("cityguide/comment");
	private ChildEventListener _cmnt_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.showdata);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		file = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.setAction(Intent.ACTION_VIEW);
				transfer.setData(Uri.parse(getIntent().getStringExtra("maps")));
				startActivity(transfer);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.setAction(Intent.ACTION_DIAL);
				transfer.setData(Uri.parse(getIntent().getStringExtra("mob")));
			}
		});
		
		_recentview_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		recentview.addChildEventListener(_recentview_child_listener);
		
		_cmnt_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		cmnt.addChildEventListener(_cmnt_child_listener);
	}
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable g26 = new android.graphics.drawable.GradientDrawable();
		g26.setColor(Color.parseColor("#FFFFFF"));
		g26.setCornerRadius(20);
		linear19.setBackground(g26);
		
		android.graphics.drawable.GradientDrawable g28 = new android.graphics.drawable.GradientDrawable();
		g28.setColor(Color.parseColor("#FFFFFF"));
		g28.setCornerRadius(50);
		linear10.setBackground(g28);
		
		if (getIntent().getStringExtra("mob").equals("")) {
			button2.setVisibility(View.GONE);
		}
		x = getIntent().getStringExtra("img1");
		y = getIntent().getStringExtra("img2");
		z = getIntent().getStringExtra("img3");
		if (x.equals("")) {
			imageview1.setImageResource(R.drawable.notf);
		}
		else {
			byte[] decodedString = android.util.Base64.decode(x, android.util.Base64.DEFAULT); Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);  imageview1.setImageBitmap(decodedByte);
		}
		if (y.equals("")) {
			imageview3.setImageResource(R.drawable.notf);
		}
		else {
			byte[] decodedString = android.util.Base64.decode(y, android.util.Base64.DEFAULT); Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);  imageview3.setImageBitmap(decodedByte);
		}
		if (z.equals("")) {
			imageview6.setImageResource(R.drawable.notf);
		}
		else {
			byte[] decodedString = android.util.Base64.decode(z, android.util.Base64.DEFAULT); Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);  imageview6.setImageBitmap(decodedByte);
		}
		textview1.setText(getIntent().getStringExtra("title"));
		textview4.setText(getIntent().getStringExtra("add"));
		textview5.setText(getIntent().getStringExtra("desc"));
		mp = new HashMap<>();
		mp.put("title", getIntent().getStringExtra("title"));
		mp.put("statepos", getIntent().getStringExtra("statepos"));
		mp.put("disticpos", getIntent().getStringExtra("disticpos"));
		mp.put("place", getIntent().getStringExtra("place"));
		recentview.push().updateChildren(mp);
		mp.clear();
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
