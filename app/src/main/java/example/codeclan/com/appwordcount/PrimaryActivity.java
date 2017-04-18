package example.codeclan.com.appwordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimaryActivity extends AppCompatActivity {

    private EditText editText;
    private Button countButton;
    private TextView myResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);

        editText = (EditText) findViewById(R.id.EditText);
        countButton = (Button) findViewById(R.id.CountButton);
        myResult = (TextView) findViewById(R.id.myResult);
    }

    public void onCountButtonClicked(View view){
        WordCount word = new WordCount();
        Log.d(getClass().toString(), "countButton was clicked");
        String wordsInUserString = editText.getText().toString();
        Log.d(getClass().toString(), wordsInUserString);
        int x = word.getWordCount(wordsInUserString);

        myResult.setText(x + "");
    }
}
