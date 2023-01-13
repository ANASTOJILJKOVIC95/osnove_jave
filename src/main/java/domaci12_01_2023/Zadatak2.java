package domaci12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Racun prvi = new Racun("123-234", "Jovan Jovanovic", 45000);
        Racun drugi = new Racun("5775-7489", "Marko Markovic", 55550);

        Transakcija n = new Transakcija(123, prvi, drugi);
        n.izvrsiTransakciju(5000);

        prvi.stampaj();
        drugi.stampaj();

       Transakcija m = new Transakcija(1234, drugi, prvi);
       m.izvrsiTransakciju(10000);

       prvi.stampaj();
       drugi.stampaj();

    }
}
