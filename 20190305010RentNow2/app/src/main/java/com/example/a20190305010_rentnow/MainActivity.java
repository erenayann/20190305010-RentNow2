package com.example.a20190305010_rentnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn2;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu=new Intent(MainActivity.this,MenuActivity.class);
                startActivity(menu);

                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(register);
            }
        });
    }
    public void tanimlama()
    {
        btn=findViewById(R.id.loginregisterbtn);
        btn2=findViewById(R.id.loginbtn);
        username=(EditText) findViewById(R.id.loginname);
        password=(EditText) findViewById(R.id.loginpassword);
    }

}