package com.Karthikdevadiga.udupihotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    CardView starter_menu;
    CardView main_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starter_menu = findViewById(R.id.starters_cardview);
        main_menu = findViewById(R.id.main_cardview);
        TextView launcherEmailAdress=findViewById(R.id.official_email_id);
        CardView desert_menu=findViewById(R.id.desert_cardview);


        starter_menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent StarterActivityIntent = new Intent(MainActivity.this, StartersActivity2.class);
                startActivity(StarterActivityIntent);
            }
        });

        main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent MainActivityIntent = new Intent(MainActivity.this, MaincourseActivity.class);
                startActivity(MainActivityIntent);
            }
        });
        launcherEmailAdress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailIntent.setData(Uri.parse("mailto:udupihotel@Karthikdevadiga.com"));
                startActivity(launchEmailIntent);
            }
        });

        desert_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DesertActivityIntent= new Intent(MainActivity.this,DesertActivity.class);
                startActivity(DesertActivityIntent);
            }
        });



    }
}