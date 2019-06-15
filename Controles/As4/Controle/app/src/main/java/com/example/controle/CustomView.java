package com.example.controle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private Paint paint;
    private Model model;


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.paint = new Paint();
        this.paint.setStrokeWidth(10);
        this.paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(this.model != null) {
            float centerX = this.model.initialX, centerY = this.model.initialY;
            float radius = Distance.getDistance(centerX, centerY, this.model.lastX, this.model.lastY);
            this.paint.setColor(this.model.getColor());

            canvas.drawCircle(centerX, centerY, radius, this.paint);
        }
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
