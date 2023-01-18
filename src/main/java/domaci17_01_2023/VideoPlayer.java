package domaci17_01_2023;



public class VideoPlayer {
    private int duzinaVide;
    private int trenutnoVremeVidea;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public int getDuzinaVide() {
        return duzinaVide;
    }

    public void setDuzinaVide(int duzinaVide) {
        this.duzinaVide = duzinaVide;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(int duzinaVide, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVide = duzinaVide;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(){

    }
    public void stampaj(){
        System.out.println("Trenutno vreme videa:" + this.trenutnoVremeVidea);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitetVidea );
    }
}
