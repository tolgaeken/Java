package mmc.lab.lab051Singer;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("Sarkici listesinde " + sarkiciListesi.size() + " kadar sarkici var");
        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println((i+1) + " .Sarkici : " + sarkiciListesi.get(i));
        }
    }

    public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println("Sarkici listesi guncellendi");
    }

    public void sarkiciGuncelle(String yeniIsim,int pozisyon){
        sarkiciListesi.set(pozisyon,yeniIsim);
        System.out.println("Sarkici listesi guncellendi");
    }

    public void sarkiciSil(int pozisyon){
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);

        System.out.println(isim + " isimli sarkici listeden silindi");
    }

    public void sarkiciAra(String sarkiciIsmi){
        int pozisyon = sarkiciListesi.indexOf(sarkiciIsmi);

        if (pozisyon >= 0){
            System.out.println("Sarkici bulundu");
            System.out.println(sarkiciIsmi + " isimli sarkici " + (pozisyon+1) + ". pozisyonda");
        } else {
            System.out.println("Sarkici bulunamadi");
        }


    }
}
