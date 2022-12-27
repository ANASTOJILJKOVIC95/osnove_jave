package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak4 {//Napisati metodu koja stampa podatke o korisniku u formatu:
   // JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]
    //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
    // Metoda nista ne vraca.
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Unesite JBG");
       String jmbg = s.next();
       System.out.println("Unesite ime");
       String ime = s.next();
       System.out.println("Unesite prezime");
       String prezime = s.next();
       System.out.println("Unesite godinu rodjenja");
       int god = s.nextInt();
       System.out.println("Da li je aktivan");
       boolean a = s.nextBoolean();
       stampa(jmbg,ime,prezime,god,a);

   }
   public static void stampa (String jmbg, String ime,String prezime, int god, boolean aktivan){
       System.out.println("JMBG: " + jmbg);
       System.out.println("Ime: " + ime);
       System.out.println("Prezime: " + prezime);
       System.out.println("Godina rodjenja:" + god);
       System.out.println("Aktivan: " + aktivan);
   }
}
