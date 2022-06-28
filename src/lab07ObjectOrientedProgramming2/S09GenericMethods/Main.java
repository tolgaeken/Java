package lab07ObjectOrientedProgramming2.S09GenericMethods;


public class Main {
    public static void main(String[] args) {
        /*Character[] charDizi = {'J', 'A', 'V', 'A'};
        Integer[] intDizi = {1, 2, 3, 4, 5, 6};
        String[] stringDizi = {"Java", "Python", "C++", "Php"};
        Ogrenci[] ogrenciDizi = {new Ogrenci("Tolga"), new Ogrenci("Ahmet"), new Ogrenci("Mehmet")};

        yazdir(charDizi);
        System.out.println("*************");
        yazdir(intDizi);
        System.out.println("*************");
        yazdir(stringDizi);
        System.out.println("*************");
        yazdir(ogrenciDizi);*/


        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
        Sayisal birinci = birinci(sayisal1, sayisal2);
        System.out.println("Sayisal birinci ogrencinin puani : " + birinci.puanHesapla());

        EsitAgirlik esitAgirlik1 =  new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2 =  new EsitAgirlik(40,10,50,0);
        EsitAgirlik birinci2 = birinci(esitAgirlik1,esitAgirlik2);
        System.out.println("Esit agirlik birinci ogrencinin puani : " + birinci2.puanHesapla());

    }

    public static <E extends Aday> E birinci(E e1, E e2) {
        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;
        } else {
            return e2;
        }
    }

    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        }
    }
}
