package com.example.brahmantyo.ratih_1202150244_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button pilihtgl, plhwkt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void pesan(View view) { //class pesan dari halaman sebelumnya
        Intent pesan = new Intent(Main3Activity.this, Main5Activity.class);
        startActivity(pesan);
    }

    public void pilih1(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
        Toast.makeText(this, getString(R.string.time) + plhwkt, Toast.LENGTH_SHORT).show();

    }

    public void pilih(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
        Toast.makeText(this, getString(R.string.date) + pilihtgl, Toast.LENGTH_SHORT).show();

    }
}
