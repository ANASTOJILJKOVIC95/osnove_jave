package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
    //. Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
    // (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
    // odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite operator: ");
        String operator= s.next();
        int c;
        if (operator .equals("+")){ c = a + b;
            System.out.println("Zbir je " + c);}
        else if (operator .equals("-")){ c = a - b;
            System.out.println("Razlika je" + c);}
        else if (operator .equals("/")){ c = a / b;
            System.out.println("Kolicnik je");}
        else if (operator.equals("*")){ c = a*b;
            System.out.println("Proizvod je: " + c);}
    }
}
