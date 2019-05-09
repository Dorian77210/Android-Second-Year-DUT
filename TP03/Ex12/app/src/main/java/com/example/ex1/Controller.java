package com.example.ex1;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Controller implements View.OnClickListener {

    private ImageView imageView;

    public Controller(Button left, Button right, ImageView imageView) {
        left.setOnClickListener(this);
        right.setOnClickListener(this);

        this.imageView = imageView;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.left) {
            this.imageView.setImageResource(R.drawable.fleche_gauche);
        } else if(id == R.id.right) {
            Log.d("info", "ioioio");
            this.imageView.setImageResource(R.drawable.fleche_droite);
        }
    }
}
