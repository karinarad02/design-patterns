package Pb4.program;

import Pb4.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double>listaIngrediente=new HashMap<>();
        listaIngrediente.put("Vitamina D",5.1);
        listaIngrediente.put("Vitamina K",3.2);
        listaIngrediente.put("Vitamina C",2.2);
        Reteta reteta=new Reteta("Paracetamol",listaIngrediente,10.5);
        System.out.println(reteta);
    }
}