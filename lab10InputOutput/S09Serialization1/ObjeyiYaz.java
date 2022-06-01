package lab10InputOutput.S09Serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {
        String filePath = "src\\lab10InputOutput\\S09Serialization1\\ogrenci.bin";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            Ogrenci ogrenci1 = new Ogrenci("Tolga",1234,"Bilgisayar Muhendisligi");
            Ogrenci ogrenci2 = new Ogrenci("Oguz",678,"Finansal Matematik");

            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya olusturulurken bir hata olustu");
        }
    }
}
