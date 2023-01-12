package p11_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FizickoLice kupac = new FizickoLice("Ana Stojiljkovic", "1233", "31051995", true);
        FizickoLice prodavac = new FizickoLice("Marko Markovic", "1234567", "22021991", true);

        Ugovor n = new Ugovor("11.01.2022", prodavac, kupac, 2000000, "Bulevar 123");

        n.stampa();
    }
}
