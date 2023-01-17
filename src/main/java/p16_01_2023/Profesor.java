package p16_01_2023;

public class Profesor extends Osoba {
    private String predmet;
    private int plata;

    public Profesor(String imeIPrezime, String jmbg, String predmet, int plata) {
        super(imeIPrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;

    }
    public void povecajPlatu (int procenat){
        this.plata = this.plata + (this.plata / 100)*procenat;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
}

