package Local;

import java.util.ArrayList;
import java.util.List;


public class stockPerifericos {
    
    private List <periferico> perifericos;     
    
    public stockPerifericos() {
        perifericos = new ArrayList();
    }
   
    
    public List <periferico> getPerifericos() {
        return perifericos;
    }
    public void setPerifericos(List <periferico> perifericos) {
        this.perifericos = perifericos;
    }
    
    public void agregar(periferico p) {
        if (p != null) {
            perifericos.add(p);
        }
    }
    
       public String obtenerDetalles(int i) {
        return perifericos.get(i).detalles();

    }
    
}
