package com.zealplex.appphase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SecondActivity extends AppCompatActivity {

    ListView mListView;

     String[] companyNames = {"Apple", "Samsung", "Google Pixel", "One Plus",
             "Oppo", "Vivo","Huawei", "Lava"};
     int[] companyLogo = {R.drawable.applelogo,
             R.drawable.samsunglogog,
             R.drawable.googlelogo,
             R.drawable.onepluslogo,
             R.drawable.oppologo,
             R.drawable.vivologo,
             R.drawable.huaweilogo,
             R.drawable.lavalogo
     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mListView =(ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(SecondActivity.this, companyNames, companyLogo);
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent mIntent = new Intent(SecondActivity.this, ThirdActivity.class );
                mIntent.putExtra("companyName", companyNames[position]);
                mIntent.putExtra("companyLogo", companyLogo[position]);
                startActivity(mIntent);

            }
        });
    }


}
