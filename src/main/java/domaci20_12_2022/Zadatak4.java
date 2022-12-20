package domaci20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu
        // sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju
        // programa se ispisuje da li su sve zagrade uparene.
        System.out.println("Unesite formulu");
        String formula = s.next();
        int otvorena = 0;
        int zatvorena = 0;

        while (!formula.contains("=")){
            if(formula.contains("(")){
                otvorena++;
            } else if (formula.contains(")")) {
                zatvorena++;
            }
            System.out.println("Unesite formulu");
            formula = s.next();
        }
        if (otvorena == zatvorena){
            System.out.println("Zagrade su uparene.");
        } else if (otvorena !=zatvorena) {
            System.out.println("Zagrade nisu uparene.");
        }
    }
}

