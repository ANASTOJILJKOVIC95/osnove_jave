package p11_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korisnik host = new Korisnik();
        host.setImeIPrezime("Ana");


        host.pretplatiSe(100);
        ZoomCall a = new ZoomCall("linkneki","1234", host);
        a.setGuest(new Korisnik("Milica"));
        a.pokreniPoziv();
        host.ponistiPretplatu();
        a.pokreniPoziv();

    }
}
