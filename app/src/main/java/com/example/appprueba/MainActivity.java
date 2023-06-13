package com.example.appprueba;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irIniciarSesion(View view){

        Intent i = new Intent(this, iniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrar (View view){

        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }
}