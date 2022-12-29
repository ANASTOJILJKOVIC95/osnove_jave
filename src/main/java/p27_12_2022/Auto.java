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
    public String registracija;
    public boolean klima;
    public int maxBrzina = 240;
    public int kapacitetRezervoara=15;
    public int gorivo;
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
        if (this.kubikaza <= 2000){
            int cena = kubikaza * 100;
            return cena;
        }else if (this.kubikaza > 2000){
            int cena = this.kubikaza * 100 + (((this.kubikaza*100)/100)*30);
            return cena;
        }else {return 0;}
    }
    public void upaliKlimu (){
        this.klima = true;
    }
    public void dodajGas(){
        this.brzina = this.brzina + 10;
        if (this.brzina > this.maxBrzina){
            this.brzina = this.maxBrzina;}
    }
    public void koci(){
        this.brzina = this.brzina - 10;
        if (this.brzina < 0){ this.brzina = 0;
        }
    }


    public double trenutnapotrosnja () {
        double klimaFaktor = 0;
        if (this.klima == klima){
            klimaFaktor = klimaFaktor + 1.2;
        } else if (this.klima != klima) {
            klimaFaktor = klimaFaktor + 1.0;
        }
        return  this.brzina / 100 * this.potrosnja * klimaFaktor;
    }
    public void stampajTablu () {
        int brojCrta = (this.brzina * 100) / this.maxBrzina;
        for (int i = 0; i < 100; i++) {
            if (i <= brojCrta) {
                System.out.print("|");
            } else {
                System.out.print("*");
            }
        }
    }
        public int sipajGorivo (int kolicina){
        this.gorivo = this.gorivo + kolicina;
         if (this.gorivo > this.kapacitetRezervoara){
             kolicina = this.kapacitetRezervoara - this.gorivo;}
         return kolicina * 210;
    }
}


