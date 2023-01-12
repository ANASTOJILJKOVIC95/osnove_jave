package domaci12_01_2023;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj ispita");
        int broj = s.nextInt();
        ArrayList <ZeleniKarton> karton = new ArrayList<ZeleniKarton>();
        int suma = 0;
        int sumaPolozenih=0;
        int brojac = 0;

        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite ime Studenta");
            String student = s.next();
            System.out.println("Unesite broj indexa");
            int index = s.nextInt();
            System.out.println("Unesite naziv predmeta");
            String naziv = s.next();
            System.out.println("Unesite ocenu");
            int ocena = s.nextInt();
            System.out.println("Unesite ime profesora");
            String profesor = s.next();
            karton.add(new ZeleniKarton(student, index, naziv, profesor, ocena));
            suma += ocena;
            if (ocena <= 10 && ocena >5) {
                brojac++;
                sumaPolozenih +=ocena;
            }
        }

        for (int i = 0; i < karton.size(); i++) {
            karton.get(i).stampaj();}

        System.out.println("Prosecna ocena :" + suma/karton.size());
        System.out.println("Prosecna ocena polozenih ispita :"  + sumaPolozenih/brojac);
        //Prvobitno je bilo ogranicenje da ocena ne moze da bude veća od 10, ni manja od 5(jer to nikad
        // nisam videla u indexu, ali zbog ovih prosecnih ocena sam obrisala ogranicenje.
    }
}
