package p17_01_2023;

import p16_01_2023.PlatnaKartica;

public class VisaCard extends PlatnaKartica {
    private String ovlascenoLice;


    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaCard(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override

    public void izvrsiTransakciju(double iznos){
        double provizija = (iznos / 100)*1.8;
        if (provizija < 4 ){
            provizija = 4;}
        this.suma = this.suma - iznos - provizija;

    }

    @Override

    public void stampaj () {
        System.out.print("Visa kartica ");
        System.out.println(this.brojKartice+  ", " +this.godina+"/"+this.mesec + ", $" + this.suma);
        System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
    }
}
