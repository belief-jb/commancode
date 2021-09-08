package com.example.commancode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Welcomescreen extends AppCompatActivity
{

    CheckBox checkBox;
    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);

        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Welcomescreen.this,Homescreen.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onBackPressed()
    {

        super.onBackPressed();
        finishAffinity();
    }
}


