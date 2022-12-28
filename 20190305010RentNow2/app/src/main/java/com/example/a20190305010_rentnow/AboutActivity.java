package com.example.a20190305010_rentnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tanimlama();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back= new Intent(AboutActivity.this,MenuActivity.class);
                startActivity(back);
            }
        });
    }
    public void tanimlama()
    {
        btn=findViewById(R.id.backbtn);
    }
}