package com.vielnoel.intentkelluas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMoveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Keliling(View view) {
        Intent intent = new Intent(this, Keliling.class);
        startActivity(intent);
    }

    public void Luas(View view) {
        Intent intent = new Intent(this, Luas.class);
        startActivity(intent);
    }
}
