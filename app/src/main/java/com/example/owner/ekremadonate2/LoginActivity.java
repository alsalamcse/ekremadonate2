package com.example.owner.ekremadonate2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {


    private EditText email;
    private EditText password1;
    private Button signin;
    private Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser()!=null && auth.getCurrentUser().getEmail()!=null)
        {
            Intent intent=new Intent(String.valueOf( LoginActivity.this));

        }


        email = (EditText) findViewById(R.id.email);
       // password1 = (EditText) findViewById(R.id.password1);
        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent( LoginActivity.this, SignupActivity.class);
                startActivity(i1);


            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent( LoginActivity.this, SignupActivity.class);
                startActivity(i2);



            }
        });
    }
    }
