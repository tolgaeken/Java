package lab10InputOutput.S04FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter writer = null;
        //File file = new File("src\\lab10InputOutput\\S04FileWriter\\dosya.txt");

        try {
            writer = new FileWriter("src\\lab10InputOutput\\S04FileWriter\\dosya.txt",true);

            writer.write("Tolga\nAhmet\nMehmet\n");
        } catch (IOException e) {
            System.out.println("Dosya acilirken ioexception olustu");
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatilirken bir hata olustu");
                }
            }
        }

    }
}
