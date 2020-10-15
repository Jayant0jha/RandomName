package com.example.random_name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] names = {"Dhruv", "Tushar", "Himanshu", "Jagdish", "Jay"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public static String getRandomName(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, NameDisplay.class);
        String rnd_name = getRandomName(names);
        intent.putExtra("random_name", rnd_name);
        startActivity(intent);
    }
}