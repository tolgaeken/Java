package mmc.lab.lab044Beyblade;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade programina hosgeldiniz");
        System.out.println("Cikis icin q ya basin");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Hangi beybladei uretmek istiyorsunuz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor");
                break;
            } else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
