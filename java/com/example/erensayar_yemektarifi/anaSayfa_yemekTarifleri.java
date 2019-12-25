package com.example.erensayar_yemektarifi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.erensayar_yemektarifi.model.yemekTarifi;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;


public class anaSayfa_yemekTarifleri extends AppCompatActivity {

    final List<yemekTarifi> yemekTarifleriList = new ArrayList<yemekTarifi>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa_yemek_tarifleri);

        //Favori Yemekler - Nesne
        //******************************************************************************************
        yemekTarifleriList.add(new yemekTarifi("Domates Çorbası",  35, "Tere Yağı, Un, Domates",yemekTarifleri.domatesCorbasi ));
        yemekTarifleriList.add(new yemekTarifi("Yayla Çorbası", 35, "Yoğurt,Nane,Pirinç",yemekTarifleri.yaylacorbasi ));
        yemekTarifleriList.add(new yemekTarifi("Tarhana Çorbası", 35, "Tarhana,Tuz,Nane",yemekTarifleri.tarhanaCorbasi ));
        yemekTarifleriList.add(new yemekTarifi("Fırında Köfte", 55, "350gr Dana Kıyma, Yumurta, Soğan, maydonoz, ekmek", yemekTarifleri.firindakofte));
        yemekTarifleriList.add(new yemekTarifi("Dana Rosto", 65, "sarımsak,et,tereyağı,havuç", yemekTarifleri.danarosto));
        yemekTarifleriList.add(new yemekTarifi("Falafel", 45, "Biber,soğan,galeta unu,tahin,yoğurt", yemekTarifleri.falafel));
        yemekTarifleriList.add(new yemekTarifi("Fettucini Alfredo", 40, "tavuk göğsü 250 gr, mantar,Tereyağı", yemekTarifleri.fettucinialfredo));
        yemekTarifleriList.add(new yemekTarifi("Güveç", 75, "Domates,Patlıcan", yemekTarifleri.güvec));
        yemekTarifleriList.add(new yemekTarifi("İnegöl Köfte", 45, "Kıyma,Ekmek,Soğan", yemekTarifleri.inegolkofte));
        yemekTarifleriList.add(new yemekTarifi("Kaburga Dolması", 45, "Pirinç,Tereyağı,Soğan", yemekTarifleri.kaburgadolması));
        yemekTarifleriList.add(new yemekTarifi("Kazandibi", 120, "Süt,Şeker", yemekTarifleri.kazandibi));
        yemekTarifleriList.add(new yemekTarifi("Lazanya", 30, "Biber,Yağ,Domates", yemekTarifleri.lazanya));
        yemekTarifleriList.add(new yemekTarifi("Tavuk Güveç", 80, "Tavuk Göğsü 250 gr,", yemekTarifleri.tavukguvec));
        yemekTarifleriList.add(new yemekTarifi("Sac Kavurma", 30, "Et", yemekTarifleri.sackavurma));
        yemekTarifleriList.add(new yemekTarifi("Revani Tatlısı", 45, "Şeker,İrmik,Un,Yumurta", yemekTarifleri.revani));
        yemekTarifleriList.add(new yemekTarifi("Muzlu Rulo Pasta", 25, "Muz,Şeker,Yumurta", yemekTarifleri.muzlurulopasta));
        yemekTarifleriList.add(new yemekTarifi("Bulgur Pilavı - Patlıcanlı", 35, "Patlıcan,Bulgut", yemekTarifleri.patlicanlibulgurpilavi));
        yemekTarifleriList.add(new yemekTarifi("Perde Pilavı", 30, "Pirinç,Tereyağı", yemekTarifleri.perdepilavi));
        //******************************************************************************************


        //Listview tanımlandı ve bu listview'in adapter'ü ayarlandı.
        //******************************************************************************************
        final ListView listView = (ListView) findViewById(R.id.lw_yemekTarifleri);
        customAdapter adapter = new customAdapter(this, yemekTarifleriList);
        listView.setAdapter(adapter);
        //******************************************************************************************





        //listviewde bir elemana bastığımızda olanlar burda (Gönderici)
        //******************************************************************************************
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.yemek_tarifi_yemek_tarifleri);
                yemekTarifi secilenYemek = yemekTarifleriList.get(position);

                //Log.d("OnClick", "position = " + yemekTarifleriList.get(position));


                //Elemanları layouta bastırmak için bu verileri öbür activity'e yani istediğimiz layouta göndermeliyiz. O da intent.putextra ile oluyor.
                Intent intent = new Intent(getApplicationContext(), yemekTarifiAdapter.class);

                intent.putExtra("isim", secilenYemek.getIsim());
                intent.putExtra("malzemeler", secilenYemek.getMalzemeler());
                intent.putExtra("tarif", secilenYemek.getTarif());
                intent.putExtra("sure", secilenYemek.getHazirlanisSuresi());

                startActivity(intent);

            }
        });
        //******************************************************************************************


    }//onCreate Sonu
}

