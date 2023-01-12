package p11_01_2023;

public class ViberKorisnik {
    private String imeIPrezime;
    private int brojTelefona;
    private boolean daLiJeAktivan;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean getDaLiJeAktivan() {
        return daLiJeAktivan;
    }

    public void setDaLiJeAktivan(boolean daLiJeAktivan) {
        this.daLiJeAktivan = daLiJeAktivan;
    }

    public ViberKorisnik(String imeIPrezime, int brojTelefona, boolean daLiJeAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.daLiJeAktivan = daLiJeAktivan;
    }
    public ViberKorisnik(){}

    public void aktivan(){
        if (this.daLiJeAktivan){
            System.out.print("Nije aktivan");
        }else {
            System.out.print("Aktivan");
        }
    }
}

