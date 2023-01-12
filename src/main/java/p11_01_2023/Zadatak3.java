package p11_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik a = new ViberKorisnik("Ana", 0601010101, true);
        ViberKorisnik b = new ViberKorisnik("Milica", 061010101, false);
        ViberPoruka n = new ViberPoruka("Hej", "11.01.23|21:13", a, b);
        Reakcija reakcija = new Reakcija("Sunglases", b);
        n.setReakcijaNaPoruku(reakcija);
        n.stampa();
    }
}
