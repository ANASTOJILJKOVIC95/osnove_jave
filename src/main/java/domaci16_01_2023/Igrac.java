package domaci16_01_2023;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;


    public Igrac(){
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Igrac nosi broj " + this.broj + " i igra na poziciji " + this.pozicija);
        if (this.kapiten) {
            System.out.println("Kapiten je.");
        } else {
            System.out.println("Nije kapiten");
        }
    }
}
