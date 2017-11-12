package com.example.hunghoang.ezresult;

//testing my push

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity", "now running onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main Activity", "now running onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main Activity", "now running onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main Activity", "now running onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Main Activity", "now running onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main Activity", "now running onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main Activity", "now running onDestroy()");
    }

    public void onClickShapesDecription(View view){
        Intent intent = new Intent(this, ShapesInfoActivity.class);
        startActivity(intent);
    }

    public void onClickPyramidCalculator(View view){
        Intent intent = new Intent(this, PyCalculatorActivity.class);
        startActivity(intent);
    }
}
