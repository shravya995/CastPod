package com.example.castpod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class educational_main extends AppCompatActivity {
    private Button almosteducational,psyched,educationalducktape,teachercast,techeducator,youngshow,specialeducationalneeds,psychology,tomfitton,aromaculture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_main);
        almosteducational=(Button)findViewById(R.id.button_educational_almosteducational);
        almosteducational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickalmosteducational();
            }
        });
        psyched=(Button)findViewById(R.id.button_educational_psyched);
        psyched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpsyched();
            }
        });
        educationalducktape=(Button)findViewById(R.id.button_educational_eduducktape);
        educationalducktape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickeducationalducktape();
            }
        });
        teachercast=(Button)findViewById(R.id.button_educational_teachercast);
        teachercast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickteachercast();
            }
        });
        techeducator=(Button)findViewById(R.id.button_educational_techteacher);
        techeducator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicktecheducator();
            }
        });
        youngshow=(Button)findViewById(R.id.button_educational_youngshow);
        youngshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickyoungshow();
            }
        });
        specialeducationalneeds=(Button)findViewById(R.id.button_educational_specialeducational);
        specialeducationalneeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickspecialeducationalneeds();
            }
        });
        psychology=(Button)findViewById(R.id.button_educational_psychocology);
        psychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpsychology();
            }
        });
        tomfitton=(Button)findViewById(R.id.button_educational_topfitton);
        tomfitton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicktomfitton();
            }
        });
        aromaculture=(Button)findViewById(R.id.button_educational_aromaculture);
        aromaculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickaromaculture();
            }
        });
    }
    public void clickalmosteducational() {
        Intent intent = new Intent(this, Educational_AlmostEducational_page.class);
        startActivity(intent);
    }
    public void clickpsyched() {
        Intent intent = new Intent(this, Educational_Psyched_page.class);
        startActivity(intent);
    }
    public void clickeducationalducktape() {
        Intent intent = new Intent(this, Educational_EducationalDucktape_page.class);
        startActivity(intent);
    }
    public void clickteachercast() {
        Intent intent = new Intent(this, Educational_TeacherCast_page.class);
        startActivity(intent);
    }
    public void clicktecheducator() {
        Intent intent = new Intent(this, Educational_TechEducator_page.class);
        startActivity(intent);
    }
    public void clickyoungshow() {
        Intent intent = new Intent(this, Educational_YoungShow_page.class);
        startActivity(intent);
    }
    public void clickspecialeducationalneeds() {
        Intent intent = new Intent(this, Educational_SpecialEducationalNeeds_page.class);
        startActivity(intent);
    }
    public void clickpsychology() {
        Intent intent = new Intent(this, Educational_Psychology_page.class);
        startActivity(intent);
    }
    public void clicktomfitton() {
        Intent intent = new Intent(this, Educational_TopFitton_page.class);
        startActivity(intent);
    }
    public void clickaromaculture() {
        Intent intent = new Intent(this, Educational_AromaCulture_page.class);
        startActivity(intent);
    }

}
