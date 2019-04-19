package com.example.castpod1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_politics;
    private Button button_sports;
    private Button button_health;
    private Button button_motivational;
    private Button button_educational;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_politics=(Button)findViewById(R.id.button_politics);
        button_politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoliticalactivity();
            }
        });
        button_sports=(Button)findViewById(R.id.button_sports);
        button_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSportsactivity();
            }
        });
        button_health=(Button)findViewById(R.id.button_health);
        button_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealthactivity();
            }
        });
        button_educational=(Button)findViewById(R.id.button_educational);
        button_educational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEductionalactivity();
            }
        });
        button_motivational=(Button)findViewById(R.id.button_motivational);
        button_motivational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMotivationalactivity();
            }
        });
        logout=(Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLogout();
            }
        });

    }
    public void openPoliticalactivity(){
        Intent intent= new Intent(this,Political_main.class);
        startActivity(intent);
    }
    public void openSportsactivity(){
        Intent intent1=new Intent(this,Sports_main.class);
        startActivity(intent1);
    }
    public void openHealthactivity(){
        Intent intent1=new Intent(this,health_main.class);
        startActivity(intent1);
    }
    public void openEductionalactivity(){
        Intent intent1=new Intent(this,educational_main.class);
        startActivity(intent1);
    }
    public void openMotivationalactivity(){
        Intent intent1=new Intent(this,motivational_main.class);
        startActivity(intent1);
    }
    public void clickLogout(){
        Intent intent=new Intent(this,Login_page.class);
        startActivity(intent);
    }
}
