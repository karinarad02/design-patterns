package Pb9.clase;

public class Internare implements InternareAbstracta {
    private String numeSpital;
    private int nrCamera;
    private String diagnostic;

    public Internare(String numeSpital, int nrCamera, String diagnostic) {
        this.numeSpital = numeSpital;
        this.nrCamera = nrCamera;
        this.diagnostic = diagnostic;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void interneaza(Client client) {
        System.out.println(client.getNumeClient()+" a fost internat in spitalul "+this.numeSpital+" in camera "+this.nrCamera+" pe caz de "+this.diagnostic);
    }
}
