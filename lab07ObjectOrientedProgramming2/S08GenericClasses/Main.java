package lab07ObjectOrientedProgramming2.S08GenericClasses;

public class Main {
    public static void main(String[] args) {
        Character[] charDizi = {'J', 'A', 'V', 'A'};
        Integer[] intDizi = {1, 2, 3, 4, 5, 6};
        String[] stringDizi = {"Java", "Python", "C++", "Php"};
        Ogrenci[] ogrenciDizi = {new Ogrenci("Tolga"), new Ogrenci("Ahmet"), new Ogrenci("Mehmet")};

        /*CharYazdir.yazdir(charDizi);
        System.out.println("**********");
        IntYazdir.yazdir(intDizi);
        System.out.println("**********");
        StringYazdir.yazdir(stringDizi);
        System.out.println("**********");
        OgrenciYazdir.yazdir(ogrenciDizi);*/

        YazdirmaSinifi<Character> charYazdir = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> stringYazdir = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> intYazdir = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> ogrenciYazdir = new YazdirmaSinifi<Ogrenci>();


        charYazdir.yazdir(charDizi);
        System.out.println("**********");
        stringYazdir.yazdir(stringDizi);
        System.out.println("**********");
        intYazdir.yazdir(intDizi);
        System.out.println("**********");
        ogrenciYazdir.yazdir(ogrenciDizi);

    }
}
