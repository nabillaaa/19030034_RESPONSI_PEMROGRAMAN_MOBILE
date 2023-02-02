package com.example.responsi_nabila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungKeliling extends AppCompatActivity {
    Button hitung, kembali;
    EditText panjang, lebar, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_keliling);

        hitung = (Button) findViewById(R.id.btn_htg);
        kembali = (Button) findViewById(R.id.back2);
        panjang =(EditText) findViewById(R.id.pj_kll);
        lebar = (EditText) findViewById(R.id.lb_kll);
        hasil = (EditText) findViewById(R.id.keliling);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pj_kll = Double.parseDouble(panjang.getText().toString());
                double lb_kll = Double.parseDouble((lebar.getText().toString()));

                double KELILING = 2 * (pj_kll + lb_kll);

                hasil.setText("" + KELILING);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balik = new Intent(HitungKeliling.this, MainActivity.class);
                HitungKeliling.this.startActivity(balik);
                finish();
            }
        });


    }
}