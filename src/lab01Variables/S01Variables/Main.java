package lab01Variables.S01Variables;

public class Main {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;


        System.out.println("ByteMax " + Byte.MAX_VALUE);
        System.out.println("ByteMin " + Byte.MIN_VALUE);
        System.out.println("ShortMax " + Short.MAX_VALUE);
        System.out.println("ShortMin " + Short.MIN_VALUE);
        System.out.println("IntMax " + Integer.MAX_VALUE);
        System.out.println("IntMin " + Integer.MIN_VALUE);
        System.out.println("LongMax " + Long.MAX_VALUE);
        System.out.println("LongMin " + Long.MIN_VALUE);
        System.out.println("FloatMax " + Float.MAX_VALUE);
        System.out.println("FloatMin " + Float.MIN_VALUE);
        System.out.println("DoubleMax " + Double.MAX_VALUE);
        System.out.println("DoubleMin " + Double.MIN_VALUE);

        short e = 1000;
        int f = (e / 2);
        int g = e;

        byte h = 100;
        byte i = (byte) (h / 2);
        System.out.println(i);

        long j = e + g + h;
        System.out.println(j);

        double k = 5.25;
        double l = 4.0;
        double m = 4d;

        float n = (float) 5.0;
        float o = 5f;
        float p = 5.2f;

        int q = 22 / 7;
        System.out.println(q);
        float r = 22f / 7f;
        System.out.println(r);
        double s = 22d / 7d;
        System.out.println(s);

        char t = 'T';
        System.out.println(t);
        char u = 2000;
        System.out.println(u);
        char w = '\u0152';
        System.out.println(w);

        boolean x = true;

        String y = "Merhaba \n";
        System.out.println(y);
        String z = "\tHo?geldiniz";
        System.out.println(y + " " + z);


    }
}
