package domaci19_01_2023;

public class SuperKartica {
    private String brKartice;
    private String imeIPrezimeVlasnika;
    private int popust;

    public SuperKartica(String brKartice, String imeIPrezimeVlasnika, int popust) {
        this.brKartice = brKartice;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.popust = popust;
    }
    public SuperKartica(){}

    public String getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(String brKartice) {
        this.brKartice = brKartice;
    }

    public String getImeIPrezimeVlasnika() {
        return imeIPrezimeVlasnika;
    }

    public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampajKarticu (){
        System.out.println("Vlasnik :" + this.imeIPrezimeVlasnika);
        System.out.println("Broj kartice: " + this.brKartice);
    }
}
