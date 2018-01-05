package com.engashraf.toastlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.engashraf.mytoastlib.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SimpleToast.showForLongTime(getApplicationContext() , "This is Long Toast");
    }
}
