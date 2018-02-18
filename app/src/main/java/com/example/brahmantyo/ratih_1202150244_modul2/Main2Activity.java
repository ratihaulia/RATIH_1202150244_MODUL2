package com.example.brahmantyo.ratih_1202150244_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView pilihmenu;
    RadioGroup radio;
    RadioButton dine, take;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //mencari dengan id
        pilihmenu = findViewById(R.id.pilihmenu);
        radio = findViewById(R.id.radiobtn);
        dine = findViewById(R.id.rdbtn1);
        take = findViewById(R.id.rdbtn2);

    }

    public void pesan(View view) {
        int selecteditem = radio.getCheckedRadioButtonId();
        dine = findViewById(R.id.rdbtn1);
        take = findViewById(R.id.rdbtn2);
        radio = findViewById(R.id.radiobtn);

        if (selecteditem == dine.getId()) { //mengatur radio button
            Intent pesan = new Intent(Main2Activity.this, Main4Activity.class);
            startActivity(pesan);
            Toast.makeText(Main2Activity.this, "Dine In", Toast.LENGTH_SHORT).show();
        }else if (selecteditem == take.getId()){ //mengatur radio button
            Intent pesan = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(pesan);
            Toast.makeText(Main2Activity.this, "Take Away", Toast.LENGTH_SHORT).show();
        }
    }
}
