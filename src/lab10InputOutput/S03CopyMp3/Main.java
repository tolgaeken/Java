package lab10InputOutput.S03CopyMp3;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    public static void main(String[] args) {

        dosyaOku();
        long baslangic = System.currentTimeMillis();
        kopyala("src\\lab10InputOutput\\S03CopyMp3\\target\\sound.mp3");
        kopyala("src\\lab10InputOutput\\S03CopyMp3\\target\\sound2.mp3");
        kopyala("src\\lab10InputOutput\\S03CopyMp3\\target\\sound3.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println("3 dosyanin kopyalanma suresi : " + ((bitis-baslangic)/1000) + " saniye.");
    }

    public static void dosyaOku(){
        try {
            FileInputStream in = new FileInputStream("src\\lab10InputOutput\\S03CopyMp3\\source\\sound.mp3");

            int oku;
            while ((oku = in.read()) != -1){
                icerik.add(oku);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        }
    }

    public static void kopyala(String dosyaIsmi){
        try {
            FileOutputStream out = new FileOutputStream(dosyaIsmi);

            for (int deger : icerik){
                out.write(deger);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        }
    }
}
