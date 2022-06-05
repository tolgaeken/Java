package lab12JDBCAndMySql.S02CommitAndRollback;

import java.sql.*;
import java.util.Scanner;

public class CommitAndRollback {

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
