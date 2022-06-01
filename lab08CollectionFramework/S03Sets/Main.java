package lab08CollectionFramework.S03Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");

        //LinkedHastSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("Php");

        //TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Php");

        System.out.println("HastSet*******");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("LinkedHastSet*******");
        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println("TreeSet*******");
        for (String s : set3) {
            System.out.println(s);
        }

        System.out.println("**************");
        System.out.println(set1.contains("GO"));
        System.out.println(set1.contains("Java"));
        System.out.println("**************");
        System.out.println(set1.isEmpty());
        System.out.println("**************");
        System.out.println(set1.remove("Java"));*/

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("JavaScript");
        set1.add("Php");


        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        /*Set<String> fark = new HashSet<String>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);*/

        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);

    }
}
