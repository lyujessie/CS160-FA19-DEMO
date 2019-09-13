package com.example.jiexinlyu.jessiedemoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
    private static final String TAG = "NAME_ACTIVITY";

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        Log.i(TAG, name);

        mText = (TextView) findViewById(R.id.name_txt);
        mText.setText(name);
    }
}
