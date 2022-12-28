package domaci27_12_2022;

public class Proizvod {
    public String naziv;

    public double cena;
    public double tezina;

    public void stampa(){
        System.out.println(naziv + ", " + cena + ", " + tezina);
    }
    public double tezina (String jedinica){
        if (jedinica.equals("kg")){
           return this.tezina / 1000;
        } else if (jedinica.equals("t")) {
            return this.tezina / 1000000;}
        else { return 0;}
    }
}
