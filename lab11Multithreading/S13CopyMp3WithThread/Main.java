package lab11Multithreading.S13CopyMp3WithThread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void main(String[] args) {

        dosyaOku();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("src\\lab11Multithreading\\S13CopyMp3WithThread\\target\\sound2.mp3");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("src\\lab11Multithreading\\S13CopyMp3WithThread\\target\\sound3.mp3");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("src\\lab11Multithreading\\S13CopyMp3WithThread\\target\\sound4.mp3");
            }
        });

        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
        }

        long bitis = System.currentTimeMillis();

        System.out.println("3 dosyanin kopyalanma suresi : " + ((double)(bitis - baslangic) / 1000) + " saniye.");
    }

    public static void dosyaOku() {
        try {
            FileInputStream in = new FileInputStream("src\\lab11Multithreading\\S13CopyMp3WithThread\\source\\sound.mp3");

            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        }
    }

    public static void kopyala(String dosyaIsmi) {
        try {
            FileOutputStream out = new FileOutputStream(dosyaIsmi);

            for (int deger : icerik) {
                out.write(deger);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        }
    }
}
