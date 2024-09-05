package clase;

import java.util.ArrayList;
import java.util.List;

public class ProxySector implements BiletAbstract{
    private static List<Character>listaLitere=new ArrayList<>();
    private BiletAbstract bilet;

    public ProxySector(BiletAbstract bilet) {
        this.bilet = bilet;
    }
    public static void adaugaLitere(Character litera){
        listaLitere.add(litera);
    }

    @Override
    public void vanzareBilet(Client client) {
        if(listaLitere.contains(client.getNumeClient().charAt(0))){
            this.vanzareBilet(client);
        }else{
            System.out.println("Mergi la alt sector!");
        }
    }
}
