package Pb7.clase;

public abstract class RezultatAbstract {
    private String cod;
    private String numePacient;
    private String diagnostic;
    private double sumaPlata;

    public RezultatAbstract(String cod, String numePacient, String diagnostic, double sumaPlata) {
        this.cod = cod;
        this.numePacient = numePacient;
        this.diagnostic = diagnostic;
        this.sumaPlata = sumaPlata;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public double getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(double sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezultatAbstract{");
        sb.append("cod='").append(cod).append('\'');
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append(", diagnostic='").append(diagnostic).append('\'');
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append('}');
        return sb.toString();
    }

    public abstract void printareRezultat();
}
