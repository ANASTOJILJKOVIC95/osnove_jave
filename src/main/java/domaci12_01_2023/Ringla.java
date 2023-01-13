package domaci12_01_2023;

public class Ringla {
   private String tipRingle;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacina = 0;
    }

    public double getJacinaGrejaca() {
        return jacinaGrejaca;
    }

    public String getTipRingle() {
        return tipRingle;
    }

    private Ringla(){
        this.jacina = 0;
    }

    public int getJacina() {
        return jacina;
    }

    private int brojPojacavanja(){
        if(this.tipRingle.equals("obicna")){
            return 3;}
        else if (this.tipRingle.equals("ekspres")){
            return 12;}
        return 0;
    }
    public void pojacaj() {
        this.jacina++;
        if (this.jacina > brojPojacavanja()) {
            this.jacina = 0;
        }
    }

    public void iskljuci(){
        this.jacina=0;
    }

    public boolean daLiJeRinglaUkljucena(){
        if (this.jacina == 0 ){
            return  false;
        } return true;
    }
    public double potrosnja(int sati){
        return 100/ this.brojPojacavanja() * this.jacina * this.jacinaGrejaca * sati;
    }

    public void stamaj(){
        System.out.print("Ringla je ");
        if (daLiJeRinglaUkljucena()){
            System.out.println("ukljucena.");}
        else {
            System.out.println("iskljucena");}
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + "KW");
    }


}



