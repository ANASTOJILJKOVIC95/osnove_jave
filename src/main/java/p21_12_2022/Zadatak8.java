package p21_12_2022;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih
        // stampa.
        // Potrebne su dve petlje, u jednom se desava ucitavanje niza a u drugoj stampanje.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        for (int i=0; i <=n;i++){
            System.out.println("Unesite broj:");
            int broj = s.nextInt();
            brojevi.add(broj);}
        for (int i = 0; i<brojevi.size(); i ++){
            System.out.print(brojevi.get(i) + ", ");
        }
    }
}

