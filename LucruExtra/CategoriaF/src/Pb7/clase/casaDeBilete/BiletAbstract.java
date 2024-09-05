package Pb7.clase.casaDeBilete;

public abstract class BiletAbstract {
    private String numeCalator;
    private String data;

    public BiletAbstract(String numeCalator, String data) {
        this.numeCalator = numeCalator;
        this.data = data;
    }

    public String getNumeCalator() {
        return numeCalator;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("numeCalator='").append(numeCalator).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public abstract void printareBilet();
}
