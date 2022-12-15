package domaci13_12_2022;

import jdk.nashorn.internal.runtime.Version;

import java.util.jar.JarEntry;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji stampa verziju softvera.
// Verzija softvera se sastoji od major, minor i patch brojeva.
// Koristan link za verzionisanje softvera. Odstampati na ekranu verziju softvera u formatu:
//[MAJOR].[MINOR].[PATCH]
        int major = 4;
        int minor = 2;
        int patch = 1;
        System.out.println(major + "." + minor + "."+patch);
    }
}
