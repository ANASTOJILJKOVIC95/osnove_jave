package domaci12_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Ringla goreLevo = new Ringla("ekspres", 1.5);
        Ringla goreDesno = new Ringla("obicna", 1);
        Ringla doleLevo = new Ringla("ekspres", 1.5);
        Ringla doleDesno = new Ringla("obicna", 0.8);

        ElektricniSporet beko = new ElektricniSporet("beko", 7, 3,
                goreLevo,goreDesno,doleLevo,doleDesno);

        beko.pojacaj(2);
        beko.pojacaj(3);
        beko.pojacaj(1);
        beko.pojacaj(4);
        beko.pojacaj(4);
        beko.pojacaj(4);



        System.out.println(beko.potrosnja(3));

        doleDesno.stamaj();



    }
}
