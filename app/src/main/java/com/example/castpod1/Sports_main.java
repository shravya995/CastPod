package com.example.castpod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports_main extends AppCompatActivity {

    private Button michiganbutton;
    private Button dellabutton;
    private Button livespecialsbutton;
    private Button sportspsychshow;
    private Button whaticallsportsbutton;
    private Button digdeepbutton;
    private Button howiegamesbutton;
    private Button newsstalkbutton;
    private Button gegenpodbutton;
    private Button footballramblebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_main);

        michiganbutton=(Button)findViewById(R.id.button_sports_michigan);
        dellabutton=(Button)findViewById(R.id.button_sports_della);
        livespecialsbutton=(Button)findViewById(R.id.button_sports_5livespecias);
        sportspsychshow=(Button)findViewById(R.id.button_sports_SportsPsychShow);
        whaticallsportsbutton=(Button)findViewById(R.id.button_sports_whatiacallsports);
        digdeepbutton=(Button)findViewById(R.id.button_sports_digdeep);
        howiegamesbutton=(Button)findViewById(R.id.button_sports_howieGames);
        footballramblebutton=(Button)findViewById(R.id.button_sports_footballramble);
        newsstalkbutton=(Button)findViewById(R.id.button_sports_newstalkbreakfast);
        gegenpodbutton=(Button)findViewById(R.id.button_sports_gegenpod);
        michiganbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickMichiganRadio();
            }
        });
        dellabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDella();
            }
        });
        livespecialsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLiveSpecials();
            }
        });
        whaticallsportsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickwhatIcallsports();
            }
        });
        sportspsychshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSportsPsychShow();
            }
        });
        digdeepbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickdigdeep();
            }
        });
        howiegamesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickhowiegames();
            }
        });
        footballramblebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickfootballramble();
            }
        });
        newsstalkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicknewsstalk();
            }
        });
        gegenpodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickgegenpod();
            }
        });


    }

    public void clickMichiganRadio(){
        Intent intent=new Intent(this,Sports_michigan_page.class);
        startActivity(intent);
    }
    public void clickDella(){
        Intent intent=new Intent(this,Sports_dellaSports_page.class);
        startActivity(intent);
    }
    public void clickLiveSpecials(){
        Intent intent=new Intent(this,Sports_5LiveSportsSpecial_page.class);
        startActivity(intent);
    }
    public void clickSportsPsychShow(){
        Intent intent=new Intent(this,Sports_sportsPsychShow.class);
        startActivity(intent);
    }
    public void clickwhatIcallsports(){
        Intent intent=new Intent(this,Sports_WhatICallSports_page.class);
        startActivity(intent);
    }
    public void clickdigdeep(){
        Intent intent=new Intent(this,Sports_DigDeep_page.class);
        startActivity(intent);
    }
    public void clickhowiegames(){
        Intent intent=new Intent(this,Sports_HowieGames_page.class);
        startActivity(intent);
    }
    public void clickfootballramble(){
        Intent intent=new Intent(this,Sports_FootballRamble_page.class);
        startActivity(intent);
    }
    public void clicknewsstalk(){
        Intent intent=new Intent(this,Sports_NewsStalk_page.class);
        startActivity(intent);
    }
    public void clickgegenpod(){
        Intent intent=new Intent(this,Sports_Gegenpod_page.class);
        startActivity(intent);
    }

}

