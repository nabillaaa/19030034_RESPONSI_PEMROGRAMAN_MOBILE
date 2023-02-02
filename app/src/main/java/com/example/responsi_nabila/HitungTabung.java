package com.example.responsi_nabila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungTabung extends AppCompatActivity {

    Button hitung,kembali;
    EditText tinggii,jarii,hasil,panjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tabung);


        panjang=(EditText) findViewById(R.id.panjang4);
        hitung = (Button) findViewById(R.id.hitung4);
        kembali =(Button) findViewById(R.id.back4);
        tinggii =( EditText) findViewById(R.id.tinggi2);
        jarii = (EditText)  findViewById(R.id.jari2);
        hasil =(EditText) findViewById(R.id.hasil4);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tinggi2 = Double.parseDouble(tinggii.getText().toString());
                double jari2 = Double.parseDouble(jarii.getText().toString());
                double panjang4 = Double.parseDouble(panjang.getText().toString());

                double KELILING = 2 *(3.14 * ((jari2*2)* tinggi2) + 2 * (panjang4 + tinggi2 ));

                hasil.setText("" + KELILING);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(HitungTabung.this, MainActivity.class);
                HitungTabung.this.startActivity(kembali);
                finish();
            }
        });
    }
}