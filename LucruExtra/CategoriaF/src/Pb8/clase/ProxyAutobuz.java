package Pb8.clase;

public class ProxyAutobuz implements InterfataAutobuz{
    Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void oprireInStatie(Client client) {
        if(autobuz.getNumarPasageri()>0){
            System.out.println("Autobuzul opreste in statie pentru clientul "+client.getNumeClient());
        }else{
            System.out.println("Autobuzul este gol si se retrage, nu va mai opri in statie!");
        }
    }
}
