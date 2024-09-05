package Pb9.clase;

public class ProxyInternare implements InternareAbstracta{
    private InternareAbstracta internare;

    public ProxyInternare(InternareAbstracta internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(Client client) {
        if(client.isAreAsigurare()){
            this.internare.interneaza(client);
        }else{
            System.out.println("Nu te poti interna fara asigurare medicala!");
        }
    }
}
