package domaci10_01_2023;

public class Proizvod_zadatak3 {
    private String sifra;
    private String naziv;
    private double cenaPoKilogramu;

    public Proizvod_zadatak3(String sifra, String naziv, double cenaPoKilogramu) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getCenaKg(){
        return this.cenaPoKilogramu;
    }
    public double getCenaLb (){
        return this.cenaPoKilogramu / 2.2046;}

    public void stampaj(){
        System.out.println( this.sifra + " -  " + this.naziv);
    }
}
