package lab06Arrays.S01Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] a = new int[10];
        a[2] = 20;*/

        /*int[] a = {30,40,50,60,70};
        System.out.println(a[3]);*/

        /*int[] a = new int[5];
        for (int i = 0;i<5;i++){
            a[i] = i*4;
            System.out.println(a[i]);
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0;i<5;i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i<5;i++){
            System.out.println(a[i]);
        }*/

        /*int[] b = {10, 20, 30, 40, 50};
        System.out.println("Arrayimizin uzunlugu : " + b.length);*/

        int[] b = {10, 20, 30, 40, 50};
        arrayiBastir(b);

        int[] c = {30, 20, 30, 20, 30};
        System.out.println(ortalamaBul(c));
    }


    public static void arrayiBastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
        }
    }

    public static double ortalamaBul(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return toplam / array.length;
    }
}
