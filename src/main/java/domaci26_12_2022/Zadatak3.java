package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak3 {//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
    // funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int a = s.nextInt();
        System.out.println("Unesite drugi broj");
        int b = s.nextInt();
        dvocifren(a, b);
        System.out.println(dvocifren(a,b));

    }
    public static int dvocifren (int a, int b){
        int x = (a*10) + b;
        return x;
    }
}
