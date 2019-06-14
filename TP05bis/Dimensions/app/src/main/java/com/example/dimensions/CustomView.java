package com.example.dimensions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {

    private Model model;

    private Paint paint;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(this.model != null) {
            Log.d("debug", "ee");
            Rect rect = this.getDrawableRect();
            this.paint.setColor(this.model.getColor());

            canvas.drawRect(rect, this.paint);
        }
    }

    public Rect getDrawableRect() {
        int width = this.getWidth(), height = this.getHeight();
        int centerX = width / 2, centerY = height / 2;

        int left = centerX - (this.model.rectWidth / 2);
        int top = centerY - (this.model.rectHeight / 2);
        int right = left + this.model.rectWidth;
        int bottom = top + this.model.rectHeight;

        Rect rect = new Rect(left, top, right, bottom);

        return rect;
    }


    public void setModel(Model model) {
        this.model = model;
    }
}
