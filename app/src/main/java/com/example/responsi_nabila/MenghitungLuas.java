package com.example.responsi_nabila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenghitungLuas extends AppCompatActivity {
    EditText lebar, panjang, hasil;
    Button luas, balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_luas);

        luas = (Button) findViewById(R.id.hasil);
        lebar = (EditText) findViewById(R.id.lb_luas);
        panjang = (EditText) findViewById(R.id.pj_luas);
        hasil = (EditText) findViewById(R.id.KLL);
        balik = (Button) findViewById(R.id.back);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lb_luas = Double.parseDouble(panjang.getText().toString());
                double pj_luas = Double.parseDouble(lebar.getText().toString());

                double LUAS = pj_luas * lb_luas;

                hasil.setText("" + LUAS);
            }
        });

        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(MenghitungLuas.this, MainActivity.class);
                MenghitungLuas.this.startActivity(kembali);
                finish();
            }
        });




    }
}