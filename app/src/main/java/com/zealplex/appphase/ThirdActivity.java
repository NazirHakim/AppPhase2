package com.zealplex.appphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mImageView =(ImageView) findViewById(R.id.companyPhone);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            mImageView.setImageResource(mBundle.getInt("companyLogo"));
        }
    }
}
