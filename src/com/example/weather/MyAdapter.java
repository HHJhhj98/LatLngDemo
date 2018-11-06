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
        // ����װ��������
        inflater = LayoutInflater.from(context);
    }

    // �����������ݼ������ݵĸ���
    @Override
    public int getCount() {
        return list.size();
    }

    // ��ȡ���ݼ�����ָ��������Ӧ��������
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // ��ȡָ���ж�Ӧ��ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    // ��ȡÿһ��Item��ʾ������
    
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
