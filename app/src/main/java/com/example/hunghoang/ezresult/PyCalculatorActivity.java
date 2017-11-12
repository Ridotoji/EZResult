package com.example.hunghoang.ezresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PyCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_py_calculator2);
    }

    public void onClickBaseArea(View view){
        Intent intent = new Intent(this, BaseAreaActivity.class);
        startActivity(intent);

    }

    public void onClickVolume(View view){
        Intent intent = new Intent(this, VolumeActivity.class);
        startActivity(intent);
    }
}
