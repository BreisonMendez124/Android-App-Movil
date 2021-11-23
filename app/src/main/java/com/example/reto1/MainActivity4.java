package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable,drawable2;
    ImageView imagen1,imagen2;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Resources res = getResources();
        Resources res2 = getResources();

        drawable = res.getDrawable(R.drawable.sucursal1,getTheme());
        drawable2 = res2.getDrawable(R.drawable.sucursal2,getTheme());

        imagen1 = (ImageView) findViewById(R.id.sucursal1);
        imagen1.setImageDrawable(drawable);

        imagen2 = (ImageView) findViewById(R.id.sucursal2);
        imagen2.setImageDrawable(drawable2);

        button1 =  (Button)   findViewById(R.id.botonSucursal1);
        button2 =  (Button)   findViewById(R.id.botonSucursal2);

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