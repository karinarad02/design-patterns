package clase;

public class PlataInvalida extends ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume+ " nu are fonduri suficiente pentru realizarea platii");
    }
}
