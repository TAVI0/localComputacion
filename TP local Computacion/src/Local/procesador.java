package Local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class procesador extends componente{
    private String fabricante;
    private String modelo;
    private int frecuencia;

    public procesador(String descrip, int precio, Date fecha_carga, String calif, String fabricante,String modelo, int frecuencia) {
        super(descrip, precio, fecha_carga, calif);
        this.fabricante = fabricante;
        this.modelo=modelo;
        this.frecuencia=frecuencia;
        setTipo("Procesador");

    }
    
    @Override
    public String detalles(){
        String s = new SimpleDateFormat("dd'/'MM'/'yyyy").format(this.getFecha_carga());
        return  "Tipo:"+this.getTipo()+"\n" +
                "Fecha de Carga: "+s+"\n" +
                "Descripcion: " + this.getDescrip()+"\n" +
                "Precio: "+this.getPrecio()+"\n" +
                "Desk/lap: "+this.getClasif()+"\n"+
                "Fabricante: "+this.fabricante+"\n"+
                "Modelo: "+this.modelo+"\n"+
                "Frecuencia: "+this.frecuencia+"\n";          
    }
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
    public int getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
}
