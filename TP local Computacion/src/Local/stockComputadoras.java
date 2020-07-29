package Local;

import java.util.ArrayList;
import java.util.List;


public class stockComputadoras {
    private List<interfazComputadora> computadoras;

    public stockComputadoras() {
        computadoras = new ArrayList();
    }
    public List<interfazComputadora> getComputadoras() {
        return computadoras;
    }
    public void setComputadoras(List<interfazComputadora> computadoras) {
        this.computadoras = computadoras;
    }

    public void agregar(interfazComputadora p) {
        if (p != null) {
            computadoras.add(p);
        }
    }
    
    public interfazComputadora sacar(int i) {
        return computadoras.get(i);
    }
    
    public String listaPC(){
        String lista = "";
        for (int i = 0; i < computadoras.size(); i++) {
            lista += "[" + i + "] " + computadoras.get(i).minDetalles()+" | Precio $"+computadoras.get(i).sumPrecios() + "\n";
        }
       return lista;
    }
   

    
}
