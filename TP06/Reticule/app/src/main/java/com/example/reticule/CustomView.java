package com.example.reticule;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;

import javax.crypto.Cipher;

public class CustomView extends View {

    private Paint drawReticule;
    private Paint backgroundPaint;

    private Reticule reticule;

    private static final float CIRCLE_RADIUS = 30.0f;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.reticule = new Reticule(100.0f, 100.0f);

        // setup of the view
        GestureController gestureController = new GestureController(this, this.reticule);
        GestureDetector detector = new GestureDetector(context, gestureController);
        this.setOnTouchListener(new TouchController(detector));

        // paints
        this.drawReticule = new Paint();
        this.drawReticule.setColor(Color.YELLOW);
        this.drawReticule.setStyle(Paint.Style.STROKE);

        this.backgroundPaint = new Paint();
        this.backgroundPaint.setColor(Color.parseColor("#414042"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), this.backgroundPaint);

        float x = this.reticule.x;
        float y = this.reticule.y;

        canvas.drawCircle(x, y, CIRCLE_RADIUS, this.drawReticule);
        canvas.drawLine(x - 10 - CIRCLE_RADIUS, y, x +CIRCLE_RADIUS + 10, y, this.drawReticule);
        canvas.drawLine(x, y - 10 - CIRCLE_RADIUS, x, y + CIRCLE_RADIUS + 10, this.drawReticule);
    }

    public Reticule getReticule() {
        return this.reticule;
    }
}
