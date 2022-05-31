package mmc.lab.lab026MethodParameters;

public class Main {
    public static void main(String[] args) {
        selamla("Tolga");
        selamla("Abc");
        toplama(2, 3, 5);
    }

    public static void selamla(String isim) {
        System.out.println("Merhaba " + isim);
    }

    public static void toplama(int a, int b, int c) {
        System.out.println(a + ", " + b + " ve " + c + " sayilarinin toplami = " + (a + b + c));
    }
}
