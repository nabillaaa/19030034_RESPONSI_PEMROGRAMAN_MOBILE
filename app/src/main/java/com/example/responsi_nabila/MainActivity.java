package com.example.responsi_nabila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button luas, keliling , volume, tabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luas = (Button) findViewById(R.id.btn_luas);
        keliling = (Button) findViewById(R.id.btn_kll);
        volume = (Button) findViewById(R.id.btn_volum);
        tabung = (Button) findViewById(R.id.btn_tbg);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main =  new Intent (MainActivity.this, MenghitungLuas.class);
                MainActivity.this.startActivity(main);
                finish();
            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keliling = new Intent (MainActivity.this, HitungKeliling.class);
                MainActivity.this.startActivity(keliling);
                finish();
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volum = new Intent(MainActivity.this, HitungVolume.class);
                MainActivity.this.startActivity(volum);
                finish();
            }
        });

        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tabung = new Intent(MainActivity.this, HitungTabung.class);
                MainActivity.this.startActivity(tabung);
                finish();
            }
        });

    }
}