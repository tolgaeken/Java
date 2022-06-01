package lab10InputOutput.S10Serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {
        String filePath = "src\\lab10InputOutput\\S10Serialization2\\ogrenciler.bin";

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Ogrenci[] ogrenciArray = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) in.readObject();

            System.out.println("***************************");
            for (Ogrenci o : ogrenciArray){
                System.out.println(o);
                System.out.println("****************");
            }
            System.out.println("***************************");
            for (Ogrenci o : ogrenciList){
                System.out.println(o);
                System.out.println("****************");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken bir hata olustu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sinif bulunamadi");
        }
    }
}
