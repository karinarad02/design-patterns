package guvernelelumii.main;

import guvernelelumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernReg = GuvernRegistry.getInstance();
        guvernReg.adaugaGuvern("Romania","Ion",10);
        guvernReg.adaugaGuvern("Romania","Marcel",12);
        guvernReg.adaugaGuvern("Ungaria","Victor",12);

        guvernReg.getGuvern("Romania").setNumePrimMinistru("Bogdan");
        System.out.println(guvernReg.getGuvern("Romania"));
        System.out.println(guvernReg.getGuvern("Ungaria"));

    }
}
