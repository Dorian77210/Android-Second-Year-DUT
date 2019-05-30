package com.example.pois;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.graphics.Point;

import java.util.Random;

public class TouchController implements View.OnTouchListener {

    private static final int COLOR_ALPHA_MASK = 0xFF000000;

    private Random random;

    public TouchController(View view) {
        this.random = new Random();
        view.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if(view instanceof CustomView) {
            CustomView customView = (CustomView)view;
            int type = event.getActionMasked();
            if(type == MotionEvent.ACTION_DOWN) {
                Point p = new Point((int)event.getX(), (int)event.getY());
                int color = this.random.nextInt() | COLOR_ALPHA_MASK;
                Circle c = new Circle(p, color);
                customView.addCircle(c);
                customView.setCurrentCircle(c);
            } else if(type == MotionEvent.ACTION_MOVE) {
                Circle currentCircle = customView.getCurrentCircle();
                Point p = new Point((int)event.getX(), (int)event.getY());
                currentCircle.setCenter(p);
                customView.postInvalidate();
            }

        }
        return true;
    }
}
