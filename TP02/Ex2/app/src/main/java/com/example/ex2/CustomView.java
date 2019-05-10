package com.example.ex2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {

    private Paint blackPaint;
    private DrawnFigure figure = null;

    public static enum DrawnFigure {
        SQUARE, TRIANGLE, CIRCLE, CROSS
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.blackPaint = new Paint();
        this.blackPaint.setColor(Color.BLACK);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(this.figure != null) {
            float width = this.getWidth(), height = this.getHeight();
            if(this.figure.equals(DrawnFigure.CIRCLE)) {
                canvas.drawCircle(50.0f, 50.0f, 50.0f, this.blackPaint);
            } else if(this.figure.equals(DrawnFigure.CROSS)) {
                canvas.drawLine(0.0f, 0.0f, width, height, this.blackPaint);
                canvas.drawLine(width, 0.0f, 0.0f, height, this.blackPaint);
            } else if(this.figure.equals(DrawnFigure.SQUARE)) {
                canvas.drawRect(50.0f, 50.0f, 100.0f, 100.0f, this.blackPaint);
            } else if(this.figure.equals(DrawnFigure.TRIANGLE)) {
                Path path = new Path();
                path.moveTo(100.0f, 100.0f);
                path.lineTo(150.0f, 150.0f);
                path.lineTo(50.0f, 150.0f);
                path.lineTo(100.0f, 100.0f);
                path.close();
                canvas.drawPath(path, this.blackPaint);
            }
        }
    }


    public void setDrawnFigure(DrawnFigure figure) {
        this.figure = figure;
        this.invalidate();
    }
}
