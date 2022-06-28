package lab04Methods.S05PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (asalMi(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
