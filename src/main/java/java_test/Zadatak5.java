package java_test;

public class Zadatak5 {//Napisati metodu koja radi pakovanje nekog teksta u HTML elemente. Metoda kao
    // parametar prima tekst i tip, a vraca HTML element (String) sa proslednjenim tekstom.
    // Metoda podrzava sledece tipove:
    // bold, metoda pakuje tekst u <b>prosledjen tekst</b>
    // italic, metoda pakuje tekst u <em>proslednjen tekst</em>
    // paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
    // Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj. vraca se nakav kakav je
    // dosao umetodu
    public static void main(String[] args) {
        htmlElement("Ana Stojiljkovic", "bold" );
        System.out.println(htmlElement("Ana Stojiljkovic", "bold" ));
        htmlElement("Ana Stojiljkovic", "italic");
        System.out.println(htmlElement("Ana Stojiljkovic", "italic"));
        htmlElement("Ana Stojiljkovic", "paragraph");
        System.out.println(htmlElement("Ana Stojiljkovic", "paragraph"));


    }
  public static String htmlElement (String text, String tip){
        if (tip.equals("bold")){
            String a = "<b>" + text + "</b>";
            return a;
        } else if (tip.equals("italic")) {
            String b = "<em>" + text + "</em>";
            return b;
        } else if (tip.equals("paragraph")) {
            String c = "<p>" + text + "</p>";
            return c;
        }else{ return text;}

  }
}
