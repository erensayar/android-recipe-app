package com.example.erensayar_yemektarifi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    //**************************Ana Sayfa onClick Metodları ****************************************
    public void yemekTarifleri(View view) {
        Intent intent = new Intent(this, anaSayfa_yemekTarifleri.class);
        startActivity(intent);

    }

    public void favoriler(View view) {
        Intent intent = new Intent(this, anaSayfa_favoriler.class);
        startActivity(intent);
    }
    //**************************Ana Sayfa onClick Metodları -Son* **********************************

}
