package com.example.controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        // retrieve view and information from the bundle
        TextView errorMessageView = (TextView)this.findViewById(R.id.error_message);
        TextView colorMessageView = (TextView)this.findViewById(R.id.error_color);
        Button okButton = (Button)this.findViewById(R.id.ok_button);

        Intent intent = this.getIntent();
        String errorMessage = intent.getStringExtra(BundleConstants.ERROR_MESSAGE);
        String colorMessage = intent.getStringExtra(BundleConstants.ERROR_COLOR);

        // update views
        errorMessageView.setText(errorMessage);
        colorMessageView.setText(colorMessage);

        // controller for the ok button
        okButton.setOnClickListener(new ButtonController());
    }
}
