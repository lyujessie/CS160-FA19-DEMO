package com.example.jiexinlyu.jessiedemoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    Button mNextButton;
    TextView mText;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.submit_bt);
        mNextButton = (Button) findViewById(R.id.next_bt);
        mText = (TextView) findViewById(R.id.submit_txt);
        mEditText = (EditText) findViewById(R.id.input_txt);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText(R.string.popup_txt);
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, NameActivity.class);
                intent.putExtra("NAME", name);
                startActivity(intent);
            }
        });
    }
}
