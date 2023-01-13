package domaci12_01_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private int stanjeNaRacunu;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Racun(String brojRacuna, String imeIPrezime, int stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public Racun(){}

    public void promena (int vrednost){
        this.stanjeNaRacunu = stanjeNaRacunu + vrednost;
        if (this.stanjeNaRacunu < 0){
            this.stanjeNaRacunu = 0;
        }
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime  + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + stanjeNaRacunu + " rsd.");
    }
}

