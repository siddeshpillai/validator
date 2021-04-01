package com.darkskymobs.libtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darkskymobs.testlibrary.ValidateTor;

public class MainActivity extends AppCompatActivity {

    private ValidateTor validateTor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validateTor = new ValidateTor();
        System.out.println("OGG " + validateTor.isEmpty("lala"));
    }
}