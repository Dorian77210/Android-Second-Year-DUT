package com.example.ex1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Controller implements View.OnClickListener {

    private ImageView imageView;

    private Bitmap rightBitmap;
    private Bitmap leftBitmap;

    public Controller(Button left, Button right, ImageView imageView) {
        left.setOnClickListener(this);
        right.setOnClickListener(this);

        this.imageView = imageView;

        this.rightBitmap = BitmapFactory.decodeResource(this.imageView.getContext().getResources(), R.drawable.fleche_droite);
        this.leftBitmap = BitmapFactory.decodeResource(this.imageView.getContext().getResources(), R.drawable.fleche_gauche);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.left) {
            this.imageView.setImageBitmap(this.leftBitmap);
        } else if(id == R.id.right) {
            this.imageView.setImageBitmap(this.rightBitmap);
        }
    }
}
