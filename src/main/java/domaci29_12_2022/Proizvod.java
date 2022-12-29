package domaci29_12_2022;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Proizvod {
    private String ime;
    private double cena;
    private double tezinaUGramima;

    public String getIme (){
        return this.ime;
    }
    public double getCena(){
        return this.cena;
    }
    public double getTezinaUGramima (){
        return this.tezinaUGramima;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public void setCena (double cena) {
        this.cena = cena;
    }
    public void setTezinaUGramima (double tezinaUGramima){
        this.tezinaUGramima = tezinaUGramima;
    }
    public void stampaj(){
         System.out.println(this.ime + " - " + this.cena +
                 ", " + this.tezinaUGramima+ " g");
    }
    public void povecajCenu(double povecanje){
        this.cena = this.cena + povecanje;
    }
    public double vratiCenuSaPopustom (int popust){
        double cenaSaPopustom = cena - (cena / 100 * popust);
        return cenaSaPopustom;
    }

    public double racunajPostarinu(){
        int postarina = 0;
        if (this.tezinaUGramima <= 10){
            postarina = 200;
        } else if (this.tezinaUGramima > 100 && this.tezinaUGramima <= 500) {
           postarina = 500; 
        } else if (this.tezinaUGramima > 500) {
            postarina = 1000;
        } return postarina;
    }
}
//Ja i ovo uradih sa seterima i geterima i ako nije bilo naglaseno, s obzirom
// da bi svi atributi trebali da budu private
