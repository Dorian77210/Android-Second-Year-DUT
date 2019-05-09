package com.example.ex1;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

import java.util.List;
import java.util.Random;

public class TouchController implements View.OnTouchListener {

    private List<Circle> list;

    public TouchController(CustomView customView, List<Circle> list) {
        customView.setOnTouchListener(this);
        this.list = list;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if(view instanceof CustomView) {
            Random random = new Random();
            CustomView customView = (CustomView)view;
            // retrieve coordinates
            Point corner = new Point((int)event.getX(), (int)event.getY());
            int color = (random.nextInt() % CustomView.VALID_COLOR) | CustomView.ALPHA_MASK;

            this.list.add(new Circle(corner, color));
            customView.repaint();
        }

        return false;
    }
}
