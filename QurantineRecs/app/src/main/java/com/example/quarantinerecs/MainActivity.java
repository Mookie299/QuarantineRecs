package com.example.quarantinerecs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
   // TextView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hello , how are you today?
        // hello, my name is Daniella.
        //my cat is a crackhead
        //his middle name is Barry like the flash

  
       //hey

        img = findViewById(R.id.blackLives);

    }
}