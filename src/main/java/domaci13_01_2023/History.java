package domaci13_01_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> stranice;

    public History(){
        this.stranice = new ArrayList<>();
    }

    public void otvoriStranicu(HistoryPage stranica){
        this.stranice.add(stranica);
    }
    public void obrisiStranicu(String link){
        for (int i = 0; i < stranice.size(); i++) {
            if(this.stranice.get(i).getLink().equals(link)){
                this.stranice.remove(i);
            }
        }
    }

    public void obrisiKolacice (String link){
        for (int i = 0; i < this.stranice.size(); i++) {
            if(this.stranice.get(i).getLink().equals(link)){
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju(){
        for (int i = this.stranice.size()-1; i >= 0; i--){
            this.stranice.remove(i);
        }
    }
    public void sacuvajKredencijale(String naziv, String username, String password){
        for (int i = 0; i < this.stranice.size(); i++)
        if (naziv.equals(stranice.get(i).getNazivStranice())){
            stranice.get(i).sacuvajKredencijale(username, password);
        }
    }
    public void pogledajIstoriju(){
        for (int i = 0; i < this.stranice.size(); i++){
            this.stranice.get(i).stampa();
            System.out.println();
        }
    }

    public void obrisiKolacice (){
        for (int i = this.stranice.size(); i > 0; i--){
            this.stranice.get(i).obrisiKolacice();
        }
    }
}

