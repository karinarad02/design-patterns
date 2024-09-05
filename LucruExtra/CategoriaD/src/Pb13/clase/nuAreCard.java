package Pb13.clase;

public class nuAreCard implements Stare{
    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
