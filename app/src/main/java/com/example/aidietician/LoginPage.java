package com.example.aidietician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        //getSupportActionBar().hide();
    }

    public void onSignupClick(View v1){
        startActivity(new Intent(this,Signup.class));
        //finish();
    }

    public void onbtnLoginClicked(View v2){
        startActivity(new Intent(this,Homepage.class));
        //finish();
    }

}