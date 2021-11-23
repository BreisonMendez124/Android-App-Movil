package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Variables Globales*/
    Drawable drawable,drawable2;
    ImageView imagen1,imagen2;

    /*Metodo para crearLasOpciones en el menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    /*Metodo para hacer la connecion entre paginas al pulsar alguna opcion en el menu*/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.opcion1){
            Intent segundaPantalla = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if(id == R.id.opcion2){
            Intent terceraPantalla = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(terceraPantalla);
        }
        if(id == R.id.opcion3){
            Intent cuartaPantalla = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }

    /*Metodo para reemplazar las imagenes utilizadas en la pantalla inicial*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Resources res = getResources();
        Resources res2 = getResources();

        drawable = res.getDrawable(R.drawable.home,getTheme());
        drawable2 = res2.getDrawable(R.drawable.team,getTheme());

        imagen1 = (ImageView) findViewById(R.id.imageHome1);
        imagen1.setImageDrawable(drawable);

        imagen2 = (ImageView) findViewById(R.id.team);
        imagen2.setImageDrawable(drawable2);

    }

}