package com.example.a20190305010_rentnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CarsActivity extends AppCompatActivity {
    Button btn,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
        tanimlama();

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CarsActivity.this, "Rent is Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CarsActivity.this, "Rent is Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CarsActivity.this, "Rent is Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(CarsActivity.this,MenuActivity.class);
                startActivity(back);
            }
        });
    }
    public void tanimlama()
    {
        btn=findViewById(R.id.backbtn);
        btn2=findViewById(R.id.rent1);
        btn3=findViewById(R.id.rent2);
        btn4=findViewById(R.id.rent3);

    }
}