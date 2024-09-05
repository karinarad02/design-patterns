package model;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    protected Pacient() {
    }

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalatInterior=" + areHalatInterior +
                '}';
    }

    public abstract class PacientBuilder implements AbstractBuilder{
        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciCamera;
        private boolean areHalatInterior;

        public PacientBuilder(String numePacient) {
            this.nume=numePacient;
        }


        @Override
        public AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil=arePatRabatabil;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus) {
            this.areMicDejunInclus=areMicDejunInclus;
            return this;

        }

        @Override
        public AbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera) {
            this.arePapuciCamera=arePapuciCamera;
            return this;
        }

        @Override
        public AbstractBuilder adaugaHalatInterior(boolean areHalatInterior) {
            this.areHalatInterior=areHalatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient();
        }
    }
}
