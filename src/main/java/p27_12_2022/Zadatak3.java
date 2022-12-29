package p27_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.vozac = "Ana Stojiljkovic";
        auto1.marka ="Fiat";
        auto1.vrata = 3;
        auto1.potrosnja = 7;
        auto1.brzina= 100;
        auto1.godina = 2006;
        auto1.mesec = 10;
        auto1.kubikaza = 1600;
        auto1.registracija ="1010-st";
        auto1.gorivo = 5;


        auto1.stampa();

        System.out.println("Vozac je prekoracio? " + auto1.prekoracenje(50));
        System.out.println("Kolika je kazna? " + auto1.kazna(50));
        System.out.println("Auto je oldtajmer? " + auto1.oldtajmer());
        System.out.println("Registrovan je? " + auto1.registracija(12));
        System.out.println("Kolika je registracija? " + auto1.cena(auto1.kubikaza));
        auto1.koci();
        auto1.koci();
        auto1.koci();
        auto1.koci();
        System.out.println("Trenutna brzina je " + auto1.brzina);
        auto1.upaliKlimu();
        System.out.println("Da li je klima ukljucena " + auto1.klima);
        System.out.println("Trenutna potrosnja je " + auto1.trenutnapotrosnja());
        auto1.stampajTablu();
        System.out.println();
        System.out.println("Cena goriva " + auto1.sipajGorivo(3));


    }
}
