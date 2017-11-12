package com.example.hunghoang.ezresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Float.parseFloat;

public class BaseAreaActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    private Float currentResult = new Float(0);
    private Float operand1 = new Float(0);
    private Float operand2 = new Float(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Base Area Activity", "now running onCreate()");
        setContentView(R.layout.activity_base_area);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Base Area Activity", "now running onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Base Area Activity", "now running onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Base Area Activity", "now running onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Base Area Activity", "now running onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Base Area Activity", "now running onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Base Area Activity", "now running onDestroy()");
    }

    public void onClickDone(View view) {
        
        EditText editText = (EditText) findViewById(R.id.widthNumb);
        EditText editText1 = (EditText) findViewById(R.id.lengthNumb);
        
        operand1 = parseFloat(editText.getText().toString());
        operand2 = parseFloat(editText1.getText().toString());
        
        currentResult = operand1 * operand2;
        
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(currentResult.toString());
        
        Toast.makeText(this, "Result is " + currentResult.toString() + " squared",
                Toast.LENGTH_LONG).show();

    }
    
    public void onClickUseThis(View view){
        Intent intent = new Intent(this, VolumeActivity.class);
        TextView textView = (TextView) findViewById(R.id.result);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
