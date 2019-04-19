package com.example.castpod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class motivational_main extends AppCompatActivity {
    private Button quoteoftheday,motivationalhigh5,motivationalmoments,motivationalmonday,betteru,mindsetandmotivation,motivationalvibes,chillmurray,motivationalimpact,dailyboost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational_main);
        quoteoftheday=(Button)findViewById(R.id.button_motivational_quoteoftheday);
        quoteoftheday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickquoteoftheday();
            }
        });
        motivationalhigh5=(Button)findViewById(R.id.button_motivational_motivationalhigh5);
        motivationalhigh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmotivationalhigh5();
            }
        });
        motivationalmoments=(Button)findViewById(R.id.button_motivational_motivationalmoments);
        motivationalmoments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmotivationalmoments();
            }
        });
        motivationalmonday=(Button)findViewById(R.id.button_motivational_motivationalmonday);
        motivationalmonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmotivationalmonday();
            }
        });
        betteru=(Button)findViewById(R.id.button_motivational_betteru);
        betteru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickbetteru();
            }
        });
        mindsetandmotivation=(Button)findViewById(R.id.button_motivational_mindsetandmotivation);
        mindsetandmotivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmindsetandmotivation();
            }
        });
        motivationalvibes=(Button)findViewById(R.id.button_motivational_motivationalvibes);
        motivationalvibes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmotivationalvibes();
            }
        });
        chillmurray=(Button)findViewById(R.id.button_motivational_chillmurray);
        chillmurray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickchillmurray();
            }
        });
        motivationalimpact=(Button)findViewById(R.id.button_motivational_motivationalimpact);
        motivationalimpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmotivationalimpact();
            }
        });
        dailyboost=(Button)findViewById(R.id.button_motivational_dailyboost);
        dailyboost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickdailyboost();
            }
        });
    }
    public void clickquoteoftheday() {
        Intent intent = new Intent(this, Motivational_QuoteOfTheDay_page.class);
        startActivity(intent);
    }
    public void clickmotivationalhigh5() {
        Intent intent = new Intent(this, Motivational_MotivationalHigh5_page.class);
        startActivity(intent);
    }
    public void clickmotivationalmoments() {
        Intent intent = new Intent(this, Motivational_MotivationalMoments_page.class);
        startActivity(intent);
    }
    public void clickmotivationalmonday() {
        Intent intent = new Intent(this, Motivational_MotivationalMonday_page.class);
        startActivity(intent);
    }
    public void clickbetteru() {
        Intent intent = new Intent(this, Motivational_BetterU_page.class);
        startActivity(intent);
    }
    public void clickmindsetandmotivation() {
        Intent intent = new Intent(this, Motivational_MindSetAndMotivation_page.class);
        startActivity(intent);
    }
    public void clickmotivationalvibes() {
        Intent intent = new Intent(this, Motivational_MotivationalVibes_page.class);
        startActivity(intent);
    }
    public void clickchillmurray() {
        Intent intent = new Intent(this, Motivational_ChillMurray_page.class);
        startActivity(intent);
    }
    public void clickmotivationalimpact() {
        Intent intent = new Intent(this, Motivational_MotivationalImpact_page.class);
        startActivity(intent);
    }
    public void clickdailyboost() {
        Intent intent = new Intent(this, Motivational_DailyBoost_page.class);
        startActivity(intent);
    }

}
