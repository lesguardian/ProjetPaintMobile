package com.example.projetpaint;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class Ellipse implements IForme {
    private int x1, y1, x2, y2;
    private boolean estPlein;
    private int couleur;
    public ConstanteCommune.TypeDeFormes getForme(){ return ConstanteCommune.TypeDeFormes.ELLIPSE; }

    @Override
    public void dessiner(Canvas canvas, Paint paint) {
        paint.setColor(couleur);
        paint.setStyle(estPlein ? Paint.Style.FILL : Paint.Style.STROKE);
        canvas.drawOval(x1, y1, x2, y2, paint);
    }
}
