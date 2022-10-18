package com.example.kalkulator_bidang_datar_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity implements View.OnClickListener {

    EditText edt_tinggi, edt_alas;
    Button btn_luasS, btn_kelilingS;
    TextView txt_judul, txt_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        edt_tinggi = findViewById(R.id.edt_tinggi);
        edt_alas = findViewById(R.id.edt_alas);
        btn_luasS = findViewById(R.id.btn_luasS);
        btn_kelilingS = findViewById(R.id.btn_kelilingS);
        txt_judul = findViewById(R.id.txt_judul);
        txt_hasil = findViewById(R.id.txt_hasil);

        btn_luasS.setOnClickListener(this);
        btn_kelilingS.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_luasS:
                luas();
                break;
            case R.id.btn_kelilingS:
                keliling();
                break;
        }
    }

    private void luas() {
        float tinggi = Float.parseFloat(edt_tinggi.getText().toString());
        float alas = Float.parseFloat(edt_alas.getText().toString());

        float luas = (float) (0.5 * alas * tinggi);
        txt_judul.setText("Luas Segitiga:");
        txt_hasil.setText("" + luas);
    }

    private void keliling() {
        float alas = Float.parseFloat(edt_alas.getText().toString());

        float keliling = 3 * alas;
        txt_judul.setText("Keliling Segitiga:");
        txt_hasil.setText("" + keliling);

    }

}