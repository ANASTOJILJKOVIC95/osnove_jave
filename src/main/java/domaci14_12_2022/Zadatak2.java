package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) { //Napisati program koji za ucitava brojeve a i b
        // (b ima vrednosti 1 ili 2)
        // Ukoliko se za b unese:
        //b=1, vrednost promenljive a se uvecava za 10
        //b=2, vrednost promenljive a se smanjuje za 20
        //Na kraju zadatka odstampati novu vrednost promenljive a.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite  1 ili 2");
        int b = s.nextInt();
        System.out.println("Unesite vrednost a");
        int a = s.nextInt();

        if (b==1){ a=a+10;
            System.out.println("A = " + a);}
        else if (b==2){a= a-20;
            System.out.println("A = " + a);}
        else {
            System.out.println("Nije moguce izvrsiti operaciju");}

    }
}
