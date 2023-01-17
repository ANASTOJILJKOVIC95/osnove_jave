package p16_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        MasterCard m = new MasterCard(10000, "1234556969", 2023, 12);
        VisaKartica v = new VisaKartica(2000, "4589289205", 2023, 10, "Perica");

        m.stampaj();
        v.stampaj();

        m.izvrsiTransakciju(100);
        m.naplatiOdrzavanje();

        v.izvrsiTransakciju(200);
        v.dodajSredstva(3000);

        v.stampaj();
        m.stampaj();
    }
}
