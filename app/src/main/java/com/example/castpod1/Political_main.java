package com.example.castpod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Political_main extends AppCompatActivity {
    private Button politicalparty,politicalgabfest,axefiles,politicaljunkie,kenrudin,stammstisch,somethingsoff,politicalbreakdown,considerthis,slugnuts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political_main);
        politicalparty=(Button)findViewById(R.id.button_political_politicalparty);
        politicalparty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpoliticalparty();
            }
        });
        politicalgabfest=(Button)findViewById(R.id.button_political_politicalgabfest);
        politicalgabfest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpoliticalgabfest();
            }
        });
        axefiles=(Button)findViewById(R.id.button_political_axefiles);
        axefiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickaxefiles();
            }
        });
        politicaljunkie=(Button)findViewById(R.id.button_political_politicaljunkie);
        politicaljunkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpoliticaljunkie();
            }
        });
        kenrudin=(Button)findViewById(R.id.button_political_kenrudin);
        kenrudin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickkenrudin();
            }
        });
        stammstisch=(Button)findViewById(R.id.button_political_stammstisch);
        stammstisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickStammstisch();
            }
        });
        somethingsoff=(Button)findViewById(R.id.button_political_somethingsoff);
        somethingsoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicksomethingsoff();
            }
        });
        politicalbreakdown=(Button)findViewById(R.id.button_political_politicalbreakdown);
        politicalbreakdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickpoliticalbreakdown();
            }
        });
        considerthis=(Button)findViewById(R.id.button_political_considerthis);
        considerthis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickconsiderthis();
            }
        });
        slugnuts=(Button)findViewById(R.id.button_political_slugnuts);
        slugnuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSlugnuts();
            }
        });
    }
    public void clickpoliticalgabfest() {
        Intent intent = new Intent(this, Political_PoliticalGabfest_page.class);
        startActivity(intent);
    }
    public void clickpoliticalparty() {
        Intent intent = new Intent(this, Political_PoliticalParty_page.class);
        startActivity(intent);
    }
    public void clickaxefiles() {
        Intent intent = new Intent(this, Political_Axefiles_page.class);
        startActivity(intent);
    }
    public void clickpoliticaljunkie() {
        Intent intent = new Intent(this, Political_PoliticalJunkie_page.class);
        startActivity(intent);
    }
    public void clickkenrudin() {
        Intent intent = new Intent(this, Political_KenRudin_page.class);
        startActivity(intent);
    }
    public void clickStammstisch() {
        Intent intent = new Intent(this, Political_Stammstisch_page.class);
        startActivity(intent);
    }
    public void clicksomethingsoff() {
        Intent intent = new Intent(this, Political_SomethingsOff_page.class);
        startActivity(intent);
    }
    public void clickpoliticalbreakdown() {
        Intent intent = new Intent(this, Political_PoliticalBreakdown_page.class);
        startActivity(intent);
    }
    public void clickconsiderthis() {
        Intent intent = new Intent(this, Political_ConsiderThis_page.class);
        startActivity(intent);
    }
    public void clickSlugnuts() {
        Intent intent = new Intent(this, Political_Slugnuts_page.class);
        startActivity(intent);
    }

}
