package mmc.lab.lab042Polymorphism;

public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }

    public static void konustur(Object object) {
        if (object instanceof Kopek){

        } else if (object instanceof Kedi) {

        } else if (object instanceof At) {

        } else if (object instanceof Hayvan) {

        }
    }

    public static void main(String[] args) {
        /*Hayvan hayvan1 = new Kedi("Tekir");
        System.out.println(hayvan1.konus());

        Hayvan hayvan2 = new Kopek("Karabas");
        System.out.println(hayvan2.konus());

        Hayvan hayvan3 = new At("Sahbatur");
        System.out.println(hayvan3.konus());*/


        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabas"));
        konustur(new At("Sahbatur"));

    }
}

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor";
    }


}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor";
    }


}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor";
    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kisniyor";
    }
}