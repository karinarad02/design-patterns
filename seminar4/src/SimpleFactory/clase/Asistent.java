package SimpleFactory.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Asistentul "+super.getNume()+" are salariul "+super.getSalariu());
    }
}
