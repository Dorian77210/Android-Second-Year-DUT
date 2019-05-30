package com.example.dimensions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private Paint paint;

    private int rectWidth;
    private int rectHeight;
    private int ratio;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        this.paint.setColor(Color.BLUE);

        // default values
        this.rectHeight = 400;
        this.rectWidth = 200;

        this.ratio = this.rectHeight / this.rectWidth;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.getDrawableRect(), this.paint);

    }

    public void setRectHeight(int height) {
        this.rectHeight = height;
    }

    public void setRectWidth(int width) {
        this.rectWidth = width;
    }

    public Rect getDrawableRect() {
        int width = this.getWidth(), height = this.getHeight();
        int centerX = width / 2, centerY = height / 2;

        int left = centerX - (this.rectWidth / 2);
        int top = centerY - (this.rectHeight / 2);
        int right = left + this.rectWidth;
        int bottom = top + this.rectHeight;

        Rect rect = new Rect(left, top, right, bottom);

        return rect;
    }

    public boolean isGoodPoint(int x, int y) {
        return this.getDrawableRect().contains(x, y);
    }
}
