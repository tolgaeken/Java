package lab10InputOutput.S08GradeCalculation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "src\\lab10InputOutput\\S08GradeCalculation\\dosya.txt";
        String taretPath = "src\\lab10InputOutput\\S08GradeCalculation\\harfnotlari.txt";
        try(Scanner scanner = new Scanner(new FileReader(filePath));
            FileWriter writer = new FileWriter(taretPath)){

            while (scanner.hasNextLine()){
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1Not = Integer.valueOf(ogrenciArray[1]);
                int vize2Not = Integer.valueOf(ogrenciArray[2]);
                int finalNot = Integer.valueOf(ogrenciArray[3]);
                String cikti = harfNotuHesapla(ogrenciArray[0],vize1Not,vize2Not,finalNot);
                writer.write(cikti + "\n");


            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        }

    }

    public static String harfNotuHesapla(String isim, int vize1Not, int vize2Not, int finalNot) {
        String cikti = "";
        double toplamNot = (vize1Not * 0.3) + (vize2Not * 0.3) + (finalNot * 0.4);

        if (toplamNot >= 90) {
            cikti = isim + " bu dersten AA aldi";
        } else if (toplamNot >= 85) {
            cikti = isim + " bu dersten BA aldi";
        } else if (toplamNot >= 80) {
            cikti = isim + " bu dersten BB aldi";
        } else if (toplamNot >= 75) {
            cikti = isim + " bu dersten CB aldi";
        } else if (toplamNot >= 70) {
            cikti = isim + " bu dersten CC aldi";
        } else if (toplamNot >= 65) {
            cikti = isim + " bu dersten DC aldi";
        } else if (toplamNot >= 60) {
            cikti = isim + " bu dersten DD aldi";
        } else if (toplamNot >= 55) {
            cikti = isim + " bu dersten FD aldi";
        } else {
            cikti = isim + " bu dersten FF aldi";
        }

        return cikti;

    }
}
