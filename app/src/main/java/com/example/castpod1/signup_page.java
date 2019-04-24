package com.example.castpod1;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup_page extends AppCompatActivity {
    Button register;
    EditText full_name,email_id,pssword,confirm_password;
    RadioGroup gender;
    ProgressBar progress;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        register=(Button)findViewById(R.id.register);
        full_name=(EditText)findViewById(R.id.full_name);
        email_id=(EditText)findViewById(R.id.email_id);
        pssword=(EditText)findViewById(R.id.password);
        confirm_password=(EditText)findViewById(R.id.confirm_password);
        gender=(RadioGroup)findViewById(R.id.gender);
        progress=(ProgressBar)findViewById(R.id.progress_bar);
        FirebaseApp.initializeApp(this);

        firebaseAuth=FirebaseAuth.getInstance();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String txt_email_id=email_id.getText().toString().trim();
               String txt_password=pssword.getText().toString().trim();
               String txt_name=full_name.getText().toString().trim();
               String txt_confirm_password=confirm_password.getText().toString().trim();
               if(TextUtils.isEmpty(txt_email_id)){
                   Toast.makeText(signup_page.this, "Please enter email-id", Toast.LENGTH_SHORT).show();
                   return;
               }
                if(TextUtils.isEmpty(txt_password)){
                    Toast.makeText(signup_page.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(txt_confirm_password)){
                    Toast.makeText(signup_page.this, "Please confirm the password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(txt_name)){
                    Toast.makeText(signup_page.this, "Please enter name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(txt_password.length()<6){
                    Toast.makeText(signup_page.this, "Password too short", Toast.LENGTH_SHORT).show();

                }
                progress.setVisibility(View.VISIBLE);
                if(txt_password.equals(txt_confirm_password)){
                    firebaseAuth.createUserWithEmailAndPassword(txt_email_id, txt_password)
                            .addOnCompleteListener(signup_page.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                   progress.setVisibility(View.GONE);

                                    if (task.isSuccessful()) {
                                        Toast.makeText(signup_page.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                                        Register();

                                    } else {
                                        Toast.makeText(signup_page.this, "Authentication failed", Toast.LENGTH_SHORT).show();

                                    }

                                    // ...
                                }
                            });

                }


            }
        });
    }
    public void Register(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
