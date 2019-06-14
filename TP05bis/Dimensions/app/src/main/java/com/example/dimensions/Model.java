package com.example.dimensions;

import android.graphics.Color;

public class Model {

    public int rectWidth;
    public int rectHeight;
    private int color;
    private boolean keepRatio;

    public Model() {
        this.rectHeight = 400;
        this.rectWidth = 200;
        this.color = Color.BLUE;
        this.keepRatio = false;
    }

    public void toggleColor() {
        this.color = this.color == Color.RED ? Color.BLUE : Color.RED;
    }

    public void setColor(int color) {
        this.color = color;
        this.keepRatio = this.color == Color.RED;
    }

    public int getColor() {
        return this.color;
    }
}
