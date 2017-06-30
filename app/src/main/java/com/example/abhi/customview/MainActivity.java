package com.example.abhi.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnItemClickListener{

    ListView lv;
    SecondActivity lvadap;
    private final static String name[]={"Abhijith","Arpitha","Rajeev","Shivaleela","Agni","Pritvi","Vayu","Bhumi"};
    private final static String number[]={"9448943828","9448943654","9448943123","9448943890","9448943435","9448943999","9448943450","9448965428"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv);
        lvadap = new SecondActivity(this,name,number);
        System.out.println("Adapter"+lvadap.getCount());
        lv.setAdapter(lvadap);
        lv.setOnItemClickListener(this);

    }
    public void onItemClick(AdapterView<?> arg0, View arg1,int position,long id){

        Toast.makeText(this,"Title = "+name[position]+"  Details = "+number[position],Toast.LENGTH_SHORT).show();
    }

}

