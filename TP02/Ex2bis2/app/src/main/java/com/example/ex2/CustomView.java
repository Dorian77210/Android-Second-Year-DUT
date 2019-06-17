package com.example.ex2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private Shape shape;

    private Paint paint;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        this.paint.setColor(Color.BLACK);

        this.shape = null;
    }

    public static enum Shape {
        SQUARE, CROSS, CIRCLE, TRIANGLE
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(this.shape != null ) {
            float width = this.getWidth(), heigth = this.getHeight();
            if(this.shape.equals(Shape.TRIANGLE)) {
                Path path = new Path();

                path.moveTo(width / 2.0f, 10.0f);
                path.lineTo(width - 10.0f, heigth - 10.0f);
                path.lineTo(10.0f, heigth - 10.0f);
                path.moveTo(width / 2.0f, 10.0f);
                canvas.drawPath(path, this.paint);
            } else if(this.shape.equals(Shape.CIRCLE)) {
                canvas.drawCircle(width / 2.0f, heigth / 2.0f, 30.0f, this.paint);
            } else if(this.shape.equals(Shape.CROSS)) {
                canvas.drawLine(0.0f, 0.0f, width, heigth, this.paint);
                canvas.drawLine(width, 0.0f, 0.0f, heigth, this.paint);
            } else if(this.shape.equals(Shape.SQUARE)) {
                canvas.drawRect(10.f, 100.0f, 100.0f, 200.0f, this.paint);
            }
        }

    }

    public void setShape(Shape shape) {
        this.shape = shape;
        this.invalidate();
    }
}
