package com.example.castpod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_main extends AppCompatActivity {
    private Button inspirenation,insidehealth,sigmanutrition,shguggedcollection,wisetradition,richpoll,modelhealth,savvypsychologist,lifedesign,halfsizeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_main);
        insidehealth=(Button)findViewById(R.id.button_health_insidehealth);
        insidehealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickInsideHealth();
            }
        });
        inspirenation=(Button)findViewById(R.id.button_health_inspirenation);
        inspirenation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickInspireNation();
            }
        });
        sigmanutrition=(Button)findViewById(R.id.button_health_sigmanutrition);
        sigmanutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSigmaNutrition();
            }
        });
        shguggedcollection=(Button)findViewById(R.id.button_health_shruggedcollective);
        shguggedcollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickShruggedCollective();
            }
        });
        wisetradition=(Button)findViewById(R.id.button_health_wisetraditions);
        wisetradition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickWiseTradition();
            }
        });
        richpoll=(Button)findViewById(R.id.button_health_richpoll);
        richpoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRichPoll();
            }
        });
        modelhealth=(Button)findViewById(R.id.button_health_modelhealth);
       modelhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickModelHealth();
            }
        });
        savvypsychologist=(Button)findViewById(R.id.button_health_savvypsychocologist);
        savvypsychologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSavvyPsychologist();
            }
        });
        lifedesign=(Button)findViewById(R.id.button_health_lifedesign);
        lifedesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLifeDesign();
            }
        });
        halfsizeme=(Button)findViewById(R.id.button_health_halfsizeme);
        halfsizeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHalfSizeMe();
            }
        });
    }
    public void clickInspireNation() {
        Intent intent = new Intent(this, Health_InspireNation_page.class);
        startActivity(intent);
    }
    public void clickInsideHealth() {
        Intent intent = new Intent(this, Health_InsideHealth_page.class);
        startActivity(intent);
    }
    public void clickSigmaNutrition() {
        Intent intent = new Intent(this, Health_SigmaNutrition_page.class);
        startActivity(intent);
    }
    public void clickShruggedCollective() {
        Intent intent = new Intent(this, Health_ShruggedCollective_page.class);
        startActivity(intent);
    }
    public void clickWiseTradition() {
        Intent intent = new Intent(this, Health_WiseTradition_page.class);
        startActivity(intent);
    }
    public void clickRichPoll() {
        Intent intent = new Intent(this, Health_RichPoll_page.class);
        startActivity(intent);
    }
    public void clickModelHealth() {
        Intent intent = new Intent(this, Health_ModelHealth_page.class);
        startActivity(intent);
    }
    public void clickSavvyPsychologist() {
        Intent intent = new Intent(this, Health_SavvyPssychologist_page.class);
        startActivity(intent);
    }
    public void clickLifeDesign() {
        Intent intent = new Intent(this, Health_LifeDesign_page.class);
        startActivity(intent);
    }
    public void clickHalfSizeMe() {
        Intent intent = new Intent(this, Health_HalfSizeMe_page.class);
        startActivity(intent);
    }

}
