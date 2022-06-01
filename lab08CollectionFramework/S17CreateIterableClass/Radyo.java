package lab08CollectionFramework.S17CreateIterableClass;

import java.util.*;

public class Radyo implements Iterable<String>{
    private ArrayList<String> kanallarListesi =  new ArrayList<String>();

    public Radyo(String[] kanallar){
        for (String kanal : kanallar){
            kanallarListesi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        //return kanallarListesi.iterator();

        return new RadyoIterator();
    }

    public class RadyoIterator implements Iterator<String>{
        private int index = 0;

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public boolean hasNext() {
            if (index < kanallarListesi.size()){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String deger = kanallarListesi.get(index);
            index++;
            return deger;
        }
    }
}
