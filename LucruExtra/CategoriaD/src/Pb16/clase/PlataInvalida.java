package Pb16.clase;

public class PlataInvalida extends ModPlata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println("Plata clientului "+nume+" in valoare de "+suma+" lei nu se poate efectua!");
    }
}
