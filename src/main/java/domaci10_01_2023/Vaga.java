package domaci10_01_2023;

public class Vaga {
    private String mernaJedinica;
    private Proizvod_zadatak3 proizvod;

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod_zadatak3 getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod_zadatak3 proizvod) {
        this.proizvod = proizvod;
    }

    public Vaga() {
    }

    public double racunajCenu(int tezina) {

        if (this.mernaJedinica.equals("kg")) {
            return this.proizvod.getCenaKg() * tezina;
        } else if (this.mernaJedinica.equals("lb")) {
            return this.proizvod.getCenaLb() * tezina;
        }
        return 0;
    }

    public void stampaj(int tezina) {
        this.proizvod.stampaj();
        if (this.mernaJedinica.equals("kg")) {
            System.out.println("Cena proizvoda " + this.proizvod.getCenaKg() + " po " + this.mernaJedinica);
            System.out.println("Cena za " + tezina + this.mernaJedinica + " je "  + racunajCenu(tezina));
            System.out.println();
        } else if (this.mernaJedinica.equals("lb")) {
            System.out.println("Cena proizvoda " + this.proizvod.getCenaLb() + " po " + this.mernaJedinica);
            System.out.println("Cena za " + tezina + this.mernaJedinica + " je "  + racunajCenu(tezina));
            System.out.println();
        }
    }
}
