package com.example.aidietician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("AI DIETICIAN");
    }

    public void onSignupClick(View v1){
        startActivity(new Intent(this,Signup.class));
    }

    public void onbtnLoginClicked(View v2){
        startActivity(new Intent(this,Home2.class));
    }
}