package clase;

public class ProxyBilet implements BiletAbstract{
    private BiletAbstract bilet;
    private static int varstaMinima=14;

    public ProxyBilet(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyBilet.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta()>=varstaMinima){
            this.bilet.vanzareBilet(client);
        }else{
            System.out.println("Nu ai voie sa cumperi bilet!");
        }
    }
}
