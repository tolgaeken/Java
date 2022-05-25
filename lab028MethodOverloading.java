package mmc.lab;

public class lab028MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Iki sayinin toplami : " + topla(3, 4));
        System.out.println("Uc sayinin toplami : " + topla(3, 4, 5));
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }
}
