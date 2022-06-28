package lab10InputOutput.S12SaveMemoryGameWithSerialization;

import java.io.*;

public class OyunKayit {
    static String filePath = "src\\lab10InputOutput\\S12SaveMemoryGameWithSerialization\\kayit.bin";

    public static void oyunKaydet(Kart[][] kartlar){


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){
            System.out.println("Oyun kaydediliyor");
            out.writeObject(kartlar);


        } catch (IOException e) {
            System.out.println("Oyun kaydedilirken bir hata olustu");
        }


    }

    public static Kart[][] kayittanAl(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
            Kart[][] cikti = (Kart[][]) in.readObject();
            return cikti;

        } catch (IOException e) {
            System.out.println("Oyun yuklenirken bir hata olustu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sinif bulunamadi");
        }

        return null;
    }
}
