package com.example.dimensions;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class DoubleTapController implements GestureDetector.OnDoubleTapListener {

    private Model model;
    private CustomView view;

    public DoubleTapController(CustomView view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Log.d("debug", "yes");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {

        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {

    }
}
