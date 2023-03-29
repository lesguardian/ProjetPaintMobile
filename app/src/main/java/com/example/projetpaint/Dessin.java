package com.example.projetpaint;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.text.Normalizer;

public class Dessin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessin);
    }

    public void Quit(View view){
        finish();
    }

    public int selectColor(View view){
        int color = 0;
        switch (view.getId()){
            case R.id.buttonBlack:
                color = 0;
                break;
            case R.id.buttonRed:
                color = 1;
                break;
            case R.id.buttonGreen:
                color = 2;
                break;
            case R.id.buttonBlue:
                color = 3;
                break;
            case R.id.buttonYellow:
                color = 4;
                break;
        }
        return color;
    }

    public IForme setForme(View view){
        IForme forme = null;
        switch (view.getId()){
            case R.id.buttonRectangle:
                forme = new Rectangle();
                break;
            case R.id.buttonEllipse:
                forme = new Ellipse();
                break;
            case R.id.buttonDroite:
                forme = new Droite();
                break;

        }
        return forme;
    }
}
