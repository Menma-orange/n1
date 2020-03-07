package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class group extends AppCompatActivity {

    Button profile;
    Button menu;
    Button news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
    }

    public void profile(View v){

        profile = (Button)findViewById(R.id.button22);
        startActivity(new Intent(group.this, profile.class));
    }

    public void menu(View v){

        menu = (Button)findViewById(R.id.button31);
        startActivity(new Intent(group.this, menu.class));
    }

    public void news(View v){

        news = (Button)findViewById(R.id.button20);
        startActivity(new Intent(group.this, news.class));
    }
}
