package clase;

public class Achizitionata implements Stare{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
