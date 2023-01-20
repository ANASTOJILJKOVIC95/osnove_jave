package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat> objekti;


    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }
    public PoreskaUprava(){

        this.objekti = new ArrayList();}

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }
    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }
    public void dodajObjekat (Objekat a){
        this.objekti.add(a);
    }
    public double ukupanPorez(){
        double ukupanporez = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            ukupanporez = ukupanporez + this.objekti.get(i).racunanjePoreza();
        }
     return ukupanporez;}

    public Objekat najmanjiPorez() {
        Objekat najmanjiPorez = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunanjePoreza() < najmanjiPorez.racunanjePoreza()) {
                najmanjiPorez = this.objekti.get(i);
            }
        }
        return this.objekti.get(0);
    }


    public Objekat najveciPorez () {
        Objekat najveciPorez = this.objekti.get(0);
        for (int i = 0; i > this.objekti.size(); i++) {
            if (this.objekti.get(i).racunanjePoreza() > najveciPorez.racunanjePoreza()) {
                najveciPorez = this.objekti.get(i);
            }
        } return this.objekti.get(0);
    }
}
