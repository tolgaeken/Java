package lab11Multithreading.S03UsingMultiLock;

public class Main {
    public static void main(String[] args) {
        ListWorker worker = new ListWorker();

        /*long baslangic = System.currentTimeMillis();
        worker.degerAta();
        long bitis = System.currentTimeMillis();
        System.out.println("Gecen sure : " + (bitis-baslangic)/1000 + " saniye);*/

        worker.calistir();


    }
}
