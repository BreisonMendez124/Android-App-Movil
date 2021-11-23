package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Drawable drawable,drawable2,drawable3;
    ImageView imagen1,imagen2,imagen3;
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Resources res = getResources();
        Resources res2 = getResources();
        Resources res3 = getResources();


        drawable = res.getDrawable(R.drawable.ropa1, getTheme());
        drawable2 = res2.getDrawable(R.drawable.ropa2, getTheme());
        drawable3 = res3.getDrawable(R.drawable.ropa3, getTheme());

        imagen1 = (ImageView) findViewById(R.id.productoPrenda1);
        imagen1.setImageDrawable(drawable);

        imagen2 = (ImageView) findViewById(R.id.productoPrenda2);
        imagen2.setImageDrawable(drawable2);

        imagen3 = (ImageView) findViewById(R.id.productoPrenda3);
        imagen3.setImageDrawable(drawable3);

        button1 = (Button) findViewById(R.id.reservarPrenda1);
        button2 = (Button) findViewById(R.id.reservarPrenda2);
        button3 = (Button) findViewById(R.id.reservarPrenda3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Futura función que se implementará en la siguiente versión :)", Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Futura función que se implementará en la siguiente versión :)", Toast.LENGTH_LONG).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura función que se implementará en la siguiente versión :)", Toast.LENGTH_LONG).show();
            }
        });




    }
}