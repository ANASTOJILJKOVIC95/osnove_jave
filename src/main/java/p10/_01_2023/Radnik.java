package p10._01_2023;

public class Radnik {
    private String jmbg;
    private String imeIprezime;
    private int brojDece;
    private int sSS;
    private int staz;

    public Radnik (String jmbg){
        this.jmbg = jmbg;
    }
    public Radnik (String jmbg, String imeIprezime, int brojDece, int sSS, int staz){
        this.jmbg = jmbg;
        this.imeIprezime = imeIprezime;
        this.brojDece = brojDece;
        this.sSS = sSS;
        this.staz = staz;
    }

    public String getJmbg() {
        return jmbg;
    }
    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getsSS() {
        return sSS;
    }

    public void setsSS(int sSS) {
        this.sSS = sSS;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public double minuliRad (){
        double minuliRad = 0;
        if (this.staz <= 10){
            minuliRad = this.staz * 0.05;
            return minuliRad;
        } else if (this.staz <= 20) {
            minuliRad = this.staz * 0.075;
            return minuliRad;
        } else {
            minuliRad = this.staz * 0.1;
        return minuliRad; }
    }

    public int koeficijentSlozenosti (){
        int koeficjentSlozenosti = this.sSS * this.brojDece;
        return  koeficjentSlozenosti;
    }

    public double plataRadnika (){
        double plata = 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
        return plata;
    }

    public boolean kredit(){
        boolean kredit = true;
        if (this.plataRadnika() > 50000){
            kredit = true;
            return kredit;
        } return kredit = false;

}
}
