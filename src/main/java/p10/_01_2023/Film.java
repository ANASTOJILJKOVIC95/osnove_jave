package p10._01_2023;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziserJe;

    public void reziserJe(Reziser reziserJe){
        this.reziserJe = reziserJe;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }
    public void print (){
        System.out.println(this.naziv + ", " + this.godina);
        if(reziserJe != null){
            System.out.println("Rezirao je " + reziserJe.getIme() + ", " + reziserJe.getStarost() + " godina");
        }
    }
}
