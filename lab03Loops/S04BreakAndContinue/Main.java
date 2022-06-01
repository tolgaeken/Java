package lab03Loops.S04BreakAndContinue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*while (true) {
            System.out.print("Bir sayi giriniz : ");
            int islem = scanner.nextInt();
            if (islem == -1) {
                System.out.println("Donguden cikiliyor");
                break;
            }
        }*/

        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
