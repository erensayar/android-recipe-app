package com.example.erensayar_yemektarifi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.erensayar_yemektarifi.model.yemekTarifi;

import java.util.ArrayList;
import java.util.List;


public class anaSayfa_favoriler extends AppCompatActivity {

    final static List<yemekTarifi> favorilerList = new ArrayList<yemekTarifi>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa_favoriler);



        //listviewde bir elemana bastığımızda olanlar burda (Gönderici)
        //******************************************************************************************
        final ListView listView = (ListView) findViewById(R.id.lw_favoriler);
        customAdapter adapter = new customAdapter(this, favorilerList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.yemek_tarifi_yemek_tarifleri);
                yemekTarifi secilenYemek = favorilerList.get(position);


                //Elemanları layouta bastırmak için bu verileri öbür activity'e yani istediğimiz layouta göndermeliyiz. O da intent.putextra ile oluyor.
                Intent intent = new Intent(getApplicationContext(), favorilerAdapter.class);

                intent.putExtra("isim", secilenYemek.getIsim());
                intent.putExtra("malzemeler", secilenYemek.getMalzemeler());
                intent.putExtra("tarif", secilenYemek.getTarif());
                intent.putExtra("sure", secilenYemek.getHazirlanisSuresi());

                startActivity(intent);

            }
        });
        //******************************************************************************************

    }
}
