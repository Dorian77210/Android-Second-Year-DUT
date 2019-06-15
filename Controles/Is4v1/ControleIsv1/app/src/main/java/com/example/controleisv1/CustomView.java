package com.example.controleisv1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private static final float BASE_CIRCLE_RADIUS = 25.0f;

    private Paint paint;

    private Model model;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.paint = new Paint();
        this.paint.setStrokeWidth(5);
        this.paint.setStyle(Paint.Style.STROKE);

        this.model = null;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float width = this.getWidth(), height = this.getHeight();
        float centerX = width / 2.0f, centerY = height / 2.0f;


        for(int i = 1; i <= 3; i++) {
            float radius = BASE_CIRCLE_RADIUS * (float)i;
            if(this.model == null) {
                this.paint.setColor(Color.GRAY);
            } else {
                int color = this.model.isSelected(i - 1) ? Color.GREEN : Color.GRAY;
                this.paint.setColor(color);
            }

            canvas.drawCircle(centerX, centerY, radius, this.paint);
        }
    }

    public void initModel(Model model) {
        this.model = model;
    }
}
