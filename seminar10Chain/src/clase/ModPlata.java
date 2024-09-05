package clase;

public abstract class ModPlata {
    public abstract void plateste(int suma, String nume);
    protected ModPlata succesor;

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }
}
