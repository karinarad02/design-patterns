package model;

import Singleton.Guvern;

public class Main {
    public static void main(String[] args) {
        Guvern guvern=Guvern.getInstance(4,"Marcel",12);
        Guvern guvern1=Guvern.getInstance(5,"Manole",36);
        System.out.println(guvern);
        System.out.println(guvern1);

    }
}