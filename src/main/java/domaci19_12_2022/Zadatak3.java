package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi
        // N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
        //ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
        //ako se ne sadrzi, program dostampa na kraju
        //	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
        //	Svaka uneta rec sa ! utice na agresivnost.

        System.out.println("Unesite n");
        double n = s.nextInt();
        double poeni = 0;
        for (int i =1; i <= n; i++) {
            System.out.println("Unesite rec");
            String rec = s.next();
            if (rec.contains("!")) {
                System.out.println(rec);
                poeni = poeni + 1;
            } else if (!rec.contains("!")) {
                System.out.println(rec + "!");
                poeni = poeni + 0;
            }
        }
            double procenat = (poeni/n)*100;
            System.out.println("Nivo agresivnosti je " + procenat + "%");

    }
}
