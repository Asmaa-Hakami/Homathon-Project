package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void withGoogle(View view) {
        intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
    public void signup(View view) {
        intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void createAcc(View view) {
        intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
