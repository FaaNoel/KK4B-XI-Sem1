package com.vielnoel.latihanvolum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText txtpanjang, txtlebar, txttinggi;
    private double p, l, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtpanjang = findViewById(R.id.panjang);
        txtlebar = findViewById(R.id.lebar);
        txttinggi = findViewById(R.id.tinggi);
    }
    private void data(List<String> variabel){
        String panjang = txtpanjang.getText().toString();
        String lebar = txtlebar.getText().toString();
        String tinggi = txttinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);
    }

    public void hitung_volume(View view) {
        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double volume = p*l*t;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("ee", String.valueOf(volume));

        startActivity(intent);
    }
    public void hitung_luas(View view) {
        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double luas = 2*(p*l + p*t + l*t);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("asu", String.valueOf(luas));

        startActivity(intent);
    }
    public void hitung_keliling(View view) {
        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double keliling = 4*(p + l + t);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(keliling));

        startActivity(intent);
    }
}