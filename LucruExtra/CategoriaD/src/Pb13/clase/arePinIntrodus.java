package Pb13.clase;

public class arePinIntrodus implements Stare{
    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);

    }
}
