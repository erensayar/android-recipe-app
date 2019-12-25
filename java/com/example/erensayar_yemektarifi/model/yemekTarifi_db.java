package com.example.erensayar_yemektarifi.model;

public class yemekTarifi_db {
    public static final String TABLE_NAME = "yemekTarifi_db";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_YEMEK_ISIM = "yemekIsim";
    public static final String COLUMN_RESIM = "resim";
    public static final String COLUMN_SURE = "sure";
    public static final String COLUMN_MALZEMELER = "malzemeler";
    public static final String COLUMN_TARIF = "tarif";

    private String yemekIsim;
    private int resim;
    private int hazirlanisSuresi;
    private String malzemeler;
    private String tarif;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_YEMEK_ISIM + " TEXT,"
                    + COLUMN_RESIM + " TEXT,"
                    + COLUMN_SURE + " TEXT,"
                    + COLUMN_MALZEMELER + " TEXT,"
                    + COLUMN_TARIF + " TEXT"
                    + ")";


    public yemekTarifi_db(String yemekIsim, int resim, int hazirlanisSuresi, String malzemeler, String tarif) {
        this.yemekIsim = yemekIsim;
        this.resim = resim;
        this.hazirlanisSuresi = hazirlanisSuresi;
        this.malzemeler = malzemeler;
        this.tarif = tarif;
    }


    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getColumnId() {
        return COLUMN_ID;
    }

    public static String getColumnYemekIsim() {
        return COLUMN_YEMEK_ISIM;
    }

    public static String getColumnResim() {
        return COLUMN_RESIM;
    }

    public static String getColumnSure() {
        return COLUMN_SURE;
    }

    public static String getColumnMalzemeler() {
        return COLUMN_MALZEMELER;
    }

    public static String getColumnTarif() {
        return COLUMN_TARIF;
    }

    public String getYemekIsim() {
        return yemekIsim;
    }

    public void setYemekIsim(String yemekIsim) {
        this.yemekIsim = yemekIsim;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
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

    public static String getCreateTable() {
        return CREATE_TABLE;
    }
}






