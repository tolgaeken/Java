package mmc.lab.lab043Polymoprhism2;


public class Main {
    public static void konustur(Object object) {
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        } else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        } else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        } else if (object instanceof Kus) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }
    }


    public static void main(String[] args) {
        /*Kopek kopek1 = new Kopek("Karabas");
        if (kopek1 instanceof Kopek) {
            System.out.println("Bu nesne kopek sinifindandir");
        }

        Kopek kopek2 = new Kopek("Karabas");
        if (kopek2 instanceof Hayvan) {
            System.out.println("Bu nesne hayvan sinifindandir");
        }*/


        Kopek kopek = new Kopek("Karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Sahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        Kus kus = new Kus("Boncuk");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);


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

class Kus extends Hayvan {
    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " otuyor";
    }
}
