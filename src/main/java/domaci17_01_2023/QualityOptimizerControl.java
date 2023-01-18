package domaci17_01_2023;

public class QualityOptimizerControl extends Control{
   private int brzinaInterneta;

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(){

    }

    @Override
    public void izvrisAkciju(VideoPlayer a) {
        if (this.brzinaInterneta * 10.1 <= 144){
            a.setKvalitetVidea(144);
        }else if (this.brzinaInterneta*10.1 <=240 ){
            a.setKvalitetVidea(240);
        }else if (this.brzinaInterneta*10.1 <=340 ){
            a.setKvalitetVidea(340);
        }else if (this.brzinaInterneta*10.1 <=480 ){
            a.setKvalitetVidea(480);
        }else if (this.brzinaInterneta*10.1 <=720 ){
            a.setKvalitetVidea(720);
        }else {
            a.setKvalitetVidea(1080);}
    }
}
