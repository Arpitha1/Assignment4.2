package com.example.abhi.customview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SecondActivity extends BaseAdapter {

    Activity context;
    String title[];
    String details[];

public SecondActivity(Activity context,String[] title,String[] details){

    super();
    this.context=context;
    this.title=title;
    this.details=details;
}
public int getCount(){
    return title.length;
}
public Object getItem(int position){
    return null;
}
public long getItemId(int postion){
    return 0;
}
public class ViewHolder{
    TextView txtTit;
    TextView txtdes;
}
public View getView(int position, View convertView,ViewGroup parent){
ViewHolder holder;
    LayoutInflater inflater = context.getLayoutInflater();
if(convertView==null){
convertView = inflater.inflate(R.layout.activity_second,null);
holder = new ViewHolder();
holder.txtTit=(TextView)convertView.findViewById(R.id.tv);
holder.txtdes=(TextView)convertView.findViewById(R.id.tv1);
convertView.setTag(holder);
}
else
{
holder=(ViewHolder)convertView.getTag();
}
holder.txtTit.setText(title[position]);
holder.txtdes.setText(details[position]);
return convertView;
}
}