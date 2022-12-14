package p14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a:");
        double a = s.nextDouble();
        System.out.println("Unesite b:");
        double b = s.nextDouble();
        System.out.println("Unesite c:");
        double c = s.nextDouble();
        System.out.println("Srednja vrednost ovih brojeva je:"+ (a + b + c)/3);
    }
}
