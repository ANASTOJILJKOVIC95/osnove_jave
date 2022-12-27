package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak5 {//Metoda prima dva parametra N i karakter za stampu.
    // Metoda stampa N karaktera.
    //Napomena: Metoda nista ne vraca.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koji karakter zelite?");
        String karakter = s.next();
        System.out.println("Koliko puta?");
        int broj= s.nextInt();
        stampa(karakter, broj);


    }
    public static void stampa (String karakter, int broj){
        for (int i = 0; i < broj; i++){
            System.out.print(karakter);
        }
    }

}
