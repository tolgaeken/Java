package lab10InputOutput.S01FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("src\\lab10InputOutput\\S01FileOutputStream\\dosya.txt");

        try {
            //fos = new FileOutputStream(file);

            /*fos.write(65);
            fos.write(74);*/

            /*byte[] array = {101,75,66,68};
            fos.write(array);*/

            fos = new FileOutputStream(file,true);
            String s = "Tolga";
            byte[] sArray = s.getBytes();
            fos .write(sArray);

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception olustu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazilirken bir hata olustu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu");
            }
        }
    }
}
