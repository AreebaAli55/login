package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class simple extends AppCompatActivity {
   ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
      backarrow = findViewById(R.id.backarrow);
      backarrow.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i2= new Intent(simple.this , MainActivity.class);
              startActivity(i2);
          }
      });

    }
}