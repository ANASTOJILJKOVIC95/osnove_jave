package domaci10_01_2023;

public class ClanskaKartica {
    private double popust;
    private String brojKartice;

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
    public ClanskaKartica(){

    }
    public ClanskaKartica(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
