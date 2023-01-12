package domaci10_01_2023;

public class Osoba {
    private String imeIPrezime;
    private Osoba otac;
    private Osoba majka;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Osoba getOtac() {
        return otac;
    }

    public void setOtac(Osoba otac) {
        this.otac = otac;
    }

    public Osoba getMajka() {
        return majka;
    }

    public void setMajka(Osoba majka) {
        this.majka = majka;
    }

    public Osoba(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }
    public void stampa(){
        System.out.println(this.imeIPrezime);
        System.out.println("Otac: " + this.otac.getImeIPrezime());
        System.out.println("Majka: " + this.majka.getImeIPrezime());
    }
}
