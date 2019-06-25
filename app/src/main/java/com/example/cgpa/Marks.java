package com.example.cgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        Intent intent = getIntent();
        TextView marks = (TextView)findViewById(R.id.message);
        marks.setText(Double.toString(intent.getDoubleExtra("Marks", 0.0)));
    }
}
