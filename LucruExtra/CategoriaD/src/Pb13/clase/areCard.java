package Pb13.clase;

public class areCard implements Stare{
    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
