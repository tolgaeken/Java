package mmc.lab.lab049Foreach;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Elma", "Armut", "Kiraz"};
        for (String eleman : array) {
            System.out.println(eleman);
        }

        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        for (int i : array2) {
            System.out.println(i);
        }

        Deneme[] array3 = {new Deneme("Tolga"), new Deneme("Ahmet")};
        for (Deneme d : array3) {
            d.yaz();
        }
    }
}
