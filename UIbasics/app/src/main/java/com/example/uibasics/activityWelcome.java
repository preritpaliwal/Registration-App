package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activityWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String Name = getIntent().getStringExtra("name");
        String Rollno = getIntent().getStringExtra("rollno");
        TextView name = findViewById(R.id.name);
        TextView rollno = findViewById(R.id.rollno);
        name.setText("Welcome " + Name);
        rollno.setText((Rollno));
    }
}