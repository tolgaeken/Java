package lab08CollectionFramework.S01ArrayListMain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println("************");
        for (String s : list){
            System.out.println(s);
        }
    }
}
