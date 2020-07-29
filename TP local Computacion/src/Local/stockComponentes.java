package Local;

import java.util.ArrayList;
import java.util.List;


public class stockComponentes {

    private List<componente> componentes;

    public stockComponentes() {
        componentes = new ArrayList();
    }

    
    public List<componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<componente> componentes) {
        this.componentes = componentes;
    }
    
    
    
    public void agregar(componente p) {
       componentes.add(p);
        
    }
    
    public String obtenerDetalles(int i) {
        return componentes.get(i).detalles();

    }
       
    public String obtenerListadoComponente(String tipo) {
        String lista = "";
        for (int i = 0; i < componentes.size(); i++) {
            if(componentes.get(i).getTipo().equals(tipo)){
                lista += "[" + i + "] " + componentes.get(i).minDetalles() + "\n";
            }
        }
       return lista;
    }
    
    public String obtenerListadoComponente(){
        String lista = "";
        for (int i = 0; i < componentes.size(); i++) {
            lista += "[" + i + "] " + componentes.get(i).minDetalles() + "\n";
        }
        return lista;
    }
}
