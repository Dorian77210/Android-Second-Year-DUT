package com.example.grille;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table = (TableLayout)this.findViewById(R.id.table);
        int count = table.getChildCount();

        for(int i = 0; i < count; i++) {
            TableRow row = (TableRow)table.getChildAt(i);
            int childrenCount = row.getChildCount();
            for(int j = 0; j < childrenCount; j++) {
                View view = row.getChildAt(j);
                GestureDetector detector = new GestureDetector(this, new EventController(view));
                TouchController controller = new TouchController(view, detector);
            }
        }
    }
}
