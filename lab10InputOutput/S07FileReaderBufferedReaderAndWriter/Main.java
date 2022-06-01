package lab10InputOutput.S07FileReaderBufferedReaderAndWriter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "src\\lab10InputOutput\\S07FileReaderBufferedReaderAndWriter\\ogrenciler.txt";
        //fileReader(filePath);
        //bufferedReader(filePath);
        bufferedWriter(filePath);
    }

    public static void fileReader(String filePath) {

        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(",");

                if (array[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println("Ogrenci bilgisi : " + ogrenciBilgisi);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken bir hata olustu");
        }
    }

    public static void bufferedReader(String filePath) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)))) {
            while (scanner.hasNextLine()) {
                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(",");

                if (array[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println("Ogrenci bilgisi : " + ogrenciBilgisi);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken bir hata olustu");
        }
    }

    public static void bufferedWriter(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("Ali Ozan,İnşaat Mühendisliği\n");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu");
        }
    }
}