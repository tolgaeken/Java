package lab10InputOutput.S09Serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        String filePath = "src\\lab10InputOutput\\S09Serialization1\\ogrenci.bin";

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();

            System.out.println("**************");
            System.out.println(ogrenci1);
            System.out.println("**************");
            System.out.println(ogrenci2);
            System.out.println("**************");

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken bir hata olustu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sinif bulunamadi");
        }
    }
}
