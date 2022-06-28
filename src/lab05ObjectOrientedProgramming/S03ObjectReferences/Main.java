package lab05ObjectOrientedProgramming.S03ObjectReferences;

public class Main {
    public static void main(String[] args) {
        /*Account account1 = new Account("Tolga", "exmple@gmail.com", "241685143521");
        Account account2 = account1;
        Account account3 = new Account();

        if (account1 == account2) {
            System.out.println("Ayni objeyi gosteriyorlar");
        } else {
            System.out.println("Ayni objeyi gostermiyorlar");
        }*/


        new Account("Tolga", "example@mail.com","65463521365").bilgileriGoster();
    }
}
