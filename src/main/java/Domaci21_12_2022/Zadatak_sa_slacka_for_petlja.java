package Domaci21_12_2022;

import java.util.Scanner;

public class Zadatak_sa_slacka_for_petlja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite velicinu fajla:");
        int fajl = s.nextInt();
        int velicina = 0;
        int procenat= 0;
        StringBuilder unos = new StringBuilder();

        for (int i = 0; i < fajl; i++){
            System.out.println("Unesite blok");
            String blok = s.next();
            unos = unos.append(blok);
            velicina = velicina + blok.length();
            procenat = (velicina * 100)/fajl;
            System.out.println("Downloaded: " + procenat + "%");
            if (procenat > 100){ break;}
        }
        System.out.println("Sadrzaj skinutog fajla" + unos);
    }
}
