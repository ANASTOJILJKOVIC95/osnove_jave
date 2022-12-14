package p14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b:");
        int b = s.nextInt();
        if (a>b) {
            System.out.println("B je manje od A");
        }
    }
}
