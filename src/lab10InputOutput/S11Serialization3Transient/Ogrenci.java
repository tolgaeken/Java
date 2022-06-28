package lab10InputOutput.S11Serialization3Transient;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private String isim;
    private transient int id;
    private String bolum;
    private static int ogrenciSayisi;


    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi) {
        Ogrenci.ogrenciSayisi = ogrenciSayisi;
    }

    @Override
    public String toString() {
        String bilgiler = "Ogrenci Bilgileri : " + isim + "\nOgrenci Numarasi : " + id + "\nOgrenci Bolum : " + bolum;
        return bilgiler;
    }
}
