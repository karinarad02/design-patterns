package Pb13.clase;

public class nuAreBani implements Stare{
    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
