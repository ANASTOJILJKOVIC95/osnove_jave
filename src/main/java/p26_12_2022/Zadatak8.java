package p26_12_2022;

import java.util.Scanner;

public class Zadatak8 {//Napisati metodu koja proverava da li je trougao pravougli.
    // Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca
    // true, u suptrotnom vraca false.
    //Trougao je pravougli ukoliko je a*a+b*b=c*c
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a");
        int a = s.nextInt();
        System.out.println("Unesite b");
        int b = s.nextInt();
        System.out.println("Unesite c");
        int c= s.nextInt();
        boolean m = trougao(a,b,c);
        if (m = true){
            System.out.println("Trougao je pravougli");}
        else if (m = false){
            System.out.println("Trougao nije pravougli");}
    }
    public static boolean trougao (int a, int b, int c){
        if(a*a+b*b==c*c){
            return true;
        }
        else {return false;}
}
}

