package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak6 {//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili

    // dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima
    // kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu
    // vrednost. U glavnom programu pozvati funkciju za neki od primera.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u  evrima");
        double a = s.nextDouble();
        System.out.println("Unesite valutu");
        String valuta = s.next();

        System.out.println(konverzija(valuta, a));

    }

    public static double konverzija(String valuta, double vrednost) {
        if (valuta.equals("RSD")) {
            return vrednost * 117.5;
        } else if (valuta.equals("USD")) {
            return vrednost * 1.1;
        } else if (valuta.equals("RUB")) {
            return vrednost * 62.98;
        } else {
            return 0;
        }
    }
}


