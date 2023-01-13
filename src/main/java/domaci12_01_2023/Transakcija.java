package domaci12_01_2023;

public class Transakcija {
    private int id;
    private Racun uplata;
    private Racun isplata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getIsplata() {
        return isplata;
    }

    public void setIsplata(Racun isplata) {
        this.isplata = isplata;
    }

    public Racun getUplata() {
        return uplata;
    }

    public void setUplata(Racun uplata) {
        this.uplata = uplata;
    }

    public Transakcija(int id, Racun isplata, Racun uplata) {
        this.id = id;
        this.isplata = isplata;
        this.uplata = uplata;
    }

    private int transakcija(int vrednost) {
        if (vrednost <= 4500) {
            return 45;
        } else {
            return vrednost / 100;
        }
    }
    public void izvrsiTransakciju(int vrednost){
        if (this.isplata.getStanjeNaRacunu() >= vrednost)
        this.uplata.promena(vrednost);
        this.isplata.promena(-vrednost - this.transakcija(vrednost));
    }

    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa:" + this.isplata.getImeIPrezime() + " - "
                + this.isplata.getBrojRacuna());
        System.out.println("Racun na:" + this.uplata.getImeIPrezime() + " - "
                + this.uplata.getBrojRacuna());
    }



}
