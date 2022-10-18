package com.example.kalkulator_bidang_datar_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected final String TAG = "MAIN_ACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View v){
        Intent it = new Intent(this, Persegi.class);
        startActivity(it);
    }

    public void segitiga(View v){
        Intent it = new Intent(this, Segitiga.class);
        startActivity(it);
    }

    public void lingkaran(View v){
        Intent it = new Intent(this, Lingkaran.class);
        startActivity(it);
    }

}