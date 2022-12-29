package p29_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        Student ana = new Student();
        ana.setIme("Ana");
        ana.setPrezime("Stojiljkovic");
        ana.setBudzet(true);
        ana.setIndex(78);
        System.out.println(ana.getPrezime()+" " + ana.getIme()+ " " + ana.getIndex() + " . Da li je na budzetu? " + ana.getBudzet(true));

    }
}
