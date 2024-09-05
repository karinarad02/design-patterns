package Pb4.clase;

public class Client implements IClient{
    private String nume;
    private int varsta;

    private Client() {
    }

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Client clone() {
        Client client=new Client();
        client.nume=this.nume;
        client.varsta=this.varsta;
        return client;
    }
}
