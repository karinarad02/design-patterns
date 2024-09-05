package model.animal;

public class Maimuta extends Mamifer {

    public Maimuta(String nume, int varsta, int nrPicioare) {
        super(nume, varsta, nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Maimuta "+getNume()+" mananca "+mancare);
    }
}