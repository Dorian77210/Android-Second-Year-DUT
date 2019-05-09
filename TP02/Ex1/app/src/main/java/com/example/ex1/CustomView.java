package com.example.ex1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private Paint paint;
    private float width;
    private float height;

    public CustomView(Context context) {
        super(context);
        this.paint = new Paint();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
    }

    @Override
    public void onSizeChanged(int w,  int h, int ow, int oh) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.paint.setColor(0xFF0000FF);
        canvas.drawRect(0f, 0f, this.width, this.height, this.paint);

        // draw circle
        this.paint.setColor(0xFFBD138C);
        canvas.drawCircle(this.width / 4, this.height / 4, 5f, this.paint);

        // draw text
        this.paint.setColor(0xFF000000);
        this.paint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
        this.paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Ceci est un test", this.width /  2, this.height / 2, this.paint);

        Bitmap image = BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.cercles);
        canvas.drawBitmap(image, 10f, 10f, this.paint);
    }
}
