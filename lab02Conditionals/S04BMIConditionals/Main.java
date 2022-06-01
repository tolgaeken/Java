package lab02Conditionals.S04BMIConditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilo Giriniz : ");
        int kilo = scanner.nextInt();

        System.out.print("Boy Giriniz : ");
        double boy = scanner.nextInt();

        double bki = (kilo / (boy * boy) * 10000);

        if (bki < 18.5) {
            System.out.println("Zayif");
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        } else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla kilolu");
        } else if (bki >= 30) {
            System.out.println("Obez");
        }
    }
}
