package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userActivity extends AppCompatActivity {
    //declaro las  variables.

     FirebaseAuth auth;
     private TextView emailTextView;
     //private TextView nombreTextView;
     private FirebaseAuth mAuth;
     private Button cerrarSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        emailTextView = findViewById(R.id.emailTextView);
       // nombreTextView = findViewById(R.id.nombre);
        cerrarSesion= findViewById(R.id.cerrarSesion);


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            emailTextView.setText(user.getEmail());
           // nombreTextView.setText(user.getDisplayName());




        }



        }

        public void cerrarSession (View view){
         auth.signOut();

        }


    }



