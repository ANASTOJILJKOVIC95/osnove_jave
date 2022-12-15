package p14_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost broja a");
        int a = s.nextInt();
        int b = 2;
        int c = 3;
        if (a % b == 0 && a % c == 0) {
            System.out.println("Broj je deljiv sa dva, i deljiv je sa 3.");}
        else if (a % b == 0) {System.out.println("Broj je deljiv sa 2, a nije sa 3");}
        else if (a % c == 0) {
            System.out.println("Broj je deljiv sa 3, a nije sa 2");}
        else {
            System.out.println("Broj nije deljiv ni sa 2, ni sa 3");}
    }
}
