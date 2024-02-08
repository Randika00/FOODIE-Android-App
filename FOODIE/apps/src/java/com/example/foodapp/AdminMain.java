package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMain extends AppCompatActivity {

    private Button registerNowButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_main);

        registerNowButton = (Button) findViewById(R.id.main_join_now_btn);
        loginButton = (Button) findViewById(R.id.main_login_btn);

        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(AdminMain.this, AdminLogin.class);
                startActivity(intent);
            }
        });

        registerNowButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent intent = new Intent(AdminMain.this, AdminRegister.class);
                startActivity(intent);

            }

        });

    }
}