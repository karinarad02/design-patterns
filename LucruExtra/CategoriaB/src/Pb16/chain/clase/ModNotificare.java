package Pb16.chain.clase;

public abstract class ModNotificare {
    protected ModNotificare succesor;

    public ModNotificare getSuccesor() {
        return succesor;
    }

    public void setSuccesor(ModNotificare succesor) {
        this.succesor = succesor;
    }

    public abstract void notifica(Client client,String mesaj);
}
