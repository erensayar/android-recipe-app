package com.example.erensayar_yemektarifi.model;

public class yemekTarifi {

    private String isim;
    //private int resim;
    private int hazirlanisSuresi;
    private String malzemeler;
    private String tarif;


    public yemekTarifi(String isim, int hazirlanisSuresi, String malzemeler, String tarif) {
        this.isim = isim;
        this.hazirlanisSuresi = hazirlanisSuresi;
        this.malzemeler = malzemeler;
        this.tarif = tarif;
    }

    public yemekTarifi() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getHazirlanisSuresi() {
        return hazirlanisSuresi;
    }

    public void setHazirlanisSuresi(int hazirlanisSuresi) {
        this.hazirlanisSuresi = hazirlanisSuresi;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(String malzemeler) {
        this.malzemeler = malzemeler;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
}
