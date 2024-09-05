package Pb10.clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(double suma,String nume) {
        System.out.println(nume+" are de platit "+suma+" cu cardul de calatorii!");
    }
}
