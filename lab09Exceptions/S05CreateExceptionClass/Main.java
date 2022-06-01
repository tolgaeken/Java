package lab09Exceptions.S05CreateExceptionClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();

        try {
            mekanKontrol(yas);
        } catch (InvalidAgeException e){
            e.printStackTrace();
            System.out.println(e);
        }

    }

    public static void mekanKontrol(int yas){
        if (yas < 18){
            throw new InvalidAgeException("Invalid age");
        } else {
            System.out.println("Mekana hosgeldiniz");
        }
    }
}
