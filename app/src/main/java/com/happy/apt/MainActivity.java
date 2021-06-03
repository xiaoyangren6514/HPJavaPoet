package com.happy.apt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.happy.prouter_annotations.PRouter;

@PRouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpThree(View view) {
        Class targetClass = MainActivity3$$$$$$$$PRouter.findTargetClass("/app/MainActivity3");
        Intent intent = new Intent(this,targetClass);
        startActivity(intent);
    }
}