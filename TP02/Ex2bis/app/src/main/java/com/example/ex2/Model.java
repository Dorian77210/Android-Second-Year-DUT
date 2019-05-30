package com.example.ex2;

public class Model {

    private Shap currentShap;

    public Model() {
        // default value
        this.currentShap = Shap.CROSS;
    }

    public static enum Shap {
        SQUARE, OVAL, TRIANGLE, CROSS
    }

    public void setCurrentShap(Shap shap) {
        this.currentShap = shap;
    }

    public Shap getCurrentShap() {
        return this.currentShap;
    }
}
