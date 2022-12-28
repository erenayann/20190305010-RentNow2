package com.example.a20190305010_rentnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    Button btn,btn2;
    EditText username,password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tanimlama();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "Register Successful", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alreadyhaveaccount=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(alreadyhaveaccount);
            }
        });
    }
    public void tanimlama()
    {
       btn=findViewById(R.id.registerbtn);
       btn2=findViewById(R.id.alreadyhaveaccountbtn);
       username=(EditText) findViewById(R.id.registername);
       password=(EditText) findViewById(R.id.registerpassword);
       email=(EditText) findViewById(R.id.registeremail);
    }
}