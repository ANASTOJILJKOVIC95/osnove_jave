package p27_12_2022;

public class Auto {
    public String vozac;
    public String marka;
    public int vrata;
    public int potrosnja;
    public int brzina;
    public int godina;

    public int mesec;
    public int kubikaza;

    public void stampa() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.vrata + "ro vrata");
        System.out.println(this.brzina + "km/h je trenutan brzina");
    }
        public boolean prekoracenje (int ogranicenje){
        if (ogranicenje < this.brzina){
            return true;
        } else if (ogranicenje > this.brzina) {
            return false;
        } return false;

}
        public int kazna (int ogranicenje) {
        if (ogranicenje < this.brzina) {
            int kazna = 0;
            for (int i = ogranicenje; i < this.brzina; i++) {
             kazna = kazna + 1000;
            }return kazna;
     } else {
       return 0;
     }
}
    public boolean oldtajmer () {
        if (1950< this.godina) {
            boolean oldtajmer = false;
            return oldtajmer;
        } else {
            boolean oldtajmer = true;
            return oldtajmer;
        }
    }
    public boolean registracija (int trenutniMesec){
        if (this.mesec < trenutniMesec) {
        boolean registracija = true;
        return registracija;
    } else {
        boolean registracija = false;
        return registracija;
        }
}
    public double cena (int kubikaza){
        if (kubikaza <= 2000){
            int cena = kubikaza * 100;
            return cena;
        }else if (kubikaza > 2000){
            int cena = kubikaza * 100 + (((kubikaza*100)/100)*30);
            return cena;
        }else {return 0;}
    }
}


