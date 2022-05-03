package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView textViewName;

    SharedPreferences.Editor editor=

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewName = findViewById(R.id.name);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        String name = preferences.getString("name", "inget namn hittat");
        textViewName .setText(name);
    }
}
