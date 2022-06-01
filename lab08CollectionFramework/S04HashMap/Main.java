package lab08CollectionFramework.S04HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "PHP");
        hashMap.put(20, "PHP");
        hashMap.put(20, "PHP");
        hashMap.put(50,"JavaScript");

/*
        System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(100));
*/

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Anahtar : " + entry.getKey() + " - Deger : " + entry.getValue());
        }
    }
}
