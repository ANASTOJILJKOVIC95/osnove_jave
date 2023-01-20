package p19_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Kuca a = new Kuca("Bulevar 1", 50, 2);
        a.stampaj();

        Zgrada b = new Zgrada("Branka Miljkovica 2", 40, 3, 30);
        b.stampaj();

       Lokal v = new Lokal("Bulevar Zorana Djindjica", 2, 50);
        v.stampaj();

        PoreskaUprava pu = new PoreskaUprava();
        pu.setImeGrada("Nis");

        pu.dodajObjekat(a);
        pu.dodajObjekat(b);
        pu.dodajObjekat(v);

        System.out.println("Ukupan porez je " +pu.ukupanPorez());
        System.out.println("Najmanji porez je " );
        pu.najmanjiPorez().stampaj();
        System.out.println("Najveci porez je " );
        pu.najveciPorez().stampaj();

        Objekat kuca = new Kuca("Marina Drzica 19", 20, 3);
        pu.dodajObjekat(kuca);

        kuca.stampaj();





    }
}
