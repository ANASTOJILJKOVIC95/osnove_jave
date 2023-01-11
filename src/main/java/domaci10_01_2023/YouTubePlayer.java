package domaci10_01_2023;

public class YouTubePlayer {
    private Video video;
    private int kvalitet;
    private String rezim;
    private int jacinaZvuka;
    private int vreme;

    public Video getVideo() {
        return video;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public String getRezim() {
        return rezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public double getVreme() {
        return vreme;
    }

    public YouTubePlayer() {
        this.jacinaZvuka = 75;
        this.kvalitet = 144;
        this.rezim = "mini player";
    }

    public void ucitajVideo(Video video) {
        this.video = video;
        this.vreme = 0;
        this.video.pogledaj();
    }

    public void pojacaj() {
        this.jacinaZvuka = this.jacinaZvuka + 10;
        if (this.jacinaZvuka > 100) {
            this.jacinaZvuka = 100;
        }
    }

    public void utisaj() {
        this.jacinaZvuka = this.jacinaZvuka - 10;
        if (this.jacinaZvuka < 0) {
            this.jacinaZvuka = 0;
        }
    }

    public void kvalitet(int brzinaInterneta) {
        if (brzinaInterneta <= 2) {
            this.kvalitet = 144;
        } else if (brzinaInterneta <= 4) {
            this.kvalitet = 240;
        } else if (brzinaInterneta <= 6) {
            this.kvalitet = 480;
        } else if (brzinaInterneta <= 8) {
            this.kvalitet = 720;
        } else {
            this.kvalitet = 1080;
        }
    }

    public void aktivirajMiniPlayer(){
        this.rezim ="Mini Player";
    }
    public void aktivirajBioskopskiMod(){
        this.rezim ="Bioskopski Mod";
    }
    public void aktivirajjPrekoCelogEkranaMod(){
        this.rezim = "Preko celog ekrana";
    }
    public void premotajUnapred (){
        this.vreme = this.vreme + 10;
        if (this.vreme > video.getDuzinaVidea()){
            this.vreme = video.getDuzinaVidea();
        }
    }
    public void premotajUnazad(){
        this.vreme = this.vreme - 10;
        if(this.vreme == 0){
            this.vreme = 0;
        }
    }
    public void iscrtajZvuk (){
        System.out.print("<");
        int brCrtica = this.jacinaZvuka / 10;
        for (int i = 0; i < brCrtica; i++ ){
            System.out.print("|");
            if (brCrtica == 0 ){
                System.out.println("/");
            }
        }
    }
    public void iscrtajRezim(){
        if (rezim.equals("Mini Player")){
            System.out.println("[ ]");
        }else if(rezim.equals("Bioskopski Mod")){
            System.out.println("[...]");
        }else if (rezim.equals("Preko celog ekrana")){
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme (){
        int minut = this.vreme / 60;
        int sekund = this.vreme % 60;
        int minut1 = this.video.getDuzinaVidea() / 60;
        int sekund1 = this.video.getDuzinaVidea() % 60;
        System.out.println(minut + ":" + sekund + "/" + minut1 + ":" + sekund1);
    }
    public void iscrtajTimeline (){
        int brojZvezdica = this.vreme * 100 / this.video.getDuzinaVidea();
        int brojTackica = 100 - brojZvezdica;
        System.out.print("Timeline: ");
        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < brojTackica; i++) {
            System.out.print(".");
        }
        System.out.println();
    }
    public void iscrtajPlayer(){
        iscrtajTrenutnoVreme();
        iscrtajZvuk();
        iscrtajTimeline();
        System.out.println("Kvalitet: " + kvalitet + "p");
        System.out.print("Rezim: " );
        iscrtajRezim();
        System.out.println(video.getNazivVidea());
        System.out.println("Likes: " + video.getBrojLajkova() + " | " + " Dislikes " + video.getBrojDislajkova());
        System.out.println(video.getBrojPregleda() + " Pregleda");
    }
    public String seruj() {
        return "//https://youtu.be/" + video.getId();
    }

}