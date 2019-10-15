package com.vielnoel.uh1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        String res = intent.getStringExtra("text");
        TextView txt = findViewById(R.id.txtRumus);
        txt.setText(res);

        String result = intent.getStringExtra("data");
        TextView tv = findViewById(R.id.tvResult);
        tv.setText(result);
    }
}

