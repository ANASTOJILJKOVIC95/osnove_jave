package domaci27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mode;

    public void stampa() {
        System.out.println("Klima uredjaj marke " + marka + " " + mode + " na " + temperatura + " stepeni");
    }

    public boolean razlikaUTemperaturi(int temperaturaNapolju) {
        if (this.temperatura > temperaturaNapolju) {
            return true;
        }else return  false;
    }
}
