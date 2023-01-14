package domaci13_01_2023;

import java.util.ArrayList;

public class Listic {
    private ArrayList <Kombinacija> kombinacije;

    public Listic() {
        this.kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju (Kombinacija kombinacija){

        this.kombinacije.add(kombinacija);
    }
    public boolean dobitna(Kombinacija dobitnaKombinacija){
        for (int i = 0; i < this.kombinacije.size() ; i++) {
            this.kombinacije.get(i);
            if (this.kombinacije.get(i).equals(dobitnaKombinacija)){
                return true;}
        } return false;
    }
    public void stampaj (){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            this.kombinacije.get(i).stampa();
        }
    }
}
