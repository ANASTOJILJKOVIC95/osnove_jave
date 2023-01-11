package domaci10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        ClanskaKartica a = new ClanskaKartica(10, "12345");
        Kupac b = new Kupac("Ana Stojiljkovic");
        b.setKartica(a);
        b.stampa();
        Proizvod c = new Proizvod("Stolica", 5000);
        c.setMusterija(b);
        c.stampa();

    }
}
