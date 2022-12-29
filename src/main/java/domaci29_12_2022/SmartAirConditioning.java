package domaci29_12_2022;

public class SmartAirConditioning {
    private String marka;
    private int hladi = 1;
    private int greje = 2;
    private int temperatura;
    private String mode;

    public String getMarka(){
        return this.marka;
    }
    public int getTemperatura(){
        return this.temperatura ;
    }
    public int getGreje(){
        return this.greje;
    }
    public int getHladi (){
        return this.hladi;
    }
   public String getMode(){
        return this.mode;
    }
    public void setMarka (String marka){
        this.marka = marka;
    }
    public void setTemperatura (int temperatura){
        this.temperatura = temperatura;
        if (this.temperatura < 16){
            this.temperatura = 16;
        } else if (this.temperatura > 35) {
            this.temperatura =35;}
    }
    public void setMode (String mode){
        this.mode = mode;
    }
    public void stampa (){
        System.out.println(this.marka + " - " + this.mode + " - " + this.temperatura );
    }
    public double mesecnaPotrosnja () {
        int potrosnja = 0;
        if (mode.equals("hladi")) {
            potrosnja = 30 * 15 * hladi;
        } else if (mode.equals("greje")) {
            potrosnja = 30 * 15 * greje;
        }else {potrosnja = 0;}
        return potrosnja;
    }

    public double trosak (){
        double trosak = 0;
        if (this.mesecnaPotrosnja() <= 350){
            trosak = mesecnaPotrosnja() * 6;
        } else if(this.mesecnaPotrosnja() >350){
            trosak = mesecnaPotrosnja() * 9;
        } else {trosak = 0;}
        return trosak;
    }
}
