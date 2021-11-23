package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Drawable drawable,drawable2;
    ImageView imagen1,imagen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button button1;
        Button button2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Resources res = getResources();
        Resources res2 = getResources();

        drawable = res.getDrawable(R.drawable.servicio1,getTheme());
        drawable2 = res2.getDrawable(R.drawable.servicio2,getTheme());

        imagen1 = (ImageView) findViewById(R.id.servicio1);
        imagen1.setImageDrawable(drawable);

        imagen2 = (ImageView) findViewById(R.id.servicio2);
        imagen2.setImageDrawable(drawable2);

        button1 =  (Button)   findViewById(R.id.reservar1);
        button2 =  (Button)   findViewById(R.id.reservar2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura función que se implementará en la siguiente versión :)", Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura función que se implementará en la siguiente versión :)", Toast.LENGTH_LONG).show();
            }
        });
    }
}