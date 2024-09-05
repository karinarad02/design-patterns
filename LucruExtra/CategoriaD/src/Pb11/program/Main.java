package Pb11.program;

import Pb11.clase.Client;
import Pb11.clase.PersoanaJuridica;
import Pb11.clase.TipClient;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Marc");
        client.verficareActe();
        TipClient juridica=new PersoanaJuridica();
        client.setTipClient(juridica);
        client.verficareActe();
    }
}