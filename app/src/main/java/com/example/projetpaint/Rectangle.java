package com.example.projetpaint;

import android.graphics.Color;

public class Rectangle implements IForme {
    private int x1, x2, y1, y2;
    private boolean estPlein;
    private Color couleur;
    public ConstanteCommune.TypeDeFormes getForme() {return ConstanteCommune.TypeDeFormes.RECTANGLE;}
}
