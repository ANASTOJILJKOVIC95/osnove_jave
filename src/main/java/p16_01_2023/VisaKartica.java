package p16_01_2023;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;


    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
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

    public void stampaj (){
        System.out.print("Visa kartica ");
        super.stampaj();
        System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
    }
}
