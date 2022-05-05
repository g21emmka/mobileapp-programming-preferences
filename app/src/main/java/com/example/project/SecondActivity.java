package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button mainpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void setName(View view) {
        EditText name = findViewById(R.id.name);

        String getname = name.getText().toString();

        // Store the new preference
        SharedPreferences MyPreferences = this.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = MyPreferences.edit();
        editor.putString("name", getname);
        editor.apply();

        finish();
    }
}