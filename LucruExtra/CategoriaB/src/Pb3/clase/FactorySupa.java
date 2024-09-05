package Pb3.clase;

public class FactorySupa {

    public ISupa creareSupa(TipSupa tipSupa) throws Exception {
        switch (tipSupa){
            case LEGUME:return new SupaLegume();
            case CIUPERCI:return new SupaCiuperci();
            case VITA:return new SupaVita();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}
