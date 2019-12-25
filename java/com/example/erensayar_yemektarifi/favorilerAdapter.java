package com.example.erensayar_yemektarifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.erensayar_yemektarifi.anaSayfa_favoriler.favorilerList;

public class favorilerAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yemek_tarifi_favoriler);


        ImageView yemekResim = (ImageView) findViewById(R.id.iw_yemekResim_favoriler);
        TextView yemekIsim = (TextView) findViewById(R.id.tw_yemekIsim_favoriler);
        TextView yemekSure = (TextView) findViewById(R.id.tw_yemekSure_favoriler);
        TextView yemekMalzemeler = (TextView) findViewById(R.id.tw_malzemeler_favoriler);
        TextView yemekTarif = (TextView) findViewById(R.id.tw_tarif_favoriler);


        //Alıcı
        String isim = getIntent().getExtras().getString("isim");
        String malzemeler = getIntent().getExtras().getString("malzemeler");
        String tarif = getIntent().getExtras().getString("tarif");
        int sure = getIntent().getExtras().getInt("sure");



        yemekIsim.setText(isim);
        yemekSure.setText(String.valueOf(sure));
        yemekMalzemeler.setText(malzemeler);
        yemekTarif.setText(tarif);


    }//OnCreate Sonu


    //OnClick Metodu
    /*
    public void favorilerdencikar(View view){
        ListView lw = (ListView) findViewById(R.id.lw_favoriler);

    }
    */
}
