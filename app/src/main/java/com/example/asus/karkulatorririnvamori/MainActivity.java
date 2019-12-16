package com.example.asus.karkulatorririnvamori;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angkapertama,angkakedua,angkaketiga;
    Button btntambah,btnkurang,btnkali,btnbagi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkapertama = findViewById(R.id.angkapertama);
        angkakedua = findViewById(R.id.angkakedua);
        angkaketiga = findViewById(R.id.angkaketiga);
        btntambah =findViewById(R.id.btntambah);
        btnkurang =findViewById(R.id.btnkurang);
        btnkali =findViewById(R.id.btnkali);
        btnbagi =findViewById(R.id.btnbagi);
        hasil = findViewById(R.id.hasil);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkapertama.getText().length()>0) && (angkakedua.getText().length()>0)&& (angkaketiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkapertama.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double angka3 = Double.parseDouble(angkaketiga.getText().toString());
                    double result =angka1 + angka2 + angka3;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Input tidak boleh kosong",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkapertama.getText().length()>0) && (angkakedua.getText().length()>0)&& (angkaketiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkapertama.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double angka3 = Double.parseDouble(angkaketiga.getText().toString());
                    double result =angka1 - angka2 - angka3;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Input tidak boleh kosong",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkapertama.getText().length()>0) && (angkakedua.getText().length()>0)&& (angkaketiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkapertama.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double angka3 = Double.parseDouble(angkaketiga.getText().toString());
                    double result =angka1 * angka2 * angka3;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Input tidak boleh kosong",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkapertama.getText().length()>0) && (angkakedua.getText().length()>0)&& (angkaketiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkapertama.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double angka3 = Double.parseDouble(angkaketiga.getText().toString());
                    double result =angka1 / angka2 / angka3;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Input tidak boleh kosong",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}