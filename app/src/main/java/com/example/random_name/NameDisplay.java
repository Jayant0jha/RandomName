package com.example.random_name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);
        Intent intent = getIntent();
        String name = intent.getStringExtra("random_name");
        TextView tvName = (TextView)findViewById(R.id.display_name);
        tvName.setText(name);
    }
}