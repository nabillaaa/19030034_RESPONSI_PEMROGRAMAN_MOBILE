package com.example.responsi_nabila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungVolume extends AppCompatActivity {

    Button hitung, kembali;
    EditText jari2,tinggii,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_volume);

        hitung = (Button) findViewById(R.id.htg_tbg);
        kembali = (Button) findViewById(R.id.back3);
        jari2 = (EditText) findViewById( R.id.jari);
        tinggii = (EditText) findViewById(R.id.tinggi);
        hasil =(EditText) findViewById(  R.id.hasiltbg);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari = Double.parseDouble(jari2.getText().toString());
                double tinggi = Double.parseDouble(tinggii.getText().toString());

                double VOLUME = 3.14 * (jari *2 ) * tinggi ;

                hasil.setText("" + VOLUME);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(HitungVolume.this, MainActivity.class);
                HitungVolume.this.startActivity(kembali);
                finish();
            }
        });
    }
}