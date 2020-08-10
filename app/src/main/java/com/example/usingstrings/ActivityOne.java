package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i("lifecycle", "OnCreate() invoked");
    }

    protected void onStart(Bundle savedInstanceState) {
        super.onStart();

        Log.i("lifecycle", "OnStart() invoked");
    }

    protected void onRestart(Bundle savedInstanceState) {
        super.onRestart();

        Log.i("lifecycle", "OnRestart() invoked");
    }

    protected void onResume(Bundle savedInstanceState) {
        super.onResume();

        Log.i("lifecycle", "OnResume() invoked");
    }

    protected void onPause(Bundle savedInstanceState) {
        super.onPause();

        Log.i("lifecycle", "OnPause() invoked");
    }

    protected void onDestroy(Bundle savedInstanceState) {
        super.onDestroy();

        Log.i("lifecycle", "OnDestroy() invoked");
    }
}