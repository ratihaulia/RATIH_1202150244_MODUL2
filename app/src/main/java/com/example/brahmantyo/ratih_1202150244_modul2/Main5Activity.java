package com.example.brahmantyo.ratih_1202150244_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    private RecyclerView Rview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> menu;
    private ArrayList<String> harga;
    private ArrayList<Integer> gambar;
    private TextView c,d;

    //daftar menu makanan
    private String[] Judul = {"Nasi Goreng", "Nasi Ayam Goreng Mentega", "Sup Ayam", "Soto Daging", "Spaghetti", "Nasi Pecel Lele",
            "Bakmi Ayam", "Sate Ayam", "Salad Buah", "Pancake"};
    //deskripsi
    private String[] Deskripsi = {"Harga : Rp 13.000", "Harga : Rp 20.000", "Harga : Rp 14.000", "Harga : Rp 20.000",
            "Harga : Rp 34.000", "Harga : Rp 13.000", "Harga : Rp 20.000", "Harga : Rp 17.000", "Harga : Rp 25.000", "Harga : Rp 15.000"};
    //daftar gambar
    private int[] Gambar = {R.drawable.nasigoreng, R.drawable.nasiayamgorengmentega, R.drawable.supayam,
            R.drawable.sotodaging, R.drawable.spaghetti, R.drawable.nasipecellele, R.drawable.bakmiayam, R.drawable.sateayam,
            R.drawable.saladbuah, R.drawable.pancake};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        menu = new ArrayList<>();
        harga = new ArrayList<>();
        gambar = new ArrayList<>();
        daftaritem();


        Rview = (RecyclerView) findViewById(R.id.recycler_view);
        Rview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        Rview.setLayoutManager(layoutManager);
        Rview.setAdapter(adapter);

        adapter = new RecyclerAdapter(menu,harga,gambar);
        Rview.setAdapter(adapter);
    }

    private void daftaritem() {
        for (int a=0; a<Judul.length; a++){
            menu.add(Judul[a]);
            harga.add(Deskripsi[a]);
            gambar.add(Gambar[a]);
        }
    }
}
