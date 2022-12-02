package com.example.doancuoiki.dangky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.doancuoiki.R;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class signup extends AppCompatActivity {

    TextInputEditText textInputEditTextFullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail,textInputEditTextPhone;
    Button buttonSignup;
    Button signup, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textInputEditTextFullname = findViewById(R.id.signame1);
        textInputEditTextUsername = findViewById(R.id.sigusername1);
        textInputEditTextPassword = findViewById(R.id.sigpassword1);
        textInputEditTextEmail = findViewById(R.id.sigemail1);
        textInputEditTextPhone = findViewById(R.id.sigphone1);

        signup = (Button) findViewById(R.id.callcreate);
        login = (Button) findViewById(R.id.CallLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
                finish();
            }

        });
    }
}