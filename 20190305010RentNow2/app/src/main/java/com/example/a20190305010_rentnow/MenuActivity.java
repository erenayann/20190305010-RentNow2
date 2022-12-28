package com.example.a20190305010_rentnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button btn,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tanimlama();

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit=new Intent(MenuActivity.this,MainActivity.class);
                startActivity(exit);

                Toast.makeText(MenuActivity.this, "Exit Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about=new Intent(MenuActivity.this,AboutActivity.class);
                startActivity(about);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cars=new Intent(MenuActivity.this,CarsActivity.class);
                startActivity(cars);
            }
        });
    }
    public void tanimlama()
    {
        btn=findViewById(R.id.carsbtn);
        btn2=findViewById(R.id.aboutbtn);
        btn3=findViewById(R.id.exitbtn);
    }
}