package domaci17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        QualityOptimizerControl qoc = new QualityOptimizerControl();
        TimeControl tc = new TimeControl();
        AudioControl ac = new AudioControl();

        VideoPlayer a = new VideoPlayer(240, 120, 75, 140);
        a.stampaj();

        tc.izvrisAkciju(a);
        ac.izvrisAkciju(a);
        qoc.izvrisAkciju(a);

        a.stampaj();




    }
}
