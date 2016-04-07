package de.mubn.vorlesung.firstaplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by d041670 on 25.02.16.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);


        TextView label = new TextView(this);
        label.setText("Willkommen zur ersten App");

        Button myBtn = new Button(this);
        myBtn.setText("Hier passiert die Magie");
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tag", "Hier ist die Magie!");
            }
        });

        mainLayout.addView(label);
        mainLayout.addView(myBtn);


        setContentView(mainLayout);

    }
}
