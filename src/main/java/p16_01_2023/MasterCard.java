package p16_01_2023;

public class MasterCard extends PlatnaKartica {


    public MasterCard(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override

    public void izvrsiTransakciju(double iznos) {
        double provizija = (iznos / 100) * 1.5;
        if (provizija < 4) {
            provizija = 4;
        }
        super.suma = super.suma - iznos - provizija;
    }

    public void naplatiOdrzavanje() {
        super.suma = super.suma - 2;
    }


    @Override

    public void stampaj() {
        System.out.print("MasterCard ");
        super.stampaj();
    }
}
