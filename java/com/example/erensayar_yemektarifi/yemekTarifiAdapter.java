package com.example.erensayar_yemektarifi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.erensayar_yemektarifi.model.yemekTarifi;

import static com.example.erensayar_yemektarifi.anaSayfa_favoriler.favorilerList;

public class yemekTarifiAdapter extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yemek_tarifi_yemek_tarifleri);

        ImageView yemekResim = (ImageView) findViewById(R.id.iw_yemekResim);
        TextView yemekIsim = (TextView) findViewById(R.id.tw_yemekIsim);
        TextView yemekSure = (TextView) findViewById(R.id.tw_yemekSure);
        TextView yemekMalzemeler = (TextView) findViewById(R.id.tw_malzemeler);
        TextView yemekTarif = (TextView) findViewById(R.id.tw_tarif);


        //Alıcı
        String isim = getIntent().getExtras().getString("isim");
        String malzemeler = getIntent().getExtras().getString("malzemeler");
        String tarif = getIntent().getExtras().getString("tarif");
        int sure = getIntent().getExtras().getInt("sure");



        yemekIsim.setText(isim);
        yemekSure.setText(String.valueOf(sure));
        yemekMalzemeler.setText(malzemeler);
        yemekTarif.setText(tarif);

/*

        Log.d("TAGG",isim);
        Log.d("TAGG",malzemeler);
        Log.d("TAGG",tarif);

 */

    }//OnCreate Sonu

    //OnClick Metodu
    public void favorilereEkle(View view){

        String isim = getIntent().getExtras().getString("isim");
        String malzemeler = getIntent().getExtras().getString("malzemeler");
        String tarif = getIntent().getExtras().getString("tarif");
        int sure = getIntent().getExtras().getInt("sure");

        yemekTarifi yemekTarifi = new yemekTarifi(isim,sure,malzemeler,tarif);
        favorilerList.add(yemekTarifi);
    }

}
