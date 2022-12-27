package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak2 {//Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
   // Metoda od parametara prima ime i prezime (2 parametra)
  //  i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Unesite ime");
       String ime= s.next();
       System.out.println("Unesite prezime:");
       String prezime = s.next();

       System.out.println(spoj(ime, prezime));

   }
   public static String spoj (String ime, String prezime){
       String spoj = ime + " " + prezime;
       return spoj;
   }
}
