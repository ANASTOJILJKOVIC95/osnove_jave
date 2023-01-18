package p17_01_2023;

public class StudentMaster extends Student{


    public StudentMaster(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    @Override
    public boolean budzet() {
        if (this.godinaStudija < 2){
            return  true;
        }
        return false;
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }
}
