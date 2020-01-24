package com.example.otakufairtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.otakufairtracker.api.UserApi;
import com.example.otakufairtracker.model.User;
import com.example.otakufairtracker.serverResponse.LoginSignupResponse;
import com.example.otakufairtracker.url.url;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
TextView tvStarted,tvFullname,tvUsername, tvEmail, tvPassword,tvAlready;
EditText etFullname,etUsername,etEmail,etPassword;
Button btnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etFullname = findViewById(R.id.etFullname);
        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnAccount = findViewById(R.id.btnAccount);

        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = etFullname.getText().toString();
                String email = etEmail.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                User user = new User(fullName, username, email, password);

                UserApi userApi = url.getInstance().create(UserApi.class);
                Call<LoginSignupResponse> call = userApi.registerUser(user);
                call.enqueue(new Callback<LoginSignupResponse>() {
                    @Override
                    public void onResponse(Call<LoginSignupResponse> call, Response<LoginSignupResponse> response) {
                        if (response.body().getStatus()) {
                            Toast.makeText(RegisterActivity.this, "Signed Up Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(RegisterActivity.this, "Can't Signup", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginSignupResponse> call, Throwable t) {
                        Toast.makeText(RegisterActivity.this, "Error: " + t, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
