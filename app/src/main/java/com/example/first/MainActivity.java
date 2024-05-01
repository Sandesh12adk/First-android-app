package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView myTextView;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        myButton = findViewById(R.id.buttonId);
        myTextView = findViewById(R.id.putid);
        myEditText = findViewById(R.id.getid);

        // Set onClickListener for myButton
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = myEditText.getText().toString();
                double value = Double.parseDouble(data);
                double result = value * 2.202; // converting kg into pounds
                myTextView.setText("The correspoding value in pounds is"+ String.valueOf(result));
            }
        });
    }
}
