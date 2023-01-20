package domaci19_01_2023;

public class StaklenaFlasa extends Ambalaza{
        private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaFlasa(String barKod, String nazivArtikla, double neto, double bruto, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    double cena() {
       if (this.daLiSePlacaKaucija){
           return this.osnovnaCena *1.2 + this.kaucija;
       } return osnovnaCena *1.2;
    }

    @Override
    void stampaj() {
        System.out.println("Bar kod proizvoda "  + this.barKod);
        System.out.println("Naziv proizvoda " + this.nazivArtikla);
        System.out.println("Neto: " + this.neto + ", bruto: " + this.bruto);
        System.out.println("Osnovna cena proizvoda: " + this.osnovnaCena);
        if (this.daLiSePlacaKaucija){
        System.out.println("Kaucija se placa, iznos  kaucije je " + this.kaucija);}
        System.out.println("Cena proizvoda je " + this.cena());


    }
}
