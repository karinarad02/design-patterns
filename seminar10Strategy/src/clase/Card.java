package clase;

public class Card implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume+" are de platit "+suma);
    }
}
