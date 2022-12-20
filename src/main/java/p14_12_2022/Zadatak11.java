package p14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite akciju");
        String akcija1 = s.next();
        int jacina = 75;

        if (akcija1.equals("pojacaj")) {
                jacina = jacina + 10;}
        else if (akcija1.equals("smanji")) {
                jacina = jacina - 10;}
        else if (akcija1.equals("mute")) {
                jacina = 0;}

        if (jacina < 0) {
            jacina = 0;} else if (jacina > 100) {
            jacina = 100;}
        System.out.println("Jacina zvuka je " + jacina);

        System.out.println("Unesite akciju");
            String akcija2 = s.next();
            if (akcija2.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (akcija2.equals("smanji")) {
                jacina = jacina - 10;
            } else if (akcija2.equals("mute")) {
                jacina = 0;
            }
        if (jacina < 0) {
            jacina = 0;
        } else if (jacina > 100) {
            jacina = 100;}
        System.out.println("Jacina zvuka je " + jacina);

            System.out.println("Unesite akciju");
            String akcija3 = s.next();
            if (akcija3.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (akcija3.equals("smanji")) {
                jacina = jacina - 10;
            } else if (akcija3.equals("mute")) {
                jacina = 0;}
        if (jacina < 0) {
            jacina = 0;
        } else if (jacina > 100) {
            jacina = 100;}
        System.out.println("Jacina zvuka je " + jacina);

            System.out.println("Unesite akciju");
            String akcija4 = s.next();
            if (akcija4.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (akcija4.equals("smanji")) {
                jacina = jacina - 10;
            } else if (akcija4.equals("mute")) {
                jacina = 0;
            }
        if (jacina < 0) {
            jacina = 0;
        } else if (jacina > 100) {
            jacina = 100;}
        System.out.println("Jacina zvuka je " + jacina);
            System.out.println("Unesite akciju");
            String akcija5 = s.next();
            if (akcija5.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (akcija5.equals("smanji")) {
                jacina = jacina - 10;
            } else if (akcija5.equals("mute")) {
                jacina = 0;}
        if (jacina < 0) {
            jacina = 0;
        } else if (jacina > 100) {
            jacina = 100;}
        System.out.println("Jacina zvuka je " + jacina);
        }
    }



