package com.example.projetpaint;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Droite implements IForme {
    private int x1, y1, x2, y2;
    private int couleur;
    public ConstanteCommune.TypeDeFormes getForme(){ return ConstanteCommune.TypeDeFormes.DROITE; }

    @Override
    public void dessiner(Canvas canvas, Paint paint) {
        paint.setColor(couleur);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(x1, y1, x2, y2, paint);
    }
}