package lab12JDBCAndMySql.S01UsingDatabase;

import java.sql.*;

public class Baglanti {

    private String kullaniciAdi = "root";
    private String parola = "";
    private String dbIsmi = "demo";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Baglanti() {

        //  "jdbc:mysql://localhost:3306/demo"
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

    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        /*System.out.println("**Eklenmeden once**");
        baglanti.calisanlariGetir();
        System.out.println("********************");
        baglanti.calisanEkle();
        System.out.println("**Eklendikten sonra**");
        baglanti.calisanlariGetir();
        System.out.println("********************");*/

        /*System.out.println("**Guncellenmeden once**");
        baglanti.calisanlariGetir();
        System.out.println("********************");
        baglanti.calisanGuncelle();
        System.out.println("**Guncellendikten sonra**");
        baglanti.calisanlariGetir();
        System.out.println("********************");*/

        /*System.out.println("**Silmeden once**");
        baglanti.calisanlariGetir();
        System.out.println("********************");
        baglanti.calisanSil();
        System.out.println("**Sildikten sonra**");
        baglanti.calisanlariGetir();
        System.out.println("********************");*/

        baglanti.preparedCalisanlariGetir(3);
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

    public void calisanEkle() {
        try {
            statement = con.createStatement();

            String ad = "Semih";
            String soyad = "A";
            String email = "semih.a@example.com";
            // Insert into calisanlar (ad,soyad,email) VALUES('Yusuf','C','yusuf.c@example.com')
            String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES(" + "'" + ad + "','" + soyad + "','" + email + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException e) {
        }
    }

    public void calisanGuncelle(){
        try {
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email = 'tolgae@gmail.com' where id = 1";
            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
        }
    }

    public void calisanSil(){
        try {
            con.createStatement();
            String sorgu = "Delete from calisanlar where id = 6";

            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
        }
    }

    public void preparedCalisanlariGetir(int id){

       /* try {
            statement = con.createStatement();
            String sorgu = "Select * from calisanlar where ad like 's%'";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()){
                System.out.println("Ad : " + rs.getString("ad"));
            }

        } catch (SQLException e) {
        }*/

        String sorgu = "Select * from calisanlar where id > ? and ad like ?";


        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,"s%");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Ad : " + ad + " - Soyad : " + soyad + " - E-Mail : " + email);
            }
        } catch (SQLException e) {
        }



    }
}
