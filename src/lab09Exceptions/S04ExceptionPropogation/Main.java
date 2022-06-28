package lab09Exceptions.S04ExceptionPropogation;

public class Main {
    public static void main(String[] args) {
        birinciFonksiyon();
    }

    public static void ucuncuFonksiyon() {
        int a = 12 / 0;
    }

    public static void ikinciFonksiyon() {
        try {
            ucuncuFonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Sayi 0 a bolunemez");
        }

    }

    public static void birinciFonksiyon() {
        ikinciFonksiyon();
    }
}
