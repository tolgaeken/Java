package lab10InputOutput.S02FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        File file = new File("src\\lab10InputOutput\\S02FileInputStream\\dosya.txt");

        try {
            fis = new FileInputStream(file);

            /*System.out.println("Birinci karakter : " + (char) fis.read());
            System.out.println("Ikinci karakter : " + (char) fis.read());
            System.out.println("Ucuncu karakter : " + (char) fis.read());*/

            /*fis.skip(5);
            System.out.println("5. karakterden sonra ilk okunan karakter : " + (char) fis.read());
            System.out.println("5. karakterden sonra ikinci okunan karakter : " + (char) fis.read());*/

            /*int deger;
            String s = "";
            while ((deger = fis.read()) != -1){
                s += (char) deger;
            }
            System.out.println("Dosyanin tam icerigi : " + s);*/

            int deger;
            String s = "";
            int say = 0;
            fis.skip(5);
            while ((deger = fis.read()) != -1){
                s += (char) deger;
                say++;
                if (say == 10){
                    break;
                }
            }
            System.out.println("Dosyanin 5. yerinden itibaren 10 karakter : " + s);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu");
            }
        }
    }
}
