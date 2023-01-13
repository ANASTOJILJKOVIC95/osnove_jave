package p13_01_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pasta {
    private ArrayList <Sastojak> sastojak;

    public Pasta(){
       this.sastojak = new ArrayList<>();
    }

    public void dodajSastojak(Sastojak sastojak){
        this.sastojak.add(sastojak);
    }

    public ArrayList<Sastojak> getSastojak() {
        return sastojak;
    }

    public int cenaSuma(){
        int cena = 0;
        for (int i = 0; i <this.sastojak.size() ; i++) {
            cena = cena + sastojak.get(i).getCena();
        }
        return cena;
    }
    public void stampa(){
        for (int i = 0; i < this.sastojak.size() ; i++) {
            this.sastojak.get(i).stampa();
        }
        System.out.println("Cena paste je:" + cenaSuma());
    }

    public void brisanje(String sastojak) {
        for (int i = 0; i < this.sastojak.size(); i++) {
            if (this.sastojak.get(i).getNaziv().equals(sastojak)) {
                this.sastojak.remove(i);
            }
        }
    }
}
