package com.example.tp03bis;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private static final String OVAL_TAG = "Oval";
    private static final String TRIANGLE_TAG = "Triangle";
    private static final String SQUARE_TAG = "Square";
    private static final String CROSS_TAG = "Cross";

    private Paint paint;
    private String figure;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        this.paint.setColor(0xFF000000);
        this.figure = ""; // default value
    }

    public void setFigure(String figure) {
        this.figure = figure;
        this.invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float width = this.getWidth(), height = this.getHeight();

        if(this.figure.equals(CROSS_TAG)) {
            canvas.drawLine(0.0f, 0.0f, width, height, this.paint);
            canvas.drawLine(width, 0.0f, 0.0f, height, this.paint);
        }
    }
}
