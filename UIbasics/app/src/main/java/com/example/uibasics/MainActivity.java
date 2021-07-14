package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toDO(View view) {
        Toast.makeText(this,"you have been successfully enrolled",Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,activityWelcome.class);
        EditText name = findViewById(R.id.Name);
        EditText rollno = findViewById(R.id.Rollno);
        intent.putExtra("name",name.getText().toString());
        intent.putExtra("rollno",rollno.getText().toString());
        startActivity(intent);
    }
}