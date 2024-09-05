package Pb10.clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println(nume+" are de platit "+suma+" prin SMS!");

    }
}
