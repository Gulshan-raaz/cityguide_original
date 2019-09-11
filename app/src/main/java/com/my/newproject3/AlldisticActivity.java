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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AlldisticActivity extends AppCompatActivity {
	
	
	private ArrayList<HashMap<String, Object>> alldistic = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear3;
	private TextView textview1;
	private LinearLayout linear5;
	private TextView textview2;
	private ListView listview1;
	
	private Intent transfer = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.alldistic);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview2 = (TextView) findViewById(R.id.textview2);
		listview1 = (ListView) findViewById(R.id.listview1);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				transfer.putExtra("statepos", getIntent().getStringExtra("pos"));
				transfer.putExtra("disticpos", String.valueOf((long)(_position)));
				transfer.setClass(getApplicationContext(), AlldataActivity.class);
				startActivity(transfer);
			}
		});
	}
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable g23 = new android.graphics.drawable.GradientDrawable();
		g23.setColor(Color.parseColor("#FFFFFF"));
		g23.setCornerRadius(20);
		linear4.setBackground(g23);
		
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(1)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Anantapur\"\n},\n{\n\"name\":\"Chittoor\"\n},\n{\n\"name\":\"East Godavari\"\n},\n{\n\"name\":\"Guntur\"\n},\n{\n\"name\":\"Krishna\"\n},\n{\n\"name\":\"Kurnool\"\n},\n{\n\"name\":\"Prakasam\"\n},\n{\n\"name\":\"Sri Potti Sriramulu Nellore\"\n},\n{\n\"name\":\"Srikakulam\"\n},\n{\n\"name\":\"Visakhapatnam\"\n},\n{\n\"name\":\"Vizianagaram\"\n},\n{\n\"name\":\"West Godavari\"\n},\n{\n\"name\":\"YSR (Kadapa)\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(2)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Anjaw\"\n},\n{\n\"name\":\"Changlang\"\n},\n{\n\"name\":\"Dibang Valley\"\n},\n{\n\"name\":\"East Kameng\"\n},\n{\n\"name\":\"East Siang\"\n},\n{\n\"name\":\"Kurung Kumey\"\n},\n{\n\"name\":\"Lohit\"\n},\n{\n\"name\":\"Longding\"\n},\n{\n\"name\":\"Lower Dibang Valley\"\n},\n{\n\"name\":\"Lower Subansiri\"\n},\n{\n\"name\":\"Papum Pare\"\n},\n{\n\"name\":\"Tawang\"\n},\n{\n\"name\":\"Tirap\"\n},\n{\n\"name\":\"Upper Siang\"\n},\n{\n\"name\":\"Upper Subansiri\"\n},\n{\n\"name\":\"West Kameng\"\n},\n{\n\"name\":\"West Siang\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(3)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Baksa\"\n},\n{\n\"name\":\"Barpeta\"\n},\n{\n\"name\":\"Bongaigaon\"\n},\n{\n\"name\":\"Cachar\"\n},\n{\n\"name\":\"Chirang\"\n},\n{\n\"name\":\"Darrang\"\n},\n{\n\"name\":\"Dhemaji\"\n},\n{\n\"name\":\"Dhubri\"\n},\n{\n\"name\":\"Dibrugarh\"\n},\n{\n\"name\":\"Dima Hasao\"\n},\n{\n\"name\":\"Goalpara\"\n},\n{\n\"name\":\"Golaghat\"\n},\n{\n\"name\":\"Hailakandi\"\n},\n{\n\"name\":\"Jorhat\"\n},\n{\n\"name\":\"Kamrup\"\n},\n{\n\"name\":\"Kamrup Metropolitan\"\n},\n{\n\"name\":\"Karbi Anglong\"\n},\n{\n\"name\":\"Karimganj\"\n},\n{\n\"name\":\"Kokrajhar\"\n},\n{\n\"name\":\"Lakhimpur\"\n},\n{\n\"name\":\"Morigaon\"\n},\n{\n\"name\":\"Nagaon\"\n},\n{\n\"name\":\"Nalbari\"\n},\n{\n\"name\":\"Sivasagar\"\n},\n{\n\"name\":\"Sonitpur\"\n},\n{\n\"name\":\"Tinsukia\"\n},\n{\n\"name\":\"Udalguri\"\n},\n{\n\"name\":\"Biswanath\"\n},\n{\n\"name\":\"Charaideo\"\n},\n{\n\"name\":\"Hojai\"\n},\n{\n\"name\":\"Majuli\"\n},\n{\n\"name\":\"South Salamara-Mankachar\"\n},\n{\n\"name\":\"West Karbi Anglong\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(4)))) {
			alldistic = new Gson().fromJson("[\n		{\n		\n		\"name\":	\"Araria\"\n		},\n		{\n		\n		\"name\":	\"Arwal\"\n		},\n		{\n		\n		\"name\":	\"Aurangabad\"\n		},\n		{\n		\n		\"name\":	\"Banka\"\n		},\n		{\n		\n		\"name\":	\"Begusarai\"\n		},\n		{\n		\n		\"name\":	\"Bhagalpur\"\n		},\n		{\n		\n		\"name\":	\"Bhojpur\"\n		},\n		{\n		\n		\"name\":	\"Buxar|\"\n		},\n		{\n		\n		\"name\":	\"Darbhanga\"\n		},\n		{\n		\n		\"name\":	\"East Champaran (Motihari)\"\n		},\n		{\n		\n		\"name\":	\"Gaya\"\n		},\n		{\n		\n		\"name\":	\"Gopalganj\"\n		},\n		{\n		\n		\"name\":	\"Jamui\"\n		},\n		{\n		\n		\"name\":	\"Jehanabad\"\n		},\n		{\n		\n		\"name\":	\"Kaimur (Bhabua)\"\n		},\n\n		{\n		\n		\"name\":	\"Katihar\"\n		},\n		{\n		\n		\"name\":	\"Khagaria\"\n		},\n		{\n		\n		\"name\":	\"Kishanganj\"\n		},\n		{\n		\n		\"name\":	\"Lakhisarai\"\n		},\n		{\n		\n		\"name\":	\"Madhepura\"\n		},\n		{\n		\n		\"name\":	\"Madhubani\"\n		},\n		{\n		\n		\"name\":	\"Munger (Monghyr)\"\n		},\n		{\n		\n		\"name\":	\"Muzaffarpur\"\n		},\n		{\n		\n		\"name\":	\"Nalanda\"\n		},\n		{\n		\n		\"name\":	\"Nawada\"\n		},\n		{\n		\n		\"name\":	\"Patna\"\n		},\n		{\n		\n		\"name\":	\"Purnia (Purnea)\"\n		},\n		{\n		\n		\"name\":	\"Rohtas\"\n		},\n		{\n		\n		\"name\":	\"Saharsa\"\n		},\n		{\n		\n		\"name\":	\"Samastipur\"\n		},\n		{\n		\n		\"name\":	\"Saran\"\n		},\n		{\n		\n		\"name\":	\"Sheikhpura\"\n		},\n		{\n		\n		\"name\":	\"Sheohar\"\n		},\n		{\n		\n		\"name\":	\"Sitamarhi\"\n		},\n		{\n		\n		\"name\":	\"Siwan\"\n		},\n		{\n		\n		\"name\":	\"Supaul\"\n		},\n		{\n		\n		\"name\":	\"Vaishali\"\n		},\n		{\n		\n		\"name\":	\"West Champaran\"\n		}\n		]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(5)))) {
			alldistic = new Gson().fromJson(" [\n{\n\"name\":\"Balod\"\n},\n{\n\"name\":\"Baloda Bazar\"\n},\n{\n\"name\":\"Balrampur\"\n},\n{\n\"name\":\"Bastar\"\n},\n{\n\"name\":\"Bemetara\"\n},\n{\n\"name\":\"Bijapur\"\n},\n{\n\"name\":\"Bilaspur\"\n},\n{\n\"name\":\"Dantewada\"\n},\n{\n\"name\":\"Dhamtari\"\n},\n{\n\"name\":\"Durg\"\n},\n{\n\"name\":\"Gariaband\"\n},\n{\n\"name\":\"Janjgir Champa\"\n},\n{\n\"name\":\"Jashpur\"\n},\n{\n\"name\":\"Kabirdham\"\n},\n{\n\"name\":\"Kanker\"\n},\n{\n\"name\":\"Kondagaon\"\n},\n{\n\"name\":\"Korba\"\n},\n{\n\"name\":\"Koriya\"\n},\n{\n\"name\":\"Mahasamund\"\n},\n{\n\"name\":\"Mungeli\"\n},\n{\n\"name\":\"Narayanpur\"\n},\n{\n\"name\":\"Raigarh\"\n},\n{\n\"name\":\"Raipur\"\n},\n{\n\"name\":\"Rajnandgaon\"\n},\n{\n\"name\":\"Sukma\"\n},\n{\n\"name\":\"Surajpur\"\n},\n{\n\"name\":\"Surguja\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(6)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"North Goa\"\n},\n{\n\"name\":\"South Goa\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(7)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Ahmedabad\"\n},\n{\n\"name\":\"Amreli\"\n},\n{\n\"name\":\"Anand\"\n},\n{\n\"name\":\"Aravalli\"\n},\n{\n\"name\":\"Banaskantha\"\n},\n{\n\"name\":\"Botad\"\n},\n{\n\"name\":\"Bharuch\"\n},\n{\n\"name\":\"Bhavnagar\"\n},\n{\n\"name\":\"Chhota Udaipur\"\n},\n{\n\"name\":\"Dahod\"\n},\n{\n\"name\":\"Devbhoomi Dwarka\"\n},\n{\n\"name\":\"Gandhinagar\"\n},\n{\n\"name\":\"Gir Somnath\"\n},\n{\n\"name\":\"Jamnagar\"\n},\n{\n\"name\":\"Junagadh\"\n},\n{\n\"name\":\"Kheda\"\n},\n{\n\"name\":\"Kutch\"\n},\n{\n\"name\":\"Mahisagar\"\n},\n{\n\"name\":\"Mahesana\"\n},\n{\n\"name\":\"Morbi\"\n},\n{\n\"name\":\"Narmada\"\n},\n{\n\"name\":\"Navsari\"\n},\n{\n\"name\":\"Panchmahal\"\n},\n{\n\"name\":\"Patan\"\n},\n{\n\"name\":\"Porbandar\"\n},\n{\n\"name\":\"Rajkot\"\n},\n{\n\"name\":\"Sabarkantha\"\n},\n{\n\"name\":\"Surat\"\n},\n{\n\"name\":\"Surendranagar\"\n},\n{\n\"name\":\"Tapi\"\n},\n{\n\"name\":\"The Dangs\"\n},\n{\n\"name\":\"Vadodara\"\n},\n{\n\"name\":\"Valsad\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(8)))) {
			alldistic = new Gson().fromJson(" [\n{\n\"name\":\"Ambala\"\n},\n{\n\"name\":\"Bhiwani\"\n},\n{\n\"name\":\"Faridabad\"\n},\n{\n\"name\":\"Fatehabad\"\n},\n{\n\"name\":\"Gurgaon\"\n},\n{\n\"name\":\"Hisar\"\n},\n{\n\"name\":\"Jhajjar\"\n},\n{\n\"name\":\"Jind\"\n},\n{\n\"name\":\"Kaithal\"\n},\n{\n\"name\":\"Karnal\"\n},\n{\n\"name\":\"Kurukshetra\"\n},\n{\n\"name\":\"Mahendragarh\"\n},\n{\n\"name\":\"Mewat\"\n},\n{\n\"name\":\"Palwal\"\n},\n{\n\"name\":\"Panchkula\"\n},\n{\n\"name\":\"Panipat\"\n},\n{\n\"name\":\"Rewari\"\n},\n{\n\"name\":\"Rohtak\"\n},\n{\n\"name\":\"Sirsa\"\n},\n{\n\"name\":\"Sonipat\"\n},\n{\n\"name\":\"Yamunanagar\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(9)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Bilaspur\"\n},\n{\n\"name\":\"Chamba\"\n},\n{\n\"name\":\"Hamirpur\"\n},\n{\n\"name\":\"Kangra\"\n},\n{\n\"name\":\"Kinnaur\"\n},\n{\n\"name\":\"Kullu\"\n},\n{\n\"name\":\"Lahaul and Spiti\"\n},\n{\n\"name\":\"Mandi\"\n},\n{\n\"name\":\"Shimla\"\n},\n{\n\"name\":\"Sirmaur\"\n},\n{\n\"name\":\"Solan\"\n},\n{\n\"name\":\"Una\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(10)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Anantnag\"\n},\n{\n\"name\":\"Badgam\"\n},\n{\n\"name\":\"Bandipora\"\n},\n{\n\"name\":\"Baramulla\"\n},\n{\n\"name\":\"Doda\"\n},\n{\n\"name\":\"Ganderbal\"\n},\n{\n\"name\":\"Jammu\"\n},\n{\n\"name\":\"Kargil\"\n},\n{\n\"name\":\"Kathua\"\n},\n{\n\"name\":\"Kishtwar\"\n},\n{\n\"name\":\"Kulgam\"\n},\n{\n\"name\":\"Kupwara\"\n},\n{\n\"name\":\"Leh\"\n},\n{\n\"name\":\"Poonch\"\n},\n{\n\"name\":\"Pulwama\"\n},\n{\n\"name\":\"Rajouri\"\n},\n{\n\"name\":\"Ramban\"\n},\n{\n\"name\":\"Reasi\"\n},\n{\n\"name\":\"Samba\"\n},\n{\n\"name\":\"Shopian\"\n},\n{\n\"name\":\"Srinagar\"\n},\n{\n\"name\":\"Udhampur\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(11)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Bokaro\"\n},\n{\n\"name\":\"Chatra\"\n},\n{\n\"name\":\"Deoghar\"\n},\n{\n\"name\":\"Dhanbad\"\n},\n{\n\"name\":\"Dumka\"\n},\n{\n\"name\":\"East Singhbhum\"\n},\n{\n\"name\":\"Garhwa\"\n},\n{\n\"name\":\"Giridih\"\n},\n{\n\"name\":\"Godda\"\n},\n{\n\"name\":\"Gumla\"\n},\n{\n\"name\":\"Hazaribagh\"\n},\n{\n\"name\":\"Jamtara\"\n},\n{\n\"name\":\"Khunti\"\n},\n{\n\"name\":\"Koderma\"\n},\n{\n\"name\":\"Latehar\"\n},\n{\n\"name\":\"Lohardaga\"\n},\n{\n\"name\":\"Pakur\"\n},\n{\n\"name\":\"Palamu\"\n},\n{\n\"name\":\"Ramgarh\"\n},\n{\n\"name\":\"Ranchi\"\n},\n{\n\"name\":\"Sahibganj\"\n},\n{\n\"name\":\"Saraikela Kharsawan\"\n},\n{\n\"name\":\"Simdega\"\n},\n{\n\"name\":\"West Singhbhum\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(12)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Bagalkot\"\n},\n{\n\"name\":\"Bangalore\"\n},\n{\n\"name\":\"Bangalore Rural\"\n},\n{\n\"name\":\"Belgaum\"\n},\n{\n\"name\":\"Bellary\"\n},\n{\n\"name\":\"Bidar\"\n},\n{\n\"name\":\"Bijapur\"\n},\n{\n\"name\":\"Chamarajanagar\"\n},\n{\n\"name\":\"Chikkaballapura\"\n},\n{\n\"name\":\"Chikmagalur\"\n},\n{\n\"name\":\"Chitradurga\"\n},\n{\n\"name\":\"Dakshina Kannada\"\n},\n{\n\"name\":\"Davanagere\"\n},\n{\n\"name\":\"Dharwad\"\n},\n{\n\"name\":\"Gadag\"\n},\n{\n\"name\":\"Gulbarga\"\n},\n{\n\"name\":\"Hassan\"\n},\n{\n\"name\":\"Haveri\"\n},\n{\n\"name\":\"Kodagu\"\n},\n{\n\"name\":\"Kolar\"\n},\n{\n\"name\":\"Koppal\"\n},\n{\n\"name\":\"Mandya\"\n},\n{\n\"name\":\"Mysore\"\n},\n{\n\"name\":\"Raichur\"\n},\n{\n\"name\":\"Ramanagara\"\n},\n{\n\"name\":\"Shimoga\"\n},\n{\n\"name\":\"Tumkur\"\n},\n{\n\"name\":\"Udupi\"\n},\n{\n\"name\":\"Uttara Kannada\"\n},\n{\n\"name\":\"Yadgir\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(13)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Alappuzha\"\n},\n{\n\"name\":\"Ernakulam\"\n},\n{\n\"name\":\"Idukki\"\n},\n{\n\"name\":\"Kannur\"\n},\n{\n\"name\":\"Kasaragod\"\n},\n{\n\"name\":\"Kollam\"\n},\n{\n\"name\":\"Kottayam\"\n},\n{\n\"name\":\"Kozhikode\"\n},\n{\n\"name\":\"Malappuram\"\n},\n{\n\"name\":\"Palakkad\"\n},\n{\n\"name\":\"Pathanamthitta\"\n},\n{\n\"name\":\"Thiruvananthapuram\"\n},\n{\n\"name\":\"Thrissur\"\n},\n{\n\"name\":\"Wayanad\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(14)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Agar Malwa\"\n},\n{\n\"name\":\"Alirajpur\"\n},\n{\n\"name\":\"Anuppur\"\n},\n{\n\"name\":\"Ashoknagar\"\n},\n{\n\"name\":\"Balaghat\"\n},\n{\n\"name\":\"Barwani\"\n},\n{\n\"name\":\"Betul\"\n},\n{\n\"name\":\"Bhind\"\n},\n{\n\"name\":\"Bhopal\"\n},\n{\n\"name\":\"Burhanpur\"\n},\n{\n\"name\":\"Chhatarpur\"\n},\n{\n\"name\":\"Chhindwara\"\n},\n{\n\"name\":\"Damoh\"\n},\n{\n\"name\":\"Datia\"\n},\n{\n\"name\":\"Dewas\"\n},\n{\n\"name\":\"Dhar\"\n},\n{\n\"name\":\"Dindori\"\n},\n{\n\"name\":\"East Nimar\"\n},\n{\n\"name\":\"Guna\"\n},\n{\n\"name\":\"Gwalior\"\n},\n{\n\"name\":\"Harda\"\n},\n{\n\"name\":\"Hoshangabad\"\n},\n{\n\"name\":\"Indore\"\n},\n{\n\"name\":\"Jabalpur\"\n},\n{\n\"name\":\"Jhabua\"\n},\n{\n\"name\":\"Katni\"\n},\n{\n\"name\":\"Mandla\"\n},\n{\n\"name\":\"Mandsaur\"\n},\n{\n\"name\":\"Morena\"\n},\n{\n\"name\":\"Narsinghpur\"\n},\n{\n\"name\":\"Neemuch\"\n},\n{\n\"name\":\"Panna\"\n},\n{\n\"name\":\"Raisen\"\n},\n{\n\"name\":\"Rajgarh\"\n},\n{\n\"name\":\"Ratlam\"\n},\n{\n\"name\":\"Rewa\"\n},\n{\n\"name\":\"Sagar\"\n},\n{\n\"name\":\"Satna\"\n},\n{\n\"name\":\"Sehore\"\n},\n{\n\"name\":\"Seoni\"\n},\n{\n\"name\":\"Shahdol\"\n},\n{\n\"name\":\"Shajapur\"\n},\n{\n\"name\":\"Sheopur\"\n},\n{\n\"name\":\"Shivpuri\"\n},\n{\n\"name\":\"Sidhi\"\n},\n{\n\"name\":\"Singrauli\"\n},\n{\n\"name\":\"Tikamgarh\"\n},\n{\n\"name\":\"Ujjain\"\n},\n{\n\"name\":\"Umaria\"\n},\n{\n\"name\":\"Vidisha\"\n},\n{\n\"name\":\"West Nimar\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(15)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Ahmednagar\"\n},\n{\n\"name\":\"Akola\"\n},\n{\n\"name\":\"Amravati\"\n},\n{\n\"name\":\"Aurangabad\"\n},\n{\n\"name\":\"Beed\"\n},\n{\n\"name\":\"Bhandara\"\n},\n{\n\"name\":\"Buldhana\"\n},\n{\n\"name\":\"Chandrapur\"\n},\n{\n\"name\":\"Dhule\"\n},\n{\n\"name\":\"Gadchiroli\"\n},\n{\n\"name\":\"Gondia\"\n},\n{\n\"name\":\"Hingoli\"\n},\n{\n\"name\":\"Jalgaon\"\n},\n{\n\"name\":\"Jalna\"\n},\n{\n\"name\":\"Kolhapur\"\n},\n{\n\"name\":\"Latur\"\n},\n{\n\"name\":\"Mumbai City\"\n},\n{\n\"name\":\"Mumbai Suburban\"\n},\n{\n\"name\":\"Nagpur\"\n},\n{\n\"name\":\"Nanded\"\n},\n{\n\"name\":\"Nandurbar\"\n},\n{\n\"name\":\"Nashik\"\n},\n{\n\"name\":\"Osmanabad\"\n},\n{\n\"name\":\"Parbhani\"\n},\n{\n\"name\":\"Pune\"\n},\n{\n\"name\":\"Raigad\"\n},\n{\n\"name\":\"Ratnagiri\"\n},\n{\n\"name\":\"Sangli\"\n},\n{\n\"name\":\"Satara\"\n},\n{\n\"name\":\"Sindhudurg\"\n},\n{\n\"name\":\"Solapur\"\n},\n{\n\"name\":\"Thane\"\n},\n{\n\"name\":\"Wardha\"\n},\n{\n\"name\":\"Washim\"\n},\n{\n\"name\":\"Yavatmal\"\n},\n{\n\"name\":\"Palghar\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(16)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Bishnupur\"\n},\n{\n\"name\":\"Chandel\"\n},\n{\n\"name\":\"Churachandpur\"\n},\n{\n\"name\":\"Imphal East\"\n},\n{\n\"name\":\"Imphal West\"\n},\n{\n\"name\":\"Senapati\"\n},\n{\n\"name\":\"Tamenglong\"\n},\n{\n\"name\":\"Thoubal\"\n},\n{\n\"name\":\"Ukhrul\"\n},\n{\n\"name\":\"Kangpokpi\"\n},\n{\n\"name\":\"Tengnoupal\"\n},\n{\n\"name\":\"Pherzawl\"\n},\n{\n\"name\":\"Noney\"\n},\n{\n\"name\":\"Kamjong\"\n},\n{\n\"name\":\"Jiribam\"\n},\n{\n\"name\":\"Kakching\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(17)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"East Garo Hills\"\n},\n{\n\"name\":\"West Garo Hills\"\n},\n{\n\"name\":\"North Garo Hills\"\n},\n{\n\"name\":\"South Garo Hills\"\n},\n{\n\"name\":\"South West Garo Hills\"\n},\n{\n\"name\":\"East Jaintia Hills\"\n},\n{\n\"name\":\"West Jaintia Hills\"\n},\n{\n\"name\":\"East Khasi Hills\"\n},\n{\n\"name\":\"South West Khasi Hills\"\n},\n{\n\"name\":\"West Khasi Hills\"\n},\n{\n\"name\":\"Ri-Bhoi\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(18)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Aizawl\"\n},\n{\n\"name\":\"Champhai\"\n},\n{\n\"name\":\"Kolasib\"\n},\n{\n\"name\":\"Lawngtlai\"\n},\n{\n\"name\":\"Lunglei\"\n},\n{\n\"name\":\"Mamit\"\n},\n{\n\"name\":\"Saiha\"\n},\n{\n\"name\":\"Serchhip\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(19)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Dimapur\"\n},\n{\n\"name\":\"Kiphire\"\n},\n{\n\"name\":\"Kohima\"\n},\n{\n\"name\":\"Longleng\"\n},\n{\n\"name\":\"Mokokchung\"\n},\n{\n\"name\":\"Mon\"\n},\n{\n\"name\":\"Peren\"\n},\n{\n\"name\":\"Phek\"\n},\n{\n\"name\":\"Tuensang\"\n},\n{\n\"name\":\"Wokha\"\n},\n{\n\"name\":\"Zunheboto\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(20)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Angul\"\n},\n{\n\"name\":\"Balangir\"\n},\n{\n\"name\":\"Baleshwar\"\n},\n{\n\"name\":\"Bargarh\"\n},\n{\n\"name\":\"Bhadrak\"\n},\n{\n\"name\":\"Boudh\"\n},\n{\n\"name\":\"Cuttack\"\n},\n{\n\"name\":\"Debagarh\"\n},\n{\n\"name\":\"Dhenkanal\"\n},\n{\n\"name\":\"Gajapati\"\n},\n{\n\"name\":\"Ganjam\"\n},\n{\n\"name\":\"Jagatsinghpur\"\n},\n{\n\"name\":\"Jajpur\"\n},\n{\n\"name\":\"Jharsuguda\"\n},\n{\n\"name\":\"Kalahandi\"\n},\n{\n\"name\":\"Kandhamal\"\n},\n{\n\"name\":\"Kendrapara\"\n},\n{\n\"name\":\"Kendujhar\"\n},\n{\n\"name\":\"Khordha\"\n},\n{\n\"name\":\"Koraput\"\n},\n{\n\"name\":\"Malkangiri\"\n},\n{\n\"name\":\"Mayurbhanj\"\n},\n{\n\"name\":\"Nabarangapur\"\n},\n{\n\"name\":\"Nayagarh\"\n},\n{\n\"name\":\"Nuapada\"\n},\n{\n\"name\":\"Puri\"\n},\n{\n\"name\":\"Rayagada\"\n},\n{\n\"name\":\"Sambalpur\"\n},\n{\n\"name\":\"Subarnapur\"\n},\n{\n\"name\":\"Sundergarh\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(21)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Amritsar\"\n},\n{\n\"name\":\"Barnala\"\n},\n{\n\"name\":\"Bathinda\"\n},\n{\n\"name\":\"Faridkot\"\n},\n{\n\"name\":\"Fatehgarh Sahib\"\n},\n{\n\"name\":\"Fazilka\"\n},\n{\n\"name\":\"Firozpur\"\n},\n{\n\"name\":\"Gurdaspur\"\n},\n{\n\"name\":\"Hoshiarpur\"\n},\n{\n\"name\":\"Jalandhar\"\n},\n{\n\"name\":\"Kapurthala\"\n},\n{\n\"name\":\"Ludhiana\"\n},\n{\n\"name\":\"Mansa\"\n},\n{\n\"name\":\"Moga\"\n},\n{\n\"name\":\"Mohali\"\n},\n{\n\"name\":\"Muktsar (Sri Muktsar Sahib)\"\n},\n{\n\"name\":\"Pathankot\"\n},\n{\n\"name\":\"Patiala\"\n},\n{\n\"name\":\"Rupnagar\"\n},\n{\n\"name\":\"Sangrur\"\n},\n{\n\"name\":\"Shahid Bhagat Singh Nagar\"\n},\n{\n\"name\":\"Tarn Taran\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(22)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Ajmer\"\n},\n{\n\"name\":\"Alwar\"\n},\n{\n\"name\":\"Banswara\"\n},\n{\n\"name\":\"Baran\"\n},\n{\n\"name\":\"Barmer\"\n},\n{\n\"name\":\"Bharatpur\"\n},\n{\n\"name\":\"Bhilwara\"\n},\n{\n\"name\":\"Bikaner\"\n},\n{\n\"name\":\"Bundi\"\n},\n{\n\"name\":\"Chittorgarh\"\n},\n{\n\"name\":\"Churu\"\n},\n{\n\"name\":\"Dausa\"\n},\n{\n\"name\":\"Dholpur\"\n},\n{\n\"name\":\"Dungarpur\"\n},\n{\n\"name\":\"Ganganagar\"\n},\n{\n\"name\":\"Hanumangarh\"\n},\n{\n\"name\":\"Jaipur\"\n},\n{\n\"name\":\"Jaisalmer\"\n},\n{\n\"name\":\"Jalore\"\n},\n{\n\"name\":\"Jhalawar\"\n},\n{\n\"name\":\"Jhunjhunu\"\n},\n{\n\"name\":\"Jodhpur\"\n},\n{\n\"name\":\"Karauli\"\n},\n{\n\"name\":\"Kota\"\n},\n{\n\"name\":\"Nagaur\"\n},\n{\n\"name\":\"Pali\"\n},\n{\n\"name\":\"Pratapgarh\"\n},\n{\n\"name\":\"Rajsamand\"\n},\n{\n\"name\":\"Sawai Madhopur\"\n},\n{\n\"name\":\"Sikar\"\n},\n{\n\"name\":\"Sirohi\"\n},\n{\n\"name\":\"Tonk\"\n},\n{\n\"name\":\"Udaipur\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(23)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"East Sikkim\"\n},\n{\n\"name\":\"North Sikkim\"\n},\n{\n\"name\":\"South Sikkim\"\n},\n{\n\"name\":\"West Sikkim\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(24)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Ariyalur\"\n},\n{\n\"name\":\"Chennai\"\n},\n{\n\"name\":\"Coimbatore\"\n},\n{\n\"name\":\"Cuddalore\"\n},\n{\n\"name\":\"Dharmapuri\"\n},\n{\n\"name\":\"Dindigul\"\n},\n{\n\"name\":\"Erode\"\n},\n{\n\"name\":\"Kanchipuram\"\n},\n{\n\"name\":\"Kanyakumari\"\n},\n{\n\"name\":\"Karur\"\n},\n{\n\"name\":\"Krishnagiri\"\n},\n{\n\"name\":\"Madurai\"\n},\n{\n\"name\":\"Nagapattinam\"\n},\n{\n\"name\":\"Namakkal\"\n},\n{\n\"name\":\"Perambalur\"\n},\n{\n\"name\":\"Pudukkottai\"\n},\n{\n\"name\":\"Ramanathapuram\"\n},\n{\n\"name\":\"Salem\"\n},\n{\n\"name\":\"Sivaganga\"\n},\n{\n\"name\":\"Thanjavur\"\n},\n{\n\"name\":\"The Nilgiris\"\n},\n{\n\"name\":\"Theni\"\n},\n{\n\"name\":\"Thiruvallur\"\n},\n{\n\"name\":\"Thiruvarur\"\n},\n{\n\"name\":\"Thoothukudi\"\n},\n{\n\"name\":\"Tiruchirappalli\"\n},\n{\n\"name\":\"Tirunelveli\"\n},\n{\n\"name\":\"Tirupur\"\n},\n{\n\"name\":\"Tiruvannamalai\"\n},\n{\n\"name\":\"Vellore\"\n},\n{\n\"name\":\"Viluppuram\"\n},\n{\n\"name\":\"Virudhunagar\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(25)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Adilabad\"\n},\n{\n\"name\":\"Komram Bheem district\"\n},\n{\n\"name\":\"Bhadradri\"\n},\n{\n\"name\":\"Jayashankar\"\n},\n{\n\"name\":\"Gadwal\"\n},\n{\n\"name\":\"Hyderabad\"\n},\n{\n\"name\":\"Jagtial\"\n},\n{\n\"name\":\"Jangaon\"\n},\n{\n\"name\":\"Kamareddy\"\n},\n{\n\"name\":\"Karimnagar\"\n},\n{\n\"name\":\"Khammam\"\n},\n{\n\"name\":\"Mahabubabad\"\n},\n{\n\"name\":\"Mahbubnagar\"\n},\n{\n\"name\":\"Mancherial\"\n},\n{\n\"name\":\"Medak\"\n},\n{\n\"name\":\"Medchal\"\n},\n{\n\"name\":\"Nalgonda\"\n},\n{\n\"name\":\"Nagarkurnool\"\n},\n{\n\"name\":\"Nirmal\"\n},\n{\n\"name\":\"Nizamabad\"\n},\n{\n\"name\":\"Ranga Reddy\"\n},\n{\n\"name\":\"Peddapalli\"\n},\n{\n\"name\":\"Rajanna\"\n},\n{\n\"name\":\"Sangareddy\"\n},\n{\n\"name\":\"Siddipet\"\n},\n{\n\"name\":\"Suryapet\"\n},\n{\n\"name\":\"Vikarabad\"\n},\n{\n\"name\":\"Wanaparthy\"\n},\n{\n\"name\":\"Warangal (urban)\"\n},\n{\n\"name\":\"Warangal (rural)\"\n},\n{\n\"name\":\"Yadadri\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(26)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Dhalai\"\n},\n{\n\"name\":\"Gomati\"\n},\n{\n\"name\":\"Khowai\"\n},\n{\n\"name\":\"North Tripura\"\n},\n{\n\"name\":\"Sipahijala\"\n},\n{\n\"name\":\"South Tripura\"\n},\n{\n\"name\":\"Unakoti\"\n},\n{\n\"name\":\"West Tripura\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(27)))) {
			alldistic = new Gson().fromJson("\n[\n{\n\"name\":\"Agra\"\n},\n{\n\"name\":\"Aligarh\"\n},\n{\n\"name\":\"Allahabad\"\n},\n{\n\"name\":\"Ambedkar Nagar\"\n},\n{\n\"name\":\"Amethi\"\n},\n{\n\"name\":\"Amroha\"\n},\n{\n\"name\":\"Auraiya\"\n},\n{\n\"name\":\"Azamgarh\"\n},\n{\n\"name\":\"Baghpat\"\n},\n{\n\"name\":\"Bahraich\"\n},\n{\n\"name\":\"Ballia\"\n},\n{\n\"name\":\"Balrampur\"\n},\n{\n\"name\":\"Banda\"\n},\n{\n\"name\":\"Barabanki\"\n},\n{\n\"name\":\"Bareilly\"\n},\n{\n\"name\":\"Basti\"\n},\n{\n\"name\":\"Bijnor\"\n},\n{\n\"name\":\"Budaun\"\n},\n{\n\"name\":\"Bulandshahr\"\n},\n{\n\"name\":\"Chandauli\"\n},\n{\n\"name\":\"Chitrakoot\"\n},\n{\n\"name\":\"Deoria\"\n},\n{\n\"name\":\"Etah\"\n},\n{\n\"name\":\"Etawah\"\n},\n{\n\"name\":\"Faizabad\"\n},\n{\n\"name\":\"Farrukhabad\"\n},\n{\n\"name\":\"Fatehpur\"\n},\n{\n\"name\":\"Firozabad\"\n},\n{\n\"name\":\"Gautam Buddha Nagar\"\n},\n{\n\"name\":\"Ghaziabad\"\n},\n{\n\"name\":\"Ghazipur\"\n},\n{\n\"name\":\"Gonda\"\n},\n{\n\"name\":\"Gorakhpur\"\n},\n{\n\"name\":\"Hamirpur\"\n},\n{\n\"name\":\"Hardoi\"\n},\n{\n\"name\":\"Hathras (Mahamaya Nagar)\"\n},\n{\n\"name\":\"Jalaun\"\n},\n{\n\"name\":\"Jaunpur\"\n},\n{\n\"name\":\"Jhansi\"\n},\n{\n\"name\":\"Jyotiba Phule Nagar\"\n},\n{\n\"name\":\"Kannauj\"\n},\n{\n\"name\":\"Kanpur Dehat (Ramabai Nagar)\"\n},\n{\n\"name\":\"Kanpur Nagar\"\n},\n{\n\"name\":\"Kanshiram Nagar\"\n},\n{\n\"name\":\"Kaushambi\"\n},\n{\n\"name\":\"Kheri\"\n},\n{\n\"name\":\"Kushinagar\"\n},\n{\n\"name\":\"Lalitpur\"\n},\n{\n\"name\":\"Lucknow\"\n},\n{\n\"name\":\"Maharajganj\"\n},\n{\n\"name\":\"Mahoba\"\n},\n{\n\"name\":\"Mainpuri\"\n},\n{\n\"name\":\"Mathura\"\n},\n{\n\"name\":\"Mau\"\n},\n{\n\"name\":\"Meerut\"\n},\n{\n\"name\":\"Mirzapur\"\n},\n{\n\"name\":\"Moradabad\"\n},\n{\n\"name\":\"Muzaffarnagar\"\n},\n{\n\"name\":\"Panchsheel Nagar district (Hapur)\"\n},\n{\n\"name\":\"Pilibhit\"\n},\n{\n\"name\":\"Pratapgarh\"\n},\n{\n\"name\":\"Raebareli\"\n},\n{\n\"name\":\"Rampur\"\n},\n{\n\"name\":\"Saharanpur\"\n},\n{\n\"name\":\"Sant Kabir Nagar\"\n},\n{\n\"name\":\"Sant Ravidas Nagar\"\n},\n{\n\"name\":\"Shahjahanpur\"\n},\n{\n\"name\":\"Shamli\"\n},\n{\n\"name\":\"Shravasti\"\n},\n{\n\"name\":\"Siddharthnagar\"\n},\n{\n\"name\":\"Sitapur\"\n},\n{\n\"name\":\"Sonbhadra\"\n},\n{\n\"name\":\"Sultanpur\"\n},\n{\n\"name\":\"Unnao\"\n},\n{\n\"name\":\"Varanasi\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(28)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Almora\"\n},\n{\n\"name\":\"Bageshwar\"\n},\n{\n\"name\":\"Chamoli\"\n},\n{\n\"name\":\"Champawat\"\n},\n{\n\"name\":\"Dehradun\"\n},\n{\n\"name\":\"Haridwar\"\n},\n{\n\"name\":\"Nainital\"\n},\n{\n\"name\":\"Pauri Garhwal\"\n},\n{\n\"name\":\"Pithoragarh\"\n},\n{\n\"name\":\"Rudraprayag\"\n},\n{\n\"name\":\"Tehri Garhwal\"\n},\n{\n\"name\":\"Udham Singh Nagar\"\n},\n{\n\"name\":\"Uttarkashi\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		if (getIntent().getStringExtra("pos").equals(String.valueOf((long)(29)))) {
			alldistic = new Gson().fromJson("[\n{\n\"name\":\"Bankura\"\n},\n{\n\"name\":\"Bardhaman\"\n},\n{\n\"name\":\"Birbhum\"\n},\n{\n\"name\":\"Cooch Behar\"\n},\n{\n\"name\":\"Dakshin Dinajpur\"\n},\n{\n\"name\":\"Darjeeling\"\n},\n{\n\"name\":\"Hooghly\"\n},\n{\n\"name\":\"Howrah\"\n},\n{\n\"name\":\"Jalpaiguri\"\n},\n{\n\"name\":\"Kolkata\"\n},\n{\n\"name\":\"Malda\"\n},\n{\n\"name\":\"Murshidabad\"\n},\n{\n\"name\":\"Nadia\"\n},\n{\n\"name\":\"North 24 Parganas\"\n},\n{\n\"name\":\"Paschim Medinipur\"\n},\n{\n\"name\":\"Purba Medinipur\"\n},\n{\n\"name\":\"Purulia\"\n},\n{\n\"name\":\"South 24 Parganas\"\n},\n{\n\"name\":\"Uttar Dinajpur\"\n},\n{\n\"name\":\"Alipurduar\"\n},\n{\n\"name\":\"Burdwan\"\n},\n{\n\"name\":\"Jhargram\"\n},\n{\n\"name\":\"Kalimpong\"\n},\n{\n\"name\":\"West Burdwan\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(alldistic));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.alldisticcustom, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			
			android.graphics.drawable.GradientDrawable g22= new android.graphics.drawable.GradientDrawable();
			g22.setColor(Color.parseColor("#FFFFFF"));
			g22.setCornerRadius(20);
			linear1.setBackground(g22);
			
			textview1.setText(alldistic.get((int)_position).get("name").toString());
			
			return _v;
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
