package com.example.castpod1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_page extends AppCompatActivity {
    Button login,register;
    EditText login_email,login_password;
    private FirebaseAuth firebaseAuth;
    LinearLayout loginactivity;
    AnimationDrawable animationdrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginactivity=(LinearLayout)findViewById(R.id.loginactivity);
        animationdrawable=(AnimationDrawable)loginactivity.getBackground();
        animationdrawable.setEnterFadeDuration(4500);
        animationdrawable.setExitFadeDuration(4500);
        animationdrawable.start();
        login=(Button)findViewById(R.id.login);
        login_email=(EditText)findViewById(R.id.login_email_id);
        login_password=(EditText)findViewById(R.id.login_password);
        register=(Button)findViewById(R.id.register);
        FirebaseApp.initializeApp(this);

        firebaseAuth=FirebaseAuth.getInstance();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=login_email.getText().toString().trim();
                String password=login_password.getText().toString().trim();


                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Login_page.this, "Please enter email-id", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Login_page.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Login_page.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    clicklogin();

                                } else {
                                    Toast.makeText(Login_page.this, "Login failed.Wrong Email-id or Password", Toast.LENGTH_SHORT).show();

                                }

                            }
                        });
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRegister();
            }
        });
    }
    public void clicklogin()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void clickRegister()
    {
        Intent intent=new Intent(this,signup_page.class);
        startActivity(intent);
    }
}
