package model.animal;

public class ZooKeeper {
    private String nume;
    public ZooKeeper(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void hranesteMamifer(Vietate vietate, String mancare)
    {
        vietate.eat(mancare);
    }
}