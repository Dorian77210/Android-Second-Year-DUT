package com.example.pois;

import android.graphics.Point;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;

import java.util.Random;

public class DragListener implements View.OnDragListener {

    private static final int CIRCLE_ALPHA_MASK =  0xFF000000;

    private Random random;

    public DragListener(View view) {
        view.setOnDragListener(this);
        this.random = new Random();
    }

    @Override
    public boolean onDrag(View view, DragEvent event) {
        Log.d("debug", "yes");
        if(view instanceof CustomView) {
            CustomView customView = (CustomView)view;
            int state = event.getAction();
            if(state == DragEvent.ACTION_DRAG_ENTERED) {
                Point p = new Point((int)event.getX(), (int)event.getY());
                int color = this.random.nextInt() | CIRCLE_ALPHA_MASK;
                Circle c = new Circle(p, color);
                customView.addCircle(c);
                customView.setCurrentCircle(c);
                Log.d("debug", "entered");
            } else if(state == DragEvent.ACTION_DRAG_LOCATION) {
                Circle currentCircle = customView.getCurrentCircle();
                Point center = new Point((int)event.getX(), (int)event.getY());
                currentCircle.setCenter(center);
                Log.d("debug", "on drag");
            }
        }
        return true;
    }
}
