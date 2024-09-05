package Pb11.clase.autobuz;

public class Autobuz extends Subiect{
    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
    }

    @Override
    public void notificarePlecareAutobuz() {
        super.notificareClatori("Autobuzul numarul "+numar+" a plecat din capatul liniei!");
    }
}
