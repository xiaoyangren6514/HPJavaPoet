package com.happy.apt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.happy.prouter_annotations.PRouter;

@PRouter(path = "/app/MainActivity3")
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}