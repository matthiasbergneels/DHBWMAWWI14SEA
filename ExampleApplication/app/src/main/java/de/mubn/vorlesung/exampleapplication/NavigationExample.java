package de.mubn.vorlesung.exampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NavigationExample extends AppCompatActivity {

    public static final String KEY_MESSAGE_TEXT = "MESSAGE_TEXT";
    public static final int RC_WITH_ANSWER = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_example);
    }

    public void onClick(View v){

        Intent i;

        EditText etMessageTextField = (EditText)findViewById(R.id.et_message_text);
        String messageText = etMessageTextField.getText().toString();

        if(v.getId() == R.id.btn_navigation_with_data){
            i = new Intent(this, NavigationWithData.class);
            i.putExtra(KEY_MESSAGE_TEXT, messageText);

            startActivity(i);

        }else if(v.getId() == R.id.btn_navigation_with_answer){
            i = new Intent(this, NavigationWithAnswer.class);
            i.putExtra(KEY_MESSAGE_TEXT, messageText);

            startActivityForResult(i, RC_WITH_ANSWER);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_WITH_ANSWER){
            if(resultCode == RESULT_OK){
                String answer = data.getExtras().getString(NavigationWithAnswer.KEY_ANSWER_TEXT);
                Toast.makeText(this, "Answer: " + answer, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
