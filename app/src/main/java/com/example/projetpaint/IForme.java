package com.example.projetpaint;

import android.graphics.Canvas;
import android.graphics.Paint;

public interface IForme {

    public ConstanteCommune.TypeDeFormes getForme();


    void dessiner(Canvas canvas, Paint paint);
}
