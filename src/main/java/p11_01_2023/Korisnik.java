package p11_01_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Korisnik() {
        this.tipLicence = "basic";
    }

    public Korisnik (String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
        this.tipLicence = "basic";
     }


    public void pretplatiSe(int uplata){
        if(uplata == 100){
            this.tipLicence ="pro";
        } else if (uplata == 150) {
            this.tipLicence = "premium";}
    }
    public void ponistiPretplatu(){
        this.tipLicence = "basic";
    }
    public int duzina(){
        int duzina;
        if(this.tipLicence.equals("basic")){
            duzina = 40;
            return duzina;
        } else if (this.tipLicence.equals("pro")) {
            duzina = 240;
            return duzina;
        } else if (this.tipLicence.equals("premium")) {
            duzina = 1440;
            return duzina;
        } return 0;
    }
    public void stampa(){
        System.out.println(imeIPrezime );
    }
}
