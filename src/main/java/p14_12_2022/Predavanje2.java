package p14_12_2022;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Scanner;

public class Predavanje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Unesite vrednost za a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost za b:");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Zbir brojeva je "  + sum);
        System.out.println("Unesite double");
        double x = s.nextDouble();
        System.out.println("Unet je double" + x);
        System.out.println("Unesite ime i prezime");
        String ime = s.next();
        System.out.println("Unesite boolean:");
        boolean unetBoolean = s.nextBoolean();
        System.out.println("Unet je boolean: " + unetBoolean);

    }
}
