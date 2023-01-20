package domaci19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa(){
        this.ambalaze = new ArrayList<>();
    }
    public void dodajUkorpu (Ambalaza a){
        ambalaze.add(a);
    }
    public void izbaciIzKorpe (String a){
        for (int i = 0; i < ambalaze.size() ; i++) {
            if (this.ambalaze.get(i).getBarKod().equals(a)){
                ambalaze.remove(i);
            }
        }
    }
    private double cenaSaPoputstom (double popust){
        for (int i = 0; i <ambalaze.size() ; i++) {
           return this.ambalaze.get(i).cena() -  (this.ambalaze.get(i).cena() / 100 * popust);

        } return 0;
    }

    public double racun (SuperKartica a){
        double suma = 0 ;
        for (int i = 0; i < this.ambalaze.size(); i++) {
           suma = suma+ this.ambalaze.get(i).cena();
        }return suma - a.getPopust();
    }
}
