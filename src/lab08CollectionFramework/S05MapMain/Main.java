package lab08CollectionFramework.S05MapMain;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        mapYazdir(hashMap);
        mapYazdir(linkedHashMap);
        mapYazdir(treeMap);

    }

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        /*System.out.println("******************");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Anahtar : " + entry.getKey() + " - Deger : " + entry.getValue());
        }
        System.out.println("******************");*/


        //System.out.println(map.keySet());
        System.out.println("******************");
        for (Integer key : map.keySet()){
            System.out.println("Key : " + key + " - Value : " + map.get(key));
        }
        System.out.println("******************");


        /*Collection<String> values = map.values();
        System.out.println("******************");
        for (String s : values) {
            System.out.println("Deger : " + s);
        }
        System.out.println("******************");*/


    }
}
