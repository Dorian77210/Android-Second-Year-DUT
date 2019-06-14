package com.example.dimensions;

import android.util.Log;
import android.view.ScaleGestureDetector;

public class ScaleController extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    private boolean isHorizontalScale;

    private Model model;
    private CustomView view;

    public ScaleController(CustomView view, Model model) {
        this.view= view;
        this.model = model;
    }

    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        int distance = (int)detector.getCurrentSpan();
        if(this.isHorizontalScale) {
            this.model.rectWidth = distance;
        } else {
            this.model.rectHeight = distance;
        }

        Log.d("debug", "dddd");

        this.view.postInvalidate();

        return true;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        float spanX = detector.getCurrentSpanX(), spanY = detector.getCurrentSpanY();
        this.isHorizontalScale = (spanX > spanY);
        return true;
    }
}
