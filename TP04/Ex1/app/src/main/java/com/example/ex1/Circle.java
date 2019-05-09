package com.example.ex1;

import android.graphics.Point;

public class Circle {

    public static final float CIRCLE_RADIUS = 20.0f;

    private Point corner;
    private int color;

    public Circle(Point corner, int color) {
        this.corner = corner;
        this.color = color;
    }

    public Point getCorner() {
        return this.corner;
    }

    public int getColor() {
        return this.color;
    }
}
