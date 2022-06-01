package lab06Arrays.S09Strings;

public class Main {
    public static void main(String[] args) {
        String a = "Tolga";
        String b = new String("Tolga");

        System.out.println(b);

        System.out.println("Harf Sayisi : " + b.length());
        System.out.println("0. Indeks : " + b.charAt(0));
        System.out.println("2. Indeks : " + b.charAt(2));
        System.out.println("Son eleman : " + b.charAt(b.length()-1));

        /*for (int i = 0;i<b.length();i++){
            System.out.println(b.charAt(i));
        }*/

        System.out.println(b.startsWith("To"));
        System.out.println(b.endsWith("a"));
        System.out.println(b.contains("l"));
        System.out.println(b.indexOf("g"));
        System.out.println(b.lastIndexOf("o"));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());

        String c = "1923";
        int d = Integer.parseInt(c);
        System.out.println(d-4);

        int e = 1923;
        String f = String.valueOf(e);
        System.out.println(f);


    }
}
