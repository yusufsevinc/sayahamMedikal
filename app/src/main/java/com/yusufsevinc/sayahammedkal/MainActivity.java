package com.yusufsevinc.sayahammedkal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void hakkimizda(View view){
        intent = new Intent(MainActivity.this,hakkimizda.class);
        startActivity(intent);

    }

    public void urunler(View view){
        intent = new Intent(MainActivity.this,urunler.class);
        startActivity(intent);

    }
}
