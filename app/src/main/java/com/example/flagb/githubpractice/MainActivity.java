package com.example.flagb.githubpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        editText = (EditText) findViewById(R.id.textview1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
