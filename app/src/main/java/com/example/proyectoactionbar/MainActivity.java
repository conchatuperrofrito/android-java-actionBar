package com.example.proyectoactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuopciones,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.telephono) {
            Toast.makeText(this, "Se presiono el icono del telefono", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.camara) {
            Toast.makeText(this, "Se presiono el icono de la camara", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.opcion1) {
            Intent i= new Intent(this,MainActivity2.class);//para que direccione a otra ventana al hacer clik en opcion 1
            startActivity(i);
            //Toast.makeText(this, "Se presiono la opcion 1", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.opcion2) {
            Intent i= new Intent(this,MainActivity2.class);//para que direccione a otra ventana al hacer clik en opcion 2
            startActivity(i);
            //Toast.makeText(this, "Se presiono la opcion 2", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.opcion3) {
            Intent i= new Intent(this,MainActivity2.class);//para que direccione a otra ventana al hacer clik en opcion 3
            startActivity(i);
            //Toast.makeText(this, "Se presiono la opcion 3", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}