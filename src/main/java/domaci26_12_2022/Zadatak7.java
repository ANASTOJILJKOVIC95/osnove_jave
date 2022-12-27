package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak7 {//Napisati funkciju koja za pronalazi koliko ima celih
    // brojeve izmedju brojeva M i N.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int a = s.nextInt();
        System.out.println("Unesite drugi broj");
        int b = s.nextInt();
        System.out.println("Izmedju a i b ima " + celiBrojevi(a, b) + " celih brojeva");

    }

    public static int celiBrojevi(int a, int b) {
        if (a > 0 && b >= 0 && a > b) {
            return a - b - 1;
        } else if (a >= 0 && b > 0 && b > a) {
            return b - a - 1;
        } else if (a < 0 && b > 0) {
            a = -a;
            return a + b - 1;
        } else if (a > 0 && b < 0) {
            b = -b;
            return a + b - 1;
        } else if (a <= 0 && b < 0 && a > b) {
            a = -a;
            b = -b;
            return b - a - 1;
        } else if (a < 0 && b <= 0 && a < b) {
            a = -a;
            b = -b;
            return a - b - 1;
        }else return 0;
    }
}
