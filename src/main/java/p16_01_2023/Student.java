package p16_01_2023;

public class Student extends Osoba{
    private int brojIndexa;
    private int dugZaSkolarinu;

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public int getDugZaSkolarinu() {
        return dugZaSkolarinu;
    }

    public void setDugZaSkolarinu(int dugZaSkolarinu) {
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public Student(String imeIPrezime, String jmbg, int brojIndexa, int dug) {
        super(imeIPrezime, jmbg);
        this.brojIndexa = brojIndexa;
        this.dugZaSkolarinu = dug;
    }
    public void umanjiDug (int iznos){
        this.dugZaSkolarinu = this.dugZaSkolarinu - iznos;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indexa: " + this.brojIndexa);
        System.out.println("Preostalo dugovanje: " + this.dugZaSkolarinu);
    }
}
