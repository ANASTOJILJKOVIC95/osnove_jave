package domaci19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
        //Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju
        // dva random broja koja treba da sabere i poruka o tacnosti resenja.
        // (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int x= random.nextInt(50);
            int y = random.nextInt(50);
            int l = x + y;
            System.out.println("Koliko je " + x + " + " + y);
            int n = s.nextInt();
            if (l == n){
                System.out.println("Cestitam");}
            else if (l != n){
                System.out.println("Greska");}

        }
        System.out.println("Dovoljno si vezbao idi da spavas");
    }
}
