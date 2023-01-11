package domaci10_01_2023;

public class Proizvod {
    private String naziv;
    private Kupac musterija;
    private double cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getMusterija() {
        return musterija;
    }

    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String naziv, double cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda(){
        double cenaProizvoda = this.cenaIzrade * 1.9 * (100 - this.musterija.getKartica().getPopust()) / 100;
        return cenaProizvoda;
    }
    public void stampa (){
        System.out.println(this.naziv + " " + this.cenaProizvoda());
        System.out.println(this.musterija.getImeIPrezime() + " - " + this.musterija.getKartica().getBrojKartice());
    }
}
