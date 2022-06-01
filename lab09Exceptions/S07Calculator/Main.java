package lab09Exceptions.S07Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme";
        System.out.println(islemler);

        try{

            int islem = scanner.nextInt();
            System.out.print("Birinci sayi : ");
            int a = scanner.nextInt();
            System.out.print("Ikinci sayi : ");
            int b = scanner.nextInt();

            if (islem == 3 && a>10000 && b>10000){
                throw new CarpmaException();
            }

            switch (islem) {
                case 1:
                    System.out.println("Toplam : " + (a + b));
                    break;
                case 2:
                    System.out.println("Fark : " + (a - b));
                    break;
                case 3:
                    System.out.println("Carpim : " + (a * b));
                    break;
                case 4:
                    System.out.println("Bolum : " + ((double) a / b));
            }
        } catch (ArithmeticException e) {
            System.out.println("Bir sayi 0 a bolunemez");
        } catch (InputMismatchException e){
            System.out.println("Lutfen inputlari dogru formatta giriniz");
        } catch (CarpmaException e) {
            e.printStackTrace();
        }

    }
}

class CarpmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Iki sayi da cok buyuk, lutfen daha kucuk sayilar giriniz");
    }
}
