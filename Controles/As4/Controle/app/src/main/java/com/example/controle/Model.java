package com.example.controle;

public class Model {

    private static final float INVALIDE_COORDINATE = -1.0f;

    public float initialX;
    public float initialY;

    public float lastX;
    public float lastY;

    private int color;

    public Model() {
        this.initialX = INVALIDE_COORDINATE;
        this.initialY = INVALIDE_COORDINATE;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    public boolean hasInitialCoordinates() {
        return (this.initialY != INVALIDE_COORDINATE) && (this.initialX != INVALIDE_COORDINATE);
    }
}
