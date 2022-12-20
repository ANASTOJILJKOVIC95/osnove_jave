package domaci20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       //Napisati program koji od korisnika ucitava brojeve sve
        // dok ne unesu bar dve dvojke ili tri jedinice.
        int jedan = 0;
        int dva = 0;

        while (jedan !=3 && dva != 2){
            System.out.println("unesite broj");
            int broj = s.nextInt();
            if (broj == 1) {
                jedan++;
            } else if (broj == 2) {
                dva++;
            }
        }System.out.println("Kraj programa");
    }
}

