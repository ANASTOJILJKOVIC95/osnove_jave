package domaci16_01_2023;

public class Trener extends Osoba{
    private int goidneIskustva;
    private String tipTrenera;

    public Trener (){}

    public int getGoidneIskustva() {
        return goidneIskustva;
    }

    public void setGoidneIskustva(int goidneIskustva) {
        this.goidneIskustva = goidneIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Ovo je " + this.tipTrenera + " sa " + this.goidneIskustva + " godina iskustva");

    }
}
