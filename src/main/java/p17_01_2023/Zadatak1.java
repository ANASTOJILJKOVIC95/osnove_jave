package p17_01_2023;

import p16_01_2023.VisaKartica;

public class Zadatak1 {
    public static void main(String[] args) {
        VisaKartica a = new VisaKartica(12000, "1234", 2023, 12, "Perica");
        MasterCard m = new MasterCard(1300, "4354", 2023,11);

        a.stampaj();
        m.stampaj();

        a.izvrsiTransakciju(33);

        a.stampaj();

    }
}
