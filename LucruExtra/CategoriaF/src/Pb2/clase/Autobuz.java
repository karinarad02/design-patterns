package Pb2.clase;

public class Autobuz implements IAutobuz{
    private String marca;
    private int nrLocuri;
    private float litriBenzina;

    private Autobuz() {
    }

    public Autobuz(String marca, int nrLocuri, float litriBenzina) {
        this.marca = marca;
        this.nrLocuri = nrLocuri;
        this.litriBenzina = litriBenzina;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setLitriBenzina(float litriBenzina) {
        this.litriBenzina = litriBenzina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", litriBenzina=").append(litriBenzina);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAutobuz clone() {
        Autobuz autobuz=new Autobuz();
        autobuz.marca=this.marca;
        autobuz.nrLocuri=this.nrLocuri;
        autobuz.litriBenzina=this.litriBenzina;
        return autobuz;
    }

}
