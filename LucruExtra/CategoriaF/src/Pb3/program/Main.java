package Pb3.program;

import Pb3.clase.AutobuzLinie;
import Pb3.clase.BuilderAutobuzLinie;
import Pb3.clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder=new BuilderAutobuzLinie("Mercedes","Marcel");
        AutobuzLinie autobuzLinie=builder
                .adaugaDeschidereUsi(true)
                .build();
        System.out.println(autobuzLinie);
    }
}