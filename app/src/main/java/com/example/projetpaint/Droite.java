package com.example.projetpaint;

import android.graphics.Color;

public class Droite implements IForme {
    private int x1, y1, x2, y2;
    private Color couleur;
    public ConstanteCommune.TypeDeFormes getForme(){ return ConstanteCommune.TypeDeFormes.DROITE; }
}