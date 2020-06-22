package com.example.override_fivemonthn.Main;


import android.os.Bundle;

import android.content.Intent;



import androidx.appcompat.app.AppCompatActivity;

import com.example.override_fivemonthn.R;
import com.example.override_fivemonthn.SharedPr;
import com.example.override_fivemonthn.presentation.intro.IntroActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isShow = SharedPr.getInstance(this).isShown();
        if (!isShow) {
            startActivity(new Intent(this, IntroActivity.class));
            finish();
            return;
        }
        setContentView(R.layout.activity_main); }}



