package Pb1.clase;

public class FactoryJucator {
    public synchronized IJucator creareJucator(TipJucator tipJucator) throws Exception {
        switch (tipJucator){
            case PORTAR:return new Portar();
            case FUNDAS:return new Fundas();
            case ATACANT:return new Atacant();
            default:
                throw new Exception("Tip invalid de jucator");
        }
    }
}
