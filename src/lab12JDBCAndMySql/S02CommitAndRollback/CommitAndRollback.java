package lab12JDBCAndMySql.S02CommitAndRollback;

import java.sql.*;
import java.util.Scanner;

public class CommitAndRollback {

     /*Database Transaction

    Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
    Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var(delete,update).
    Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.

    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve programımız sona erdi.
    statement.executeUpdate(sorgu3);


    Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor.
    Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanımızı güncelledi.
    Ancak bu sorgular birbiriyle bağlantılı ise 1.sorgunun da çalışmaması gerekiyor.
    İşte biz böyle durumların önüne geçmek için Transactionları kullanıyoruz.

    (ATM Örneği)

    Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında
    toplu çalışmasını istiyoruz.

    Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz
    çalıştırır. Onun için ilk olarak con.setAutoCommit(false) şeklinde bir şey yaparak bu durumu
    engelliyoruz.

    commit() : Bütün sorguları çalıştır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz.
    rollback(): Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz.


    Yani bu sefer programlarımızı biraz daha güvenli yazmış oluyoruz.

    Not : setAutoCommit(false) yazsak bile Veritabanını güncellemeyen bir sorgumuz varsa,
    herhangi bir güvenlik sıkıntı olmayacağından çalıştırılır.
    */


    private String kullaniciAdi = "root";
    private String parola = "";

    private String dbIsmi = "demo";

    private String host =  "localhost";

    private int port = 3306;

    private Connection con = null;

    private Statement statement;
    private PreparedStatement preparedStatement;

    public static void main(String[] args) {
        CommitAndRollback comroll = new CommitAndRollback();
        comroll.commitVeRollback();
    }

    public CommitAndRollback() {

        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbIsmi + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi");
        }

        try {
            con = DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Baglanti basarili");
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz");
        }

    }

    public void commitVeRollback(){

        Scanner scanner = new Scanner(System.in);

        try {
            con.setAutoCommit(false);

            String sorgu1 = "Delete from calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'tolga.e@hotmail.com' where id = 1";

            System.out.println("Guncellenmeden once");
            calisanlariGetir();

            Statement statement = con.createStatement();

            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);

            System.out.print("Islemleriniz kaydedilsin mi (yes - no) : ");
            String cevap = scanner.nextLine();

            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabani guncellendi");
            } else {
                con.rollback();
                System.out.println("Veritabani guncellenmesi iptal edildi");
                calisanlariGetir();
            }



        } catch (SQLException e) {
        }
    }

    public void calisanlariGetir() {
        String sorgu = "Select * from calisanlar";
        //String sorgu = "Select * from calisanlar where id > 2";

        try {
            statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Id : " + id + " - Ad : " + ad + " - Soyad : " + soyad + " - E-Mail : " + email);
            }
        } catch (SQLException e) {
        }
    }
}
