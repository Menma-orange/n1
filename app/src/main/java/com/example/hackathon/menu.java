package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button news;
    Button profile;
    Button group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void news(View v){

        news = (Button)findViewById(R.id.news);
        startActivity(new Intent(menu.this, news.class));

    }

    public void profile(View v){

        profile = (Button)findViewById(R.id.button4);
        startActivity(new Intent(menu.this, profile.class));
    }

    public void group(View v){

        group = (Button)findViewById(R.id.button3);
        startActivity(new Intent(menu.this, group.class));
    }
}
