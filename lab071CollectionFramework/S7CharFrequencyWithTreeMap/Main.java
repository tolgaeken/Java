package mmc.lab.lab071CollectionFramework.S7CharFrequencyWithTreeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumleyi giriniz : ");
        String cumle = scanner.nextLine();
        Map<Character, Integer> frekans = new TreeMap<Character, Integer>();

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            } else {
                frekans.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter : " + entry.getKey() + " - " + entry.getValue() + " kadar geciyor");
        }

    }
}
