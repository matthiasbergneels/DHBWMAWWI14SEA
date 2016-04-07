package de.mubn.vorlesung.exampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NavigationWithAnswer extends AppCompatActivity {

    public static final String KEY_ANSWER_TEXT = "ANSWER_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_with_answer);

        TextView tvMessageArea = (TextView)findViewById(R.id.tv_message_area_with_answer);

        tvMessageArea.setText(getIntent().getExtras().getString(NavigationExample.KEY_MESSAGE_TEXT));
    }

    public void onClick(View v){
        String answer = ((EditText)findViewById(R.id.et_message_answer)).getText().toString();

        Intent i = new Intent();
        i.putExtra(KEY_ANSWER_TEXT, answer);

        setResult(RESULT_OK, i);

        finish();
    }
}
