package p13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Sastojak prvi = new Sastojak("testenina", 100);
        Sastojak drugi = new Sastojak("sos", 100);
        Sastojak treci = new Sastojak("piletina", 200);
        Sastojak cetvrti = new Sastojak("sir", 150);
        Sastojak peti = new Sastojak("zacini", 30);

        Pasta nekaPasta = new Pasta();

        nekaPasta.dodajSastojak(prvi);
        nekaPasta.dodajSastojak(drugi);
        nekaPasta.dodajSastojak(treci);
        nekaPasta.dodajSastojak(cetvrti);

        nekaPasta.stampa();

        nekaPasta.brisanje("sir");

        nekaPasta.stampa();

    }
}
