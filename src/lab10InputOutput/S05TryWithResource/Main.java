package lab10InputOutput.S05TryWithResource;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String path1 = "src\\\\lab10InputOutput\\\\S05TryWithResource\\\\dosya1.txt";
        String path2 = "src\\\\lab10InputOutput\\\\S05TryWithResource\\\\dosya2.txt";
        try (FileWriter writer1 = new FileWriter(path1, true);
             FileWriter writer2 = new FileWriter(path2, true)) {
            writer1.write("Deneme1\nDeneme2\n");
        } catch (IOException e) {
            System.out.println("Dosya olusturulurken bir hata olustu");
        }*/

        String path = "src\\\\lab10InputOutput\\\\S05TryWithResource\\\\diller.txt";
        try (FileWriter writer = new FileWriter(path, true)) {
            Scanner scanner = new Scanner(System.in);
            String dil;
            while (true){
                System.out.print("Bir dil giriniz : ");
                dil = scanner.nextLine();


                if (dil.equals("-1")){
                    System.out.println("Programdan cikiliyor");
                    System.out.println("Dosyayi kontrol ediniz");
                    break;
                }

                writer.write(dil + "\n");
            }
        } catch (IOException e) {
            System.out.println("Dosya olusturulurken bir hata olustu");
        }
    }
}
