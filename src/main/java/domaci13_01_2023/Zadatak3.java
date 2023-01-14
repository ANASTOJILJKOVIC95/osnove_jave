package domaci13_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        HistoryPage a = new HistoryPage("Ana.rs", "www.ana.rs", 15, 35);
        HistoryPage b = new HistoryPage("ITBootcamp", "www.itbootcamp.rs", 15, 40);
        HistoryPage c = new HistoryPage("YouTube", "www.youtube.com", 16, 5);

        a.sacuvajKredencijale("luckylaura", "1234");


        History m = new History();
        m.otvoriStranicu(a);
        m.otvoriStranicu(b);
        m.otvoriStranicu(c);

        m.sacuvajKredencijale("YouTube", "Ana", "345");
        m.pogledajIstoriju();

        m.obrisiKolacice("www.ana.rs");
        m.pogledajIstoriju();
        m.obrisiStranicu("www.ana.rs");
        m.pogledajIstoriju();


    }
}
