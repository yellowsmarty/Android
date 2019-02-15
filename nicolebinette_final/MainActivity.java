package com.hfad.nicoleampornbinette.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> sources = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = getIntent();
//        if (intent != null) {
//            String source = intent.getStringExtra("source");
//            sources.add(source);
//            Spinner spinner = findViewById(R.id.spinner);
//            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, sources);
//            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spinner.setAdapter(arrayAdapter);
//        }

    }

    public void onClickButton(View view) {
        Intent intent = new Intent(this, MoveMakerActivity.class);
        startActivity(intent);
    }
}
