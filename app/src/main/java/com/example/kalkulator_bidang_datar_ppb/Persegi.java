package com.example.kalkulator_bidang_datar_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity implements View.OnClickListener {

    EditText edt_panjang, edt_lebar;
    Button btn_luasP, btn_kelilingP;
    TextView txt_judul, txt_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        edt_panjang = findViewById(R.id.edt_panjang);
        edt_lebar = findViewById(R.id.edt_lebar);
        btn_luasP = findViewById(R.id.btn_luasP);
        btn_kelilingP = findViewById(R.id.btn_kelilingP);
        txt_judul = findViewById(R.id.txt_judul);
        txt_hasil = findViewById(R.id.txt_hasil);

        btn_luasP.setOnClickListener(this);
        btn_kelilingP.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_luasP:
                luas();
                break;
            case R.id.btn_kelilingP:
                keliling();
                break;
        }
    }

    private void luas() {
        int panjang = Integer.parseInt(edt_panjang.getText().toString());
        int lebar = Integer.parseInt(edt_lebar.getText().toString());

        int luas = panjang * lebar;
        txt_judul.setText("Luas Persegi:");
        txt_hasil.setText("" + luas);
    }

    private void keliling() {
        int panjang = Integer.parseInt(edt_panjang.getText().toString());
        int lebar = Integer.parseInt(edt_lebar.getText().toString());

        int keliling = 2 * (panjang + lebar);
        txt_judul.setText("Luas Persegi:");
        txt_hasil.setText("" + keliling);
    }
}