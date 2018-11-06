package com.example.weather;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private List<ItemBean> list = null;

    private Context context = null;

    private LayoutInflater inflater = null;

    public MyAdapter(List<ItemBean> list, Context context) {
        this.list = list;
        this.context = context;
        // 布局装载器对象
        inflater = LayoutInflater.from(context);
    }

    // 适配器中数据集中数据的个数
    @Override
    public int getCount() {
        return list.size();
    }

    // 获取数据集中与指定索引对应的数据项
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // 获取指定行对应的ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 获取每一个Item显示的内容
    
  @Override
public View getView(int arg0, View arg1, ViewGroup arg2) {
	// TODO Auto-generated method stub
    	
	  ItemBean itemBean = list.get(arg0);

      View view = inflater.inflate(R.layout.item, null);

      TextView tv1=(TextView) view.findViewById(R.id.dateTV);
      ImageView imag=(ImageView) view.findViewById(R.id.limagIV);
      TextView tvlcond = (TextView) view.findViewById(R.id.lcodeTV);
      TextView tvlqlty = (TextView) view.findViewById(R.id.lqltyTV);
      TextView tvmax = (TextView) view.findViewById(R.id.maxTV);
      TextView tvmin = (TextView) view.findViewById(R.id.minTV);

     tv1.setText(itemBean.Itmedate);
     imag.setImageResource(itemBean.ItemImageResid);
      tvlcond.setText(itemBean.ItemContent);
      tvlqlty.setText(itemBean.ItemTitle);
      tvmax.setText(itemBean.ItmeMax);
      tvmin.setText(itemBean.ItmeMin);

      return view;
}
}
