package p27_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.vozac = "Ana Stojiljkovic";
        auto1.marka ="Fiat";
        auto1.vrata = 3;
        auto1.potrosnja = 10;
        auto1.brzina= 100;
        auto1.godina = 2006;
        auto1.mesec = 10;
        auto1.kubikaza = 1600;

        auto1.stampa();

        System.out.println("Vozac je prekoracio? " + auto1.prekoracenje(50));
        System.out.println("Kolika je kazna? " + auto1.kazna(50));
        System.out.println("Auto je oldtajmer? " + auto1.oldtajmer());
        System.out.println("Registrovan je? " + auto1.registracija(4));
        System.out.println("Kolika je registracija? " + auto1.cena(auto1.kubikaza));


    }
}
