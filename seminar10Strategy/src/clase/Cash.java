package clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume+" are de platit "+suma);
    }
}
