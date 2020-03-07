package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registr extends AppCompatActivity {

    Button Button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
    }

    public void click1(View v0){
        Button1 = (Button) findViewById(R.id.button);
        startActivity(new Intent(registr.this, menu.class));
    }
}
