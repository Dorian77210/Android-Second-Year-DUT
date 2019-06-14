package com.example.dimensions;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureController extends GestureDetector.SimpleOnGestureListener {

    private CustomView view;
    private Model model;

    public GestureController(CustomView view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        this.model.toggleColor();
        return true;
    }
}
