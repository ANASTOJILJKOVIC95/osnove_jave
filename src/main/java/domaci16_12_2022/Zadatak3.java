package domaci16_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji stampa sve brojeve od 1 do 100 tako da:
        //sve parne stampa kao negativne a
        //sve neprane kao pozitivne brojeve
        for (int i = 0; i <=100; i++){
            if (i % 2 == 0 && i != 0){
                System.out.print("-" + i+ ", ");}
            else System.out.print(i+ ", ");
        }
    }
}
