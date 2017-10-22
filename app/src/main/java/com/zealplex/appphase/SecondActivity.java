package com.zealplex.appphase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SecondActivity extends AppCompatActivity {

     String items[] = new String[] {"section01_data01", "section01_data02", "section01_data03",
             "section01_data04", "section01_data05","section01_data06", "section01_data07"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView listview = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SecondActivity.this,android.R.layout.simple_selectable_list_item,items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class ));
            }
        });
    }


}
