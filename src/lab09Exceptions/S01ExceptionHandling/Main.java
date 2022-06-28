package lab09Exceptions.S01ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        /*int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[6]);*/

        /*try {
            int a = 30/0;
        } catch (Exception exc){
            System.out.println(exc);
        }*/

        /*try {
            int a = 30/0;
        } catch (ArithmeticException art){
            System.out.println(art);
        }*/

        /*try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException arr){
            System.out.println(arr);
        }*/

        /*try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);
        } catch (RuntimeException e){
            e.printStackTrace();
        }*/

        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);

            int b = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizin sinirlari disinda");
        } catch (ArithmeticException e) {
            System.out.println("Sayi 0 a bolunemez");
        } catch (Exception e){
            System.out.println("Hata olustu");
        }
        finally {
            System.out.println("Finally blogu hata olsa da olmasa da calisir");
        }


    }
}
