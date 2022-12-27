package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak1 {//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena
    // vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int a = s.nextInt();
        stampajVrednostZa10Vecu(a);

    }
    public static void stampajVrednostZa10Vecu(int broj){
        broj = broj + 10;
        System.out.println(broj);

    }
}
