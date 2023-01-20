package domaci19_01_2023;

public class Tetrapak extends Ambalaza{
    private boolean mozeDaSeReciklira;
    private double osnovnaCena;

    public boolean isMozeDaSeReciklira() {
        return mozeDaSeReciklira;
    }

    public void setMozeDaSeReciklira(boolean mozeDaSeReciklira) {
        this.mozeDaSeReciklira = mozeDaSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public Tetrapak(String barKod, String nazivArtikla, double neto,
                    double bruto, boolean mozeDaSeReciklira, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.mozeDaSeReciklira = mozeDaSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;

    }

    @Override
    double cena() {
      if (this.mozeDaSeReciklira){
          return this.osnovnaCena + 1.5 * this.tezinaAmbalaze();
      } return this.osnovnaCena;
    }

    @Override
    void stampaj() {   System.out.println("Bar kod proizvoda "  + this.barKod);
        System.out.println("Naziv proizvoda " + this.nazivArtikla);
        System.out.println("Neto: " + this.neto + ", bruto: " + this.bruto);
        System.out.println("Osnovna cena proizvoda: " + this.osnovnaCena);
        if (this.mozeDaSeReciklira){
            System.out.println("Ambalaza moze da se reciklira");}
        System.out.println("Cena proizvoda je " + this.cena());


    }
}

