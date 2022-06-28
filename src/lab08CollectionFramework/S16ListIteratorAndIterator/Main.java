package lab08CollectionFramework.S16ListIteratorAndIterator;

import java.util.*;

public class Main {

     /*
    ListIterator

    Sadece List Interface'i implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır.
    Ekstradan add() metodu bulunur.

    Iterator:

    Set , Queue ve List Interface'i implement'e eden classlarda kullanılabilir.
    previous() metodu yoktur.

    */

    public static void main(String[] args) {
        /*Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("**************");

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }*/

        List<String> list2 = new ArrayList<String>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");
        list2.add("Go");
        ListIterator<String> iterator = list2.listIterator();
        /*while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }*/

        while (iterator.hasNext()){
            String value = iterator.next();
            if(value.equals("Go")){
                iterator.remove();
            }
        }
        for (String s : list2){
            System.out.println(s);
        }
    }
}
