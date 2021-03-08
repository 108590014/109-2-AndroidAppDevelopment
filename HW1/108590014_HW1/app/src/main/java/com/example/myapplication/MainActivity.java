package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.d("Q1", "MainActivity.java");
        Log.d("Q2", "android:name");
        Log.d("Q3", "AVD Manager");
        Log.d("Q4", "Verbose and Info");
    }


}