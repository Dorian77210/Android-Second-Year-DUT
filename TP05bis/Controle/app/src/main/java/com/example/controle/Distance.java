package com.example.controle;

public class Distance {

    public static final float getDistance(float x1, float y1, float x2, float y2) {
        float x = (float)Math.pow((double)(x1 - x2), 2);
        float y = (float)Math.pow((double)(y1 - y2), 2);

        return (float)Math.sqrt((double)(x + y));
    }
}
