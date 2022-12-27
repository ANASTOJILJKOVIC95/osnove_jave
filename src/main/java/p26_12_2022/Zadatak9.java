package p26_12_2022;

import java.util.Scanner;

public class Zadatak9 {//Napisati metodu koja vrsi konverziju rimske(string) u
    // arapske brojeve(int).
    // 1 - I
    // 2 - II
    // 3 - III
    // 4 - IV
    // 5 - V
    // Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
    // Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Unesite rimski broj");
        String rimski = s.next();
        int a = arapski(rimski);
        System.out.println("Arapski broj je "+ a);
}
    public static int arapski (String a) {
        if (a.equals("I")) {
            return 1;
        } else if (a.equals("II")) {
            return 2;
        } else if (a.equals("III")) {
            return 3;
        } else if (a.equals("IV")) {
            return 4;
        } else if (a.equals("V")) {
            return 5;
        } else {
            return 0;

        }
    }
}