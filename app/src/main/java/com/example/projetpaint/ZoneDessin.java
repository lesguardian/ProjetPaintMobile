package com.example.projetpaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class ZoneDessin extends View implements View.OnTouchListener {

    private ArrayList<IForme> formes = new ArrayList<IForme>();
    private Paint paint = new Paint();

    public ZoneDessin(Context context) {
        super(context);
        paint.setStrokeWidth(10);
        setOnTouchListener(this);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        for (IForme forme : formes){
            forme.dessiner(canvas, paint);
        }
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
            formes.add(new IForme() {
                @Override
                public ConstanteCommune.TypeDeFormes getForme() {
                    return null;
                }

                @Override
                public void dessiner(Canvas canvas, Paint paint) {

                }
            });
            return true;
        }
        return false;
    }
}
