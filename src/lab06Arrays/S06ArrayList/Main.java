package lab06Arrays.S06ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Metallica");
        arrayList.add("Guns n Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        /*System.out.println("*****");
        arrayList.remove("Metallica");

        for (String eleman : arrayList) {
            System.out.println(eleman);
        }


        System.out.println("*****");
        arrayList.remove(2);

        for (String eleman : arrayList) {
            System.out.println(eleman);
        }*/

        System.out.println(arrayList.indexOf("Metallica"));
        System.out.println(arrayList.indexOf("Dream Theater"));

        arrayList.set(3,"Megadeth");
        yazdir(arrayList);

    }

    public static void yazdir(ArrayList<String> a){
        System.out.println("*****");
        for (int i = 0;i< a.size();i++){
            System.out.println("Element : " + i+1 + " : " + a.get(i));
        }
    }

}
