package p19_01_2023;


import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Figura a = new Trougao(3);
        Figura a1 = new Trougao(4);

        Figura b = new Pravougaonik(2,3);
        Figura b1 = new Pravougaonik(5,7);
        Figura b2 = new Pravougaonik(6,9);

        ArrayList< Figura> figure = new ArrayList<>();
        figure.add(a);
        figure.add(a1);
        figure.add(b);
        figure.add(b1);
        figure.add(b2);

        double sumaObima = 0;
        double sumaPovrsine = 0;

        for (int i = 0; i <figure.size(); i++) {
           sumaObima = sumaObima +  figure.get(i).obim();
        }

        for (int i = 0; i < figure.size() ; i++) {
            sumaPovrsine = sumaPovrsine + figure.get(i).povrsina();
        }

        for (int i = 0; i < figure.size() ; i++) {
            figure.get(i).stampa();
        }

        System.out.println("Zibr obima je " + sumaObima);
        System.out.println("Zbir povrsina je " + sumaPovrsine);

    }
}
