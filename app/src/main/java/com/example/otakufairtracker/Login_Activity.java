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

import com.example.otakufairtracker.api.UserApi;
import com.example.otakufairtracker.model.User;
import com.example.otakufairtracker.serverResponse.LoginSignupResponse;
import com.example.otakufairtracker.url.url;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
//                loginBll loginBll = new loginBll();
//                StrictMode.StrictMode();
//                boolean check = loginBll.checkUser(username, password);
        User user = new User(username, password);
        UserApi userApi = url.getInstance().create(UserApi.class);
        Call<LoginSignupResponse> call = userApi.checkUser(user);
        call.enqueue(new Callback<LoginSignupResponse>() {
            @Override
            public void onResponse(Call<LoginSignupResponse> call, Response<LoginSignupResponse> response) {
                if(response.body().getStatus()){
                    Toast.makeText(Login_Activity.this, "login Successful ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login_Activity.this, "Either Username or Password is Incorrect ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginSignupResponse> call, Throwable t) {
                Toast.makeText(Login_Activity.this, "login UnSuccessful "+t, Toast.LENGTH_SHORT).show();

            }
        });


    }
}

