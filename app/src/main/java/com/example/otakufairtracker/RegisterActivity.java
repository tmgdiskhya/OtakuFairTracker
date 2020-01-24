package com.example.otakufairtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
TextView tvStarted,tvFullname,tvUsername, tvEmail, tvPassword,tvAlready;
EditText etFullname,etUsername,etEmail,etPassword;
Button btnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvStarted=findViewById(R.id.tvStarted);
        tvFullname=findViewById(R.id.tvFullname);
        tvUsername=findViewById(R.id.tvUsername);
        tvEmail=findViewById(R.id.tvEmail);
        tvPassword=findViewById(R.id.tvPassword);
        tvAlready=findViewById(R.id.tvAlready);
        etFullname=findViewById(R.id.etFullname);
        etUsername=findViewById(R.id.etUsername);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnAccount=findViewById(R.id.btnAccount);
    }
}
