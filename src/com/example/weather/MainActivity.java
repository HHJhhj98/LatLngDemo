package com.example.weather;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.baidu.mapapi.SDKInitializer;
import com.example.weather.R;
import com.google.gson.Gson;

public class MainActivity extends Activity {

	Button mfbtn;
	private ListView listView = null;
	private MyAdapter adapter = null;
	RequestQueue queue = null;
	private TextView mNowtempTV, mqltyTV, mpmTV,mdrsg,muv,mflu,msport,mcw;
	private TextView mAddressTV;
	private TextView mCondTV;
	private TextView mWindTV;
	private TextView mWindlTV;
	private TextView mHumTV;
	private TextView mTempflTV;
	private LocationClient locationClient = null;
	private double lat;
	private double lng;
	private String address;
	private String province = "", city, district, street, StreetNumber;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 在使用SDK各组件之前初始化context信息，传入ApplicationContext
		// 注意该方法要再setContentView方法之前实现
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		SDKInitializer.initialize(getApplicationContext());
		setContentView(R.layout.activity_main);
		initMapInfo();
		queue = Volley.newRequestQueue(this);
		locationClient.start();
		intit();
		tiao();
    }
	private void tiao() {
		// TODO Auto-generated method stub
		mfbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
				
	}
	private MyLocationListenner mLocationListenner = new MyLocationListenner();

	public class MyLocationListenner implements BDLocationListener {
		@Override
		public void onReceiveLocation(BDLocation location) {
			lat = location.getLatitude();
			lng = location.getLongitude();
			province = location.getProvince();
			city = location.getCity();
			district = location.getDistrict();
			street = location.getStreet();
			StreetNumber = location.getStreetNumber();
			address = location.getAddrStr();
			weatherClick();
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					mAddressTV.setText(district + "  " + street + StreetNumber);
					
				}
			});
		}

		@Override
		public void onConnectHotSpotMessage(String arg0, int arg1) {
		}
	}

	private void initMapInfo() {
		// 定位初始化
		locationClient = new LocationClient(getApplicationContext());
		locationClient.registerLocationListener(mLocationListenner);
		LocationClientOption option = new LocationClientOption();
		 option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
	        //可选，设置定位模式，默认高精度
	        option.setCoorType("bd09ll");
	        //可选，设置返回经纬度坐标类型，默认GCJ02
	        option.setScanSpan(0);
	        //可选，设置发起定位请求的间隔，int类型，单位ms
	        option.setOpenGps(true);
	        //可选，设置是否使用gps，默认false
	        option.setLocationNotify(true);
	        //可选，设置是否当GPS有效时按照1S/1次频率输出GPS结果，默认false
	        option.setIsNeedLocationDescribe(true);
	        option.setIsNeedLocationPoiList(true);
	        option.setIgnoreKillProcess(false);
	        //可选，定位SDK内部是一个service，并放到了独立进程。
	        option.SetIgnoreCacheException(false);
	        //可选，设置是否收集Crash信息，默认收集，即参数为false
	        option.setEnableSimulateGps(false);
	        //可选，设置是否需要过滤GPS仿真结果，默认需要，即参数为false
	        option.setIsNeedAddress(true);
	        //详细地址
		locationClient.setLocOption(option);
	}


	

	

	private void intit() {
		// TODO Auto-generated method stub
		mNowtempTV = (TextView) findViewById(R.id.nowtempTV);
		mAddressTV = (TextView) findViewById(R.id.addressTV);
		mCondTV = (TextView) findViewById(R.id.condTV);
		mWindTV = (TextView) findViewById(R.id.windTV);
		mWindlTV = (TextView) findViewById(R.id.windlTV);
		mHumTV = (TextView) findViewById(R.id.humTV);
		mTempflTV = (TextView) findViewById(R.id.tempflTV);
		mqltyTV = (TextView) findViewById(R.id.qltyTV);
		mpmTV = (TextView) findViewById(R.id.pmTV);
		mdrsg=(TextView) findViewById(R.id.drsgTV);
		muv=(TextView) findViewById(R.id.uvTV);
		mflu=(TextView) findViewById(R.id.fluTV);
		mcw=(TextView) findViewById(R.id.cwTV);
		msport=(TextView) findViewById(R.id.sportTV);
		mfbtn=(Button) findViewById(R.id.fBT);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		locationClient.stop();
	}

	public void weatherClick() {
		// city = et_city.getText();
		Log.e("city", city);
		String url = "https://free-api.heweather.com/v5/weather?city="
				+ city + "&key=894fc2a749104d679fa022c3e71afe83";
		JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,
				url, null, new Response.Listener<JSONObject>() {
					@Override
					public void onResponse(JSONObject jsonObject) {
						System.out.println(jsonObject);
						Gson gson = new Gson();
						final WeatherBean weatherBean = gson.fromJson(
								jsonObject.toString(), WeatherBean.class);
						String nowtemp = weatherBean.getHeWeather5().get(0)
								.getNow().getTmp();

						String cond = weatherBean.getHeWeather5().get(0)
								.getNow().getCond().getTxt();

						String dir = weatherBean.getHeWeather5().get(0)
								.getNow().getWind().getDir();
						String qlty = weatherBean.getHeWeather5().get(0)
								.getAqi().getCity().getQlty();
						String aqi = weatherBean.getHeWeather5().get(0).getAqi()
								.getCity().getAqi();
						String winddir = weatherBean.getHeWeather5().get(0)
								.getNow().getWind().getDir();
						String windsc = weatherBean.getHeWeather5().get(0)
								.getNow().getWind().getSc();
						String Hum = weatherBean.getHeWeather5().get(0)
								.getNow().getHum();
						String fl = weatherBean.getHeWeather5().get(0).getNow()
								.getFl();
						String uv=weatherBean.getHeWeather5().get(0).getSuggestion().getUv().getBrf();
						String cw=weatherBean.getHeWeather5().get(0).getSuggestion().getCw().getBrf();
						String flu=weatherBean.getHeWeather5().get(0).getSuggestion().getFlu().getBrf();
						String sport=weatherBean.getHeWeather5().get(0).getSuggestion().getSport().getBrf();
						String drsg=weatherBean.getHeWeather5().get(0).getSuggestion().getDrsg().getBrf();
					
						

						mNowtempTV.setText(nowtemp);
						mCondTV.setText(cond);
						mqltyTV.setText("空气" + qlty);
						mpmTV.setText(aqi);
						mWindTV.setText(winddir);
						muv.setText(uv);
						mcw.setText(cw);
						mflu.setText(flu);
						msport.setText(sport);
						mdrsg.setText(drsg);
						if (windsc.equals("微风")) {
							mWindlTV.setText(windsc);
						} else {
							mWindlTV.setText(windsc + "级");
						}

						mHumTV.setText(Hum + "%");
						
						mTempflTV.setText(fl);
						
						List<ItemBean> list = new ArrayList<ItemBean>();
				        for (int i = 0; i < 3; i++) {
				        	int drawableId = getResources().getIdentifier("ic_"+weatherBean.getHeWeather5().get(0).getDaily_forecast().get(i).getCond().getCode_d(), 
				        			"drawable", getPackageName());
				        	String t1=weatherBean.getHeWeather5().get(0).getDaily_forecast().get(i).getCond().getTxt_d();
				        	String t2=weatherBean.getHeWeather5().get(0).getDaily_forecast().get(i).getTmp().getMax()+"/";
				        	String t3=weatherBean.getHeWeather5().get(0).getDaily_forecast().get(i).getTmp().getMin()+"℃";
				            list.add(new ItemBean(weatherBean.getHeWeather5().get(0).getDaily_forecast().get(i).getDate(),
				            		drawableId,qlty,t1,t2, t3));
				        }

				        adapter = new MyAdapter(list, MainActivity.this);
				        listView = (ListView) findViewById(R.id.id_lv);
				        listView.setVerticalScrollBarEnabled(false);
				        listView.setAdapter(adapter);

					}
				}, new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError volleyError) {
						System.out.println(volleyError);
					}
				});
		queue.add(request);
	}
	
}
