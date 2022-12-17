package domaci16_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji za uneti broj x
        // (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj.
        Scanner s = new Scanner(System.in);
        System.out.println("unesite vrednost x");
        int x =s.nextInt();
        for (int i = 1; i <= 10; ++i){
            System.out.println(x + "*" + i + " = " + x*i);}

    }
}
