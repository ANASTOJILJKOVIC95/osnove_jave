package domaci17_01_2023;

public class AudioControl extends Control {
    private boolean pojacaj;

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl(){

    }

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    @Override
    public void izvrisAkciju(VideoPlayer a) {
        if (this.pojacaj){
            a.setJacinaZvuka(a.getJacinaZvuka() + 1);
            if (a.getJacinaZvuka() > 100){
                a.setJacinaZvuka(100);
            }
            else {
                a.setJacinaZvuka(a.getJacinaZvuka() - 1);
                if (a.getJacinaZvuka() < 0) {
                    a.setJacinaZvuka(0);
                }
            }
        }
    }
}
