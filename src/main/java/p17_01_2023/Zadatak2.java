package p17_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovne a = new StudentOsnovne("Marko", "54", 3);
        StudentMaster m = new StudentMaster("Nikola", "845", 1);

        a.stampaj();
        m.stampaj();
    }
}
