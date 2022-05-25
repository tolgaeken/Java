package mmc.lab.lab034ObjectReferences;

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public Account(){
        /*this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "bilgi yok";
        this.email = "bilgi yok";
        this.telefonNo = "bilgi yok";*/

        this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");

    }

    public Account(String isim, String email, String telefonNo){
        /*this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        this.bakiye = 0.0;
        this.hesapNo = "Bilgi yok";*/

        this("Bilgi yok",0.0,isim,email,telefonNo);
    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public void bilgileriGoster(){
        System.out.println("Hesap No : " + hesapNo);
        System.out.println("Bakiye : " + bakiye);
        System.out.println("Isim : " + isim);
        System.out.println("E-Mail : " + email);
        System.out.println("Telefon No : " + telefonNo);
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiye : " + bakiye);
    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Gunluk en fazla 500 TL cekilebilir");
        }
        if (miktar > bakiye) {
            System.out.println("Yeterli bakiyeniz bulunmamaktadir. Bakiyeniz : " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye : " + bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
