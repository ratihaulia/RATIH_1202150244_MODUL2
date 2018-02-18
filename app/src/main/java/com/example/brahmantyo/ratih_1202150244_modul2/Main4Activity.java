package com.example.brahmantyo.ratih_1202150244_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Spinner meja;
    EditText nama;
    Button pilihpesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        meja = findViewById(R.id.meja);
        nama = findViewById(R.id.name);
        pilihpesanan = findViewById(R.id.pilihpesanan);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (meja != null){
            meja.setAdapter(adapter);

        }

      pilihpesanan.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String spinner = meja.getSelectedItem().toString();

              if (spinner.equals("Meja 1")){
                  Toast.makeText(Main4Activity.this, "Meja 1 Telah Terpilih", Toast.LENGTH_SHORT).show();
                  Intent a = new Intent(Main4Activity.this,Main5Activity.class);
                  startActivity(a);
              }else if (spinner.equalsIgnoreCase("Meja 2")){
                  Toast.makeText(Main4Activity.this, "Meja 2 Telah Terpilih", Toast.LENGTH_SHORT).show();
                  Intent a = new Intent(Main4Activity.this, Main5Activity.class);
                  startActivity(a);
              }else if (spinner.equalsIgnoreCase("Meja 3")){
                  Toast.makeText(Main4Activity.this, "Meja 3 Telah Terpilih", Toast.LENGTH_SHORT).show();
                  Intent a = new Intent(Main4Activity.this, Main5Activity.class);
                  startActivity(a);
              }else if (spinner.equalsIgnoreCase("Meja 4")){
                  Toast.makeText(Main4Activity.this, "Meja 4 Telah Terpilih", Toast.LENGTH_SHORT).show();
                  Intent a = new Intent(Main4Activity.this, Main5Activity.class);
                  startActivity(a);
              }else if (spinner.equalsIgnoreCase("Meja 5")){
                  Toast.makeText(Main4Activity.this, "Meja 5 Telah Terpilih", Toast.LENGTH_SHORT).show();
                  Intent a = new Intent(Main4Activity.this, Main5Activity.class);
                  startActivity(a);
              }
          }
      });




}
}
