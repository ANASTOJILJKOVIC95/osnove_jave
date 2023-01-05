package java_test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Zadatak2 {//Napisati program koji petljom iscrtava toplomer.
    // Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite donju granicu toplomera");
        int a = s.nextInt();
        System.out.println("Unesite gornju granicu toplomera");
        int b = s.nextInt();

        for (int i = b; i >= a; i --){
            System.out.println("|-" + i + "|");
        }
        System.out.println("  /"); // ova prva kosa crta u mom inteliju nesto nece
        System.out.println(" | |");
    }
}
