package lab10InputOutput.S10Serialization2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Tolga", 1234, "Bilgisayar Muhendisligi");
        Ogrenci ogrenci2 = new Ogrenci("Oguz", 678, "Finansal Matematik");
        Ogrenci ogrenci3 = new Ogrenci("Mehmet", 123, "Bilgisayar Muhendisligi");

        Ogrenci[] ogrenciArray = {ogrenci1, ogrenci2, ogrenci3};
        ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));

        String filePath = "src\\lab10InputOutput\\S10Serialization2\\ogrenciler.bin";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {

            out.writeObject(ogrenciArray);
            out.writeObject(ogrenciList);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya olusturulurken bir hata olustu");
        }
    }
}
