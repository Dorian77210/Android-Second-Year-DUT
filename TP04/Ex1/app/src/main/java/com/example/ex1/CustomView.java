package com.example.ex1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CustomView extends View {

    public static final int ALPHA_MASK = 0xFF000000;
    public static final int VALID_COLOR = 0x00FFFFFF;

    private static final int BACKGROUND_COLOR = 0xFF414042;

    private List<Circle> list;
    private Paint paint;
    private TouchController controller;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.list = new ArrayList<Circle>();
        this.paint = new Paint();
        this.controller = new TouchController(this, this.list);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // draw the background
        this.paint.setColor(BACKGROUND_COLOR);
        canvas.drawRect(0.0f, 0.0f, this.getWidth(), this.getHeight(), this.paint);

        Point corner;
        int x = 0, y = 0, color = 0x0;

        for(Circle circle : this.list) {
            corner = circle.getCorner();
            x = corner.x;
            y = corner.y;
            color = circle.getColor();
            this.paint.setColor(color);
            canvas.drawCircle(x, y, Circle.CIRCLE_RADIUS, this.paint);
        }
    }

    public void repaint() {
        this.invalidate();
    }
}
