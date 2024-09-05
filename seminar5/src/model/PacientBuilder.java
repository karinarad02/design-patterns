package model;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String numePacient) {
        this.pacient=new Pacient();
        pacient.setNume(numePacient);
    }

    @Override
    public AbstractBuilder adaugaPatRabatabil() {
        pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMicDejunInclus() {
        pacient.setAreMicDejunInclus(true);
        return this;

    }

    @Override
    public AbstractBuilder adaugaPapuciCamera() {
        pacient.setArePapuciCamera(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaHalatInterior() {
        pacient.setAreHalatInterior(true);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
