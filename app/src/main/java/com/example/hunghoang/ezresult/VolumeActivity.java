package com.example.hunghoang.ezresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VolumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

    // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(BaseAreaActivity.EXTRA_MESSAGE);

    // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.calculatedArea);
        textView.setText(message);
    }
}
