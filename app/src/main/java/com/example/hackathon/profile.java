package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {

    Button menu;
    Button news;
    Button group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void menu(View v) {
        menu = (Button)findViewById(R.id.button23);
        startActivity(new Intent(profile.this, menu.class));
    }

    public void news(View v)
    {
        news = (Button)findViewById(R.id.button25);
        startActivity(new Intent(profile.this, news.class));
    }

    public void group(View v){

        group = (Button)findViewById(R.id.button24);
        startActivity(new Intent(profile.this, group.class));
    }
}
