package lab09Exceptions.S02ThrowKeyword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        try{
            mekanKontrol(yas);
        } catch (ArithmeticException exc){
            System.out.println("18 yasindan kucukler giremez");
        }


    }

    public static void mekanKontrol(int yas){
        if (yas < 18){
            throw new ArithmeticException();
        } else {
            System.out.println("Mekana hosgeldiniz");
        }
    }
}

