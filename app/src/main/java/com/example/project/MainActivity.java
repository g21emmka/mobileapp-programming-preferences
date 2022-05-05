package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView textViewName;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewName = findViewById(R.id.name);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences MyPreferences = this.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        String name = MyPreferences.getString("name", "inget namn hittat");
        textViewName.setText(name);


    }

}

