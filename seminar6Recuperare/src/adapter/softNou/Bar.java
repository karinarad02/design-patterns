package adapter.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura>listaBauturi;

    public Bar() {
        this.listaBauturi=new ArrayList<>();
    }

    public List<Bautura> getListaBauturi() {
        return listaBauturi;
    }
    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }

    public void tiparireNotaDePlata(){
        float total=0;
        System.out.println("Lista bauturi: ");
        for(Bautura bautura:listaBauturi){
            System.out.println(bautura);
            total+=bautura.getPret();
        }
        System.out.println("Total: "+total);
    }
}
