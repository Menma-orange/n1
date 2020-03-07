package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class news extends AppCompatActivity {

    Button menu;
    Button profile;
    Button group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void menu(View v){

        menu = (Button)findViewById(R.id.button7);
        startActivity(new Intent(news.this, menu.class));
    }

    public void profile(View v) {

        profile = (Button)findViewById(R.id.button9);
        startActivity(new Intent(news.this, profile.class));
    }

    public void group(View v){

        group = (Button)findViewById(R.id.button8);
        startActivity(new Intent(news.this, group.class));
    }
}
