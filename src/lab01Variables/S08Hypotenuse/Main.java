package lab01Variables.S08Hypotenuse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Kenari Giriniz : ");
        int birinciKenar = scanner.nextInt();
        System.out.print("Ikinci Kenari Giriniz : ");
        int ikinciKenar = scanner.nextInt();

        double hipotenus = Math.sqrt(birinciKenar * birinciKenar + ikinciKenar * ikinciKenar);
        System.out.println("Hipotenus : " + hipotenus);
    }
}
