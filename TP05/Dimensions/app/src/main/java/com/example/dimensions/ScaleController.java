package com.example.dimensions;

import android.util.Log;
import android.view.ScaleGestureDetector;

public class ScaleController extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    private CustomView view;

    private boolean isHorizontalScaling;

    public ScaleController(CustomView view) {
        this.view = view;
    }

    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        int distance = (int)detector.getCurrentSpan();
        if(this.isHorizontalScaling) {
            this.view.setRectWidth(distance);
        } else {
            this.view.setRectHeight(distance);
        }

        this.view.postInvalidate();

        return true;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        int width = (int)detector.getCurrentSpanX(), height = (int)detector.getCurrentSpanY();
        int distance = (int)detector.getCurrentSpan();
        this.isHorizontalScaling = (width > height);

        Log.d("debug", "begin" + width + " " + height);


        return true;
    }
}
