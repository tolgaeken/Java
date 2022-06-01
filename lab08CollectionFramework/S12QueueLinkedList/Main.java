package lab08CollectionFramework.S12QueueLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        for (String s : queue){
            System.out.println(s);
        }

        System.out.println("**************");
        System.out.println("Eleman cikariliyor : " + queue.poll());
        System.out.println("**************");

        for (String s : queue){
            System.out.println(s);
        }

        System.out.println("**************");
        System.out.println(queue.isEmpty());
        System.out.println("**************");

        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor : " + queue.poll());
        }

        System.out.println("**************");
        System.out.println(queue.isEmpty());
        System.out.println("**************");
    }
}
