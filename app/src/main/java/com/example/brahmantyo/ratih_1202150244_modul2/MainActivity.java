package com.example.brahmantyo.ratih_1202150244_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"RATIH_1202150244",Toast.LENGTH_SHORT).show();//menampilkan toast yang bertuliskan NAMA_NIM

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);//melakukan perpindahan dari mainactivity ke main2activity
                startActivity(intent);
            }
        }, 2000L);
    }
}
