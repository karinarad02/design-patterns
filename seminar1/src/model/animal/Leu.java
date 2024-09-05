package model.animal;

public class Leu extends Mamifer{
    public Leu(String nume, int varsta, int nrPicioare) {
        super(nume, varsta, nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul "+getNume()+" mananca "+mancare);
    }
}