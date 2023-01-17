package domaci16_01_2023;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj igrača");
        int brojIgrača = s.nextInt();
        ArrayList <Igrac> igraci = new ArrayList<>();
        ArrayList <Trener> treneri = new ArrayList<>();


        for (int i = 0; i < brojIgrača; i++) {
            igraci.add(i, new Igrac());
            System.out.println("Ime i prezime igraca?");
            String ime = s.next();
            igraci.get(i).setImeIPrezime(ime);

            System.out.println("Unesite jmbg igraca");
            String jmbg = s.next();
            igraci.get(i).setJmbg(jmbg);

            System.out.println("Unesite godinu rodjena igraca");
            int godina = s.nextInt();
            igraci.get(i).setGodinaRodjenja(godina);

            System.out.println("Unesite broj na dresu");
            int broj = s.nextInt();
            igraci.get(i).setBroj(broj);

            System.out.println("Unesite poziciju igraca");
            String pozicija = s.next();
            igraci.get(i).setPozicija(pozicija);

            System.out.println("Da li je igrac kapiten?");
            String odgovor = s.next().toLowerCase();
            if(odgovor.equals("da")){
                igraci.get(i).setKapiten(true);
            }
        }

        System.out.println("Koliko trenera imate?");
        int brojTrenera = s.nextInt();

        for (int i = 0; i <brojTrenera ; i++) {
            treneri.add(i, new Trener());

            System.out.println("Ime i prezime trenera?");
            String ime = s.next();
            treneri.get(i).setImeIPrezime(ime);

            System.out.println("Unesite jmbg trenera");
            String jmbg = s.next();
            treneri.get(i).setJmbg(jmbg);

            System.out.println("Unesite godinu rodjena trenera");
            int godina = s.nextInt();
            treneri.get(i).setGodinaRodjenja(godina);

            System.out.println("Koliko godina iskustva ima trener?");
            int godine = s.nextInt();
            treneri.get(i).setGoidneIskustva(godine);

            System.out.println("Koji je tip trenera");
            String tip = s.next();
            treneri.get(i).setTipTrenera(tip);
        }
        System.out.println("Spisak igraca: ");
        for (int i = 0; i < igraci.size() ; i++) {
            igraci.get(i).stampaj();

        }

        System.out.println("Spisak trenera: ");
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();

        }
    }
}
