package lab09Exceptions.S03ThrowsKeyword;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        try{
            mekanKontrol(yas);
        } catch (IOException exc){
            System.out.println("18 yasindan kucukler giremez");
            System.out.println("IOException olustu");
        }

    }

    public static void mekanKontrol(int yas) throws IOException{
        if (yas < 18){
            throw new IOException();
        } else {
            System.out.println("Mekana hosgeldiniz");
        }
    }
}
