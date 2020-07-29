package Local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class grafica extends componente{
    private String fabricante;
    private String modelo;
    private int capacidad;

    public grafica(String descrip, int precio, Date fecha_carga, String clasif, String fabricante, String modelo, int capacidad) {
        super(descrip, precio, fecha_carga, clasif);
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.capacidad=capacidad;
        setTipo("Grafica");
    }
    
    @Override
    public String detalles(){
        String s = new SimpleDateFormat("dd'/'MM'/'yyyy").format(this.getFecha_carga());
        return  "Tipo:"+this.getTipo()+"\n" +
                "Fecha de Carga: "+s+"\n" +
                   "Descripcion: " + this.getDescrip()+"\n" +
                   "Precio: "+this.getPrecio()+"$\n" +
                   "Desk/lap: "+this.getClasif()+"\n"+
                   "Fabricante: "+this.fabricante+"\n"+
                   "Modelo: "+this.modelo+"\n"+
                   "Capacidad: "+this.capacidad;           
       }
    @Override
    public String minDetalles(){
        return this.getTipo() +" "+this.fabricante+" "+this.modelo+" "+this.getClasif()+" "+this.getPrecio()+" ";
    }
    
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
