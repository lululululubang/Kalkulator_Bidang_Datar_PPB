package com.example.kalkulator_bidang_datar_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Lingkaran extends AppCompatActivity implements View.OnClickListener {

    EditText edt_diameter;
    Button btn_luasL, btn_kelilingL;
    TextView txt_judul, txt_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        edt_diameter = findViewById(R.id.edt_diameter);
        txt_judul = findViewById(R.id.txt_judul);
        txt_hasil = findViewById(R.id.txt_hasil);
        btn_luasL = findViewById(R.id.btn_luasL);
        btn_kelilingL = findViewById(R.id.btn_kelilingL);

        btn_luasL.setOnClickListener(this);
        btn_kelilingL.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_luasL:
                Luas();
                break;
            case R.id.btn_kelilingL:
                Keliling();
                break;
        }
    }

    private void Luas(){
        float diameter = Float.parseFloat(edt_diameter.getText().toString());
        float luas = (float) (0.25 * Math.PI * diameter);

        txt_judul.setText("Luas Lingkaran:");
        txt_hasil.setText("" + luas);
    }

    private void Keliling() {
        float diameter = Float.parseFloat(edt_diameter.getText().toString());
        float keliling = (float) (Math.PI * diameter);

        txt_judul.setText("Keliling Lingkaran:");
        txt_hasil.setText("" + keliling);
    }
}