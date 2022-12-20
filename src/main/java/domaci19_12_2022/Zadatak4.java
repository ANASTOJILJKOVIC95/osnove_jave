package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      //Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
        // Korisnik unosi N rekacija zatim se prikazuje evidencija:
        //Program podrzava sledece reakcije:
        //like
        //smile
        //heart

        System.out.println("Unesite n");
        int n = s.nextInt();
        int like = 0;
        int smile = 0;
        int heart = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Reakcija: ");
            String reakcija = s.next();
            if (reakcija.contains("like")) {
                like = like + 1;
            } else if (reakcija.contains("smile")) {
                smile = smile + 1;
            } else if (reakcija.contains("heart")) {
                heart = heart + 1;
            } else {
                heart = heart + 0;
                smile = smile + 0;
                heart = heart + 0;}
        }
        System.out.println("Summary: like " + like + " | " + "smile " +
                smile + " | " + "heart " + heart);
    }
}

