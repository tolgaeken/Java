package mmc.lab.lab044Beyblade;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret (String beybladeTuru){
        if (beybladeTuru.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi ejderha","Kutsal canavarla konusma");
        } else if (beybladeTuru.equals("Dranza")) {
            return new Dranza("Kai",600,400,"Kirmizi anka kusu");
        } else if (beybladeTuru.equals("Drayga")) {
            return new Drayga("Rei",800,250,"Beyaz kaplan");
        } else if (beybladeTuru.equals("Draciel")) {
            return new Drayga("Max", 400, 1000, "Kara kaplumbaga");
        } else {
            return null;
        }
    }

}
