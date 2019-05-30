package com.example.ex2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {

    private Paint paint;
    private Controller controller;
    private Shap shap;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        // default value
        this.shap = Shap.CROSS;
    }

    public CustomView(Context context) {
        super(context);
        this.paint = new Paint();
        this.shap = Shap.CROSS;
    }

    public static enum Shap {
        TRIANGLE, CROSS, OVAL, SQUARE
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = this.getWidth(), height = this.getHeight();
        this.paint.setColor(Color.WHITE);
        canvas.drawRect(0, 0, width, height, this.paint);

        this.paint.setColor(Color.BLACK);
        if(this.shap.equals(Shap.SQUARE)) {
            canvas.drawRect(10.f, 10.0f, 100.0f, 100.0f , this.paint);
        } else if(this.shap.equals(Shap.CROSS)) {
            canvas.drawLine(0.0f,0.0f, width, height, this.paint);
            canvas.drawLine(width, 0.0f, 0.0f, height, this.paint);
        } else if(this.shap.equals(Shap.OVAL)) {
            canvas.drawCircle(width / 2, height / 2, 50.0f, this.paint);
        } else if(this.shap.equals(Shap.TRIANGLE)) {
            canvas.drawLine(width / 2, 10.0f, 10.0f, height - 10.0f, this.paint);
            canvas.drawLine(width /2, 10.0f, width - 10.0f, height - 10.f, this.paint);
            canvas.drawLine(10.0f, height - 10.0f, width - 10.0f, height - 10.0f, this.paint);
        }
    }

    public void setShap(Shap shap) {
        this.shap = shap;
        this.invalidate();
    }
}
