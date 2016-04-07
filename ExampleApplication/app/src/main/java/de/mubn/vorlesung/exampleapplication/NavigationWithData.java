package de.mubn.vorlesung.exampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NavigationWithData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_with_data);

        Intent i = getIntent();

        String messageText = i.getExtras().getString(NavigationExample.KEY_MESSAGE_TEXT);

        TextView tvMessageArea = (TextView)findViewById(R.id.tv_message_area);

        tvMessageArea.setText(tvMessageArea.getText() + ": " + messageText);

    }
}
