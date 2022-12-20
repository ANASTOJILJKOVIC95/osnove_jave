package p20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rec");
        String rec= s.next();


        while (!rec.contains(".")){
            System.out.println("Unesite rec");
            rec = s.next();

            if (rec.contains("stoko")){
               System.out.println("Beeeeeeeeeeep");

           } else if (rec.contains("zajebavas")) {
               System.out.println("Beeeeeeeeeeep");

            } else if (rec.contains("mrs")) {
            System.out.println("Beeeeeeeeeeep");

        } else if (rec.contains("svinjo")){
            System.out.println("Beeeeeeeeeeep");}


        }
    }
}

