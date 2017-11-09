package com.example.agrendra.tug_numberkeyboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText teks1, teks2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teks1 = (EditText)findViewById(R.id.n1);
        teks2 = (EditText)findViewById(R.id.n2);
    }

    public void btn1(View view) {
        try{
            intent = new Intent(MainActivity.this, DetailActivity.class);
            int nil1 = Integer.parseInt(teks1.getText().toString());
            int nil2 = Integer.parseInt(teks2.getText().toString());
            int has = nil1 + nil2;
            String tampilkan = ""+has;
            intent.putExtra("hasilnya", tampilkan);
            startActivity(intent);
        }catch (Exception e){}
    }

    public void btn2(View view) {
        try{
            intent = new Intent(MainActivity.this, DetailActivity.class);
            int nil1 = Integer.parseInt(teks1.getText().toString());
            int nil2 = Integer.parseInt(teks2.getText().toString());
            int has = nil1 - nil2;
            String tampilkan = ""+has;
            intent.putExtra("hasilnya", tampilkan);
            startActivity(intent);
        }catch (Exception e){}
    }

    public void btn3(View view) {
        try{
            intent = new Intent(MainActivity.this, DetailActivity.class);
            int nil1 = Integer.parseInt(teks1.getText().toString());
            int nil2 = Integer.parseInt(teks2.getText().toString());
            int has = nil1 * nil2;
            String tampilkan = ""+has;
            intent.putExtra("hasilnya", tampilkan);
            startActivity(intent);
        }catch (Exception e){}
    }

    public void btn4(View view) {
        try{
            intent = new Intent(MainActivity.this, DetailActivity.class);
            Float nil1 = Float.parseFloat(teks1.getText().toString());
            Float nil2 = Float.parseFloat(teks2.getText().toString());
            Float has = nil1 / nil2;
            String tampilkan = ""+has;
            intent.putExtra("hasilnya", tampilkan);
            startActivity(intent);
        }catch (Exception e){}
    }
}
