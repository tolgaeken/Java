package lab01Variables.S04Scanner2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String isim = scanner.nextLine();
        int yas = scanner.nextInt();
        System.out.println("Yas: " + yas);
        System.out.println("Isim: " + isim);
    }
}
