package lab07ObjectOrientedProgramming2.S06InnerClasses.S2StaticInnerClasses;

public class Matematik {

    private static double PI = Math.PI;

    public static class Alan {
        public static void daireAlan(int yaricap) {
            System.out.println("Dairenin alani : " + (yaricap * yaricap * PI));
        }
    }
}
