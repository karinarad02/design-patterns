package Pb6.clase;

public class Card extends CardAbstract{
    public Card(String numar, String detinator, double suma) {
        super(numar, detinator, suma);
    }

    @Override
    public void plata() {
        System.out.println(super.getDetinator()+" a platit cu cardul "+super.getNumar()+" suma de "+super.getSuma());
    }

}
