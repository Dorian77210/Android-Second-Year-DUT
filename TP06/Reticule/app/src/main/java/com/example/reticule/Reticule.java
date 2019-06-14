package com.example.reticule;

public class Reticule {

    public float x;
    public float y;

    public Reticule(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void updatePosition(float x, float y) {
        this.x -= x;
        this.y -= y;
    }
}
