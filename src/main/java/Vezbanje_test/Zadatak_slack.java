package Vezbanje_test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_slack {//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
    // Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima tj.
    //ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi da unese kolonu po
    // kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu. POGLEDAJ SLIKU

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <Integer> niz = new ArrayList<Integer>();
        niz.add(3);
        niz.add(1);
        niz.add(8);
        niz.add(0);
        niz.add(1);
        niz.add(1);
        niz.add(5);
        niz.add(7);
        niz.add(9);
        niz.add(6);
        niz.add(3);
        niz.add(1);
        niz.add(6);
        niz.add(5);
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(8);
        niz.add(1);
        niz.add(7);
        niz.add(1);
        niz.add(3);
        niz.add(2);
        niz.add(8);
        niz.add(0);
        int sum = 0;

        for (int i = 0; i <25; i++){
            System.out.print(niz.get(i) + " ");
            if ((i+1) % 5 == 0){
                System.out.println();}
        }
        System.out.println("Unesite zeljenu kolonu");
        int kolona = s.nextInt();
        for (int i = 0; i < 25; i+=5){
            sum = sum +  niz.get(kolona + i);
        }
        System.out.println(sum);

    }
}
