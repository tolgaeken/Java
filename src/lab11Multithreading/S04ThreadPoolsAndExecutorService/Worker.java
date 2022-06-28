package lab11Multithreading.S04ThreadPoolsAndExecutorService;

public class Worker implements Runnable {

    private String isim;
    private int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker : " + isim + " - Id : " + taskId + ". ise basladi");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Worker : " + isim + " - Id : " + taskId + ". isi bitirdi");
    }
}
