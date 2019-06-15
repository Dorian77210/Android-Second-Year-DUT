package com.example.controle;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class GestureController implements GestureDetector.OnGestureListener {

    private TextView xView;
    private TextView yView;
    private TextView rView;

    private View mainView;

    private Model model;

    public GestureController(TextView xView, TextView yView, TextView rView, View mainView, Model model) {
        this.xView = xView;
        this.yView = yView;
        this.rView = rView;

        this.mainView = mainView;

        this.model = model;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        float x = e.getX(), y = e.getY();

        if(!this.model.hasInitialCoordinates()) {
            this.model.initialX = x;
            this.model.initialY = y;
        }

        this.model.lastX = x;
        this.model.lastY = y;

        this.xView.setText("x: " + Float.toString(x));
        this.yView.setText("y: " + Float.toString(y));

        this.rView.setText("R: " + Distance.getDistance(x, y, model.initialX, model.initialY));

        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        this.model.lastX = e2.getX();
        this.model.lastY = e2.getY();

        this.mainView.postInvalidate();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return true;
    }
}
