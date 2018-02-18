package com.example.brahmantyo.ratih_1202150244_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    ImageView Gambar;
    TextView Nama,Harga,komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Gambar = findViewById(R.id.gbr);
        Nama = findViewById(R.id.nmmakanan);
        Harga = findViewById(R.id.harga);
        komposisi = findViewById(R.id.komposisi);

        Intent b = this.getIntent();
        String d = b.getStringExtra("judul");
        String e = b.getStringExtra("deskripsi");
        String k = b.getStringExtra("komposisi");
        int c = b.getExtras().getInt("gambar");

        Nama.setText(d);
        Harga.setText(e);
        komposisi.setText(k);
        Gambar.setImageResource(c);

    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}

