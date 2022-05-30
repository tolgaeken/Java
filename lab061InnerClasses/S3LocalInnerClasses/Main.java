package mmc.lab.lab061InnerClasses.S3LocalInnerClasses;

public class Main {
    public static void main(String[] args) {

        class Alan {
            public void daireAlan(int yaricap){
                System.out.println("Dairenin alani : " + (yaricap*yaricap*Math.PI));
            }
        }

        Alan alan = new Alan();
        alan.daireAlan(3);
    }

    public static void deneme(){
        //Alan alan1 = new Alan();
    }
}
