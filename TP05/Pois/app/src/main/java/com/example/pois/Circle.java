package com.example.pois;

import android.graphics.Point;

public class Circle {

    public static final float CIRCLE_RADIUS = 15.0f;

    private Point center;
    private int color;

    public Circle(Point center, int color) {
        this.center = center;
        this.color = color;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
