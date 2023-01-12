package domaci10_01_2023;

public class Zadatak_Slack {
    public static void main(String[] args) {
        Osoba otac = new Osoba("Marko Markovic");
        Osoba majka = new Osoba ("Jovana Markovic");
        Osoba dete = new Osoba("Nikola Markovic");
        dete.setMajka(majka);
        dete.setOtac(otac);
        dete.stampa();
    }
}
