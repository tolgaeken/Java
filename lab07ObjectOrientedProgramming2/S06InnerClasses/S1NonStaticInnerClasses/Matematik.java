package lab07ObjectOrientedProgramming2.S06InnerClasses.S1NonStaticInnerClasses;

import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;

    public class Factorial {
        public void faktoriyel() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayi giriniz : ");
            int sayi = scanner.nextInt();
            int fakt = 1;

            for (int i = 2; i <= sayi; i++) {
                fakt *= i;
            }
            System.out.println("Faktoriyel : " + fakt);
        }
    }

    public class Asal {
        public boolean asalMi(int sayi) {
            int i = 2;
            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Alan {

        public class DaireAlan {
            public void daireAlan(int yaricap) {
                System.out.println("Dairenin alani : " + (PI * yaricap * yaricap));
            }
        }


    }
}
