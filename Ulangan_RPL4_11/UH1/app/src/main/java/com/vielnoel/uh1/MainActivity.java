package com.vielnoel.uh1;

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

        if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()) {
            txtpanjang.setError("harap diisi dahulu");
            txtlebar.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
            if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty()){
                txtpanjang.setError("harap diisi dahulu");
                txtlebar.setError("harap diisi dahulu");
                return;
            }
            if (txtpanjang.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
                txtpanjang.setError("harap diisi dahulu");
                txttinggi.setError("harap diisi dahulu");
                return;
            }
            if (txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
                txtlebar.setError("harap diisi dahulu");
                txttinggi.setError("harap diisi dahulu");
                return;
            }
            if (txtpanjang.getText().toString().isEmpty()){
                txtpanjang.setError("harap diisi dahulu");
                return;
            }
            if (txttinggi.getText().toString().isEmpty()){
                txttinggi.setError("harap diisi dahulu");
                return;
            }
            if (txtlebar.getText().toString().isEmpty()){
                txtlebar.setError("harap diisi dahulu");
                return;
            }
        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double volume = p*l*t;
        String txtVolume = "Volume";

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(volume));
        intent.putExtra("text", (txtVolume));

        startActivity(intent);
    }
    public void hitung_luas(View view) {
        if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()) {
            txtpanjang.setError("harap diisi dahulu");
            txtlebar.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            txtlebar.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
            txtlebar.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            return;
        }
        if (txttinggi.getText().toString().isEmpty()){
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtlebar.getText().toString().isEmpty()){
            txtlebar.setError("harap diisi dahulu");
            return;
        }

        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double luas = 2*(p*l + p*t + l*t);
        String txtLuas = "Luas";

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(luas));
        intent.putExtra("text", String.valueOf(txtLuas));

        startActivity(intent);
    }
    public void hitung_keliling(View view) {
        if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()) {
            txtpanjang.setError("harap diisi dahulu");
            txtlebar.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty() && txtlebar.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            txtlebar.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtlebar.getText().toString().isEmpty() && txttinggi.getText().toString().isEmpty()){
            txtlebar.setError("harap diisi dahulu");
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtpanjang.getText().toString().isEmpty()){
            txtpanjang.setError("harap diisi dahulu");
            return;
        }
        if (txttinggi.getText().toString().isEmpty()){
            txttinggi.setError("harap diisi dahulu");
            return;
        }
        if (txtlebar.getText().toString().isEmpty()){
            txtlebar.setError("harap diisi dahulu");
            return;
        }

        List<String> variabel = new ArrayList<>();
        data(variabel);

        Double keliling = 4*(p + l + t);
        String txtKeliling = "Keliling";


        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(keliling));
        intent.putExtra("text", (txtKeliling));

        startActivity(intent);
    }
}