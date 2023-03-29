package com.example.projetpaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;

public class ZoneDessin extends View {

    private ArrayList<IForme> formes = new ArrayList<IForme>();
    private Paint paint = new Paint();

    public ZoneDessin(Context context) {
        super(context);
        paint.setStrokeWidth(10);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        for (IForme forme : formes){
            forme.dessiner(canvas, paint);
        }
    }
}
