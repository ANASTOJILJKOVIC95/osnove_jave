package domaci10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKartica kartica;

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKartica getKartica() {
        return kartica;
    }

    public void setKartica(ClanskaKartica kartica) {
        this.kartica = kartica;
    }

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }
    public Kupac(){}

    public void stampa (){
        System.out.println(this.imeIPrezime + " - " + this.kartica.getBrojKartice());
    }

    public double popust(){
        double popust = this.kartica.getPopust();
        return popust;
    }


}
