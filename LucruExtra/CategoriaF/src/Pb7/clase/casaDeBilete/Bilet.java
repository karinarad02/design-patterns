package Pb7.clase.casaDeBilete;

public class Bilet extends BiletAbstract{

    public Bilet(String numeCalator, String data) {
        super(numeCalator, data);
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }
}
