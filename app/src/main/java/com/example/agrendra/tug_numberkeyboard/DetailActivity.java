package com.example.agrendra.tug_numberkeyboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView hasil1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        hasil1 = (TextView)findViewById(R.id.hasil);

        Intent intent = getIntent();
        hasil1.setText(intent.getStringExtra("hasilnya"));
    }
}
