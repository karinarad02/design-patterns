package Pb1.clase;

public class FactoryMijlocTransport {
    public MijlocTransport creareMijlocTransport(TipTransport tipTransport){
        switch (tipTransport){
            case AUTOBUZ:return new Autobuz();
            case TRAMVAI:return new Tramvai();
            case TROLEIBUZ:return new Troleibuz();
            default:
                throw new RuntimeException("Tip invalid de mijloc de transport");
        }
    }
}
