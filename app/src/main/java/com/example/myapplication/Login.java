package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    private EditText user_name;
    private EditText pass;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
       user_name = (EditText) findViewById(R.id.user_name);
       pass = (EditText) findViewById(R.id.password);


            intent = new Intent(this, HomePage.class);
            startActivity(intent);


    }
        /*
        boolean validationError = false;

        StringBuilder validationErrorMessage = new StringBuilder("Please, insert ");
        if (isEmpty(user_name)) {
            validationError = true;
            validationErrorMessage.append("an username");
        }
        if (isEmpty(pass)) {
            if (validationError) {
                validationErrorMessage.append(" and ");
            }
            validationError = true;
            validationErrorMessage.append("a phone number");
        }
        validationErrorMessage.append(".");

        if (validationError) {
            Toast.makeText(this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
            return;
        }else{

        }*/
    /*
    private boolean isEmpty(EditText text) {
        if (text.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }*/
}
