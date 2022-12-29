package domaci29_12_2022;

public class Zadatak1 {//Napisati klasu Proizvod koja ima atribute
    // naziv proizvoda (String)
    // cenu proizvoda (double)
    // težinu proizvoda u gramima. (double)
    // i metode:
    // stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    // povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
    // Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
    // vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena
    // proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust
    // u opsegu od 0 do 100.
    // racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
    //  Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
    // za tezinu do 100g, postarina iznosi 200din
    // za tezinu od 101g do 500g, postarina iznosi 400din
    // za tezinu preko 500g, postarina iznosi 1000din
    // U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih
    // funkcija.

    public static void main(String[] args) {
        Proizvod jagode = new Proizvod();
        jagode.setIme("Jagode");
        jagode.setCena(150);
        jagode.setTezinaUGramima(500);

        Proizvod maline = new Proizvod();
        maline.setIme("Maline");
        maline.setCena(200);
        maline.setTezinaUGramima(600);

        maline.stampaj();
        jagode.stampaj();

        maline.povecajCenu(30);
        jagode.povecajCenu(40);

        maline.stampaj();
        jagode.stampaj();

        System.out.println ("Cena sa popustom je " + maline.vratiCenuSaPopustom(30));
        System.out.println ("Cena sa popustom je " + jagode.vratiCenuSaPopustom(25));

        System.out.println("Postarina  za maline je " + maline.racunajPostarinu());
        System.out.println("Postarina  za jagode je " + jagode.racunajPostarinu());
    }
}
