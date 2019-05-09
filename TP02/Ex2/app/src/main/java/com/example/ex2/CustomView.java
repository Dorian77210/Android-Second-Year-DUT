package com.example.ex2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {

    private Paint paint;
    private DrawnFigure figure = null;

    public CustomView(Context context) {
        super(context);
        this.paint = new Paint();
    }

    public static enum DrawnFigure {
        SQUARE, TRIANGLE, CIRCLE, CROSS
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if(this.figure != null) {
            this.paint.setColor(Color.WHITE);
            Log.d("in", "idosido");
            canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), this.paint);

            this.paint.setColor(Color.BLACK);
            if(this.figure.equals(DrawnFigure.CIRCLE)) {
                canvas.drawCircle(100f, 100f, 50f, this.paint);
            } else if(this.figure.equals(DrawnFigure.CROSS)) {
                canvas.drawLine(0f, 0f, this.getWidth(), this.getHeight(), this.paint);
                canvas.drawLine(this.getWidth(), 0f, 0f, this.getHeight(), this.paint);
            } else if(this.figure.equals(DrawnFigure.TRIANGLE)) {
                canvas.drawLine(20f, 20f, 100f, 20f, this.paint);
                canvas.drawLine(20f, 20f, 60f, 100f, this.paint);
                canvas.drawLine(100f, 20f, 60f, 100f, this.paint);
            } else if(figure.equals(DrawnFigure.SQUARE)){
                canvas.drawRect(20f, 20f, 20f, 20f, this.paint);
            }
        }
    }

    public void setDrawnFigure(DrawnFigure figure) {
        this.figure = figure;
        this.invalidate();
    }
}
