package clase;

public class Solicitata implements Stare{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
