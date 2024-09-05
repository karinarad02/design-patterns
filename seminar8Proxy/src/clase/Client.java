package clase;

public class Client {
    private String numeClient;
    private int varsta;

    public Client(String numeClient, int varsta) {
        this.numeClient = numeClient;
        this.varsta = varsta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeClient='" + numeClient + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
