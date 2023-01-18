package p17_01_2023;

public class StudentOsnovne extends Student{


    public StudentOsnovne(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    @Override
    public boolean budzet() {
        if(this.godinaStudija < 5){
            return true;
        } return false;
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }
}
