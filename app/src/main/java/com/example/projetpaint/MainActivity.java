package com.example.projetpaint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void NewDessin(View view){


        Intent NewDessin = new Intent(this, Dessin.class);
        startActivity(NewDessin);
    }
}