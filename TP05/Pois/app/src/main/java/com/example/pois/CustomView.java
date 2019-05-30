package com.example.pois;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CustomView extends View {

    private static final float CIRCLE_RADIUS = 15.0f;

    private Paint backgroundPaint;

    private List<Circle> circles;

    private Circle currentCircle;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.backgroundPaint = new Paint();
        this.backgroundPaint.setColor(0xFF414042);

        this.circles = new ArrayList<Circle>();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(this.isOpaque()) {
            Paint p = new Paint();
            p.setColor(Color.WHITE);
            canvas.drawRect(0.0f, 0.0f, this.getWidth(), this.getHeight(), p);
        }

        canvas.drawRect(0.0f, 0.0f, this.getWidth(), this.getHeight(), this.backgroundPaint);

        Paint circlePaint = new Paint();
        Point center;

        // draw the circles
        for(Circle circle : this.circles) {
            circlePaint.setColor(circle.getColor());
            center = circle.getCenter();
            canvas.drawCircle( (float)center.x, (float)center.y, Circle.CIRCLE_RADIUS, circlePaint);
        }
    }

    public void addCircle(Point center, int color) {
        Circle circle = new Circle(center, color);
        this.circles.add(circle);
        this.invalidate();
    }

    public void addCircle(Circle c) {
        this.circles.add(c);
        this.invalidate();
    }

    public void setCurrentCircle(Circle circle) {
        this.currentCircle = circle;
    }

    public Circle getCurrentCircle() {
        return this.currentCircle;
    }
}
