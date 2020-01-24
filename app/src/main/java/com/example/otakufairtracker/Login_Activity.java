package com.example.otakufairtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;
    private TextView tvSentence;
    private ImageView ivOtakuimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        tvSentence=findViewById(R.id.tvSentence);
        ivOtakuimg=findViewById(R.id.ivOtakuimg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login(){
        SharedPreferences sharedPreferences = getSharedPreferences("User", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        String password = sharedPreferences.getString("password", "");
        if (username.equals(etUsername.getText().toString())||
                password.equals(etPassword.getText().toString())){
            Toast.makeText(Login_Activity.this, "Successful",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(Login_Activity.this, "Either Username or Password you have typed is incorrect",
                    Toast.LENGTH_SHORT).show();
        }

    }
}

