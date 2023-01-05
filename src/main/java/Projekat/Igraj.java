package Projekat;


import java.util.Scanner;

public class Igraj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        XOtabla igraj = new XOtabla();

        System.out.print("Unesite ime X igraca: ");
        igraj.setImeIgracaX(s.next());
        System.out.print("Unesite ime O igraca: ");
        igraj.setImeIgracaO(s.next());

        igraj.pokreniIgru();

        while (!igraj.popunjenaTabla() && !igraj.pobednikX() && !igraj.pobednikO()) {
            igraj.stampaj();
            System.out.println("Izaberi polje");
            int polje = s.nextInt();

            while (!igraj.poljePrazno(polje)) {
                if (polje < 1 || polje > 9) {
                    System.out.println("Izabrali ste polje van tabele, izaberite polje od 1 do 9");
                } else {
                    System.out.println("Izabrano polje je popunjeno, izabrite drugo polje");
                }
                polje = s.nextInt();
            }
            if (igraj.getNaPotezu().equals("X")) {
                igraj.setUnos("X");
            } else if (igraj.getNaPotezu().equals("O")) {
                igraj.setUnos("O");
            }
            igraj.odigrajPotez(polje);

            if (igraj.pobednikX()) {
                System.out.println("Pobednik je igrac " + igraj.getImeIgracaX());
                igraj.stampaj();
            } else if (igraj.pobednikO()) {
                System.out.println("Pobednik je igrac " + igraj.getImeIgracaO());
                igraj.stampaj();
            } else if (igraj.popunjenaTabla()) {
                System.out.println("Igra je neresena.");
                igraj.stampaj();
            }
            igraj.zameniIgraca();
        }
    }
}
