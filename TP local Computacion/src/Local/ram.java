package Local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ram extends componente {
    private String marca;
    private String tecnologia;
    private float frecuencia;
    private int capacidad;

    public ram(String descrip, int precio, Date fecha_carga, String clasif, String marca, String tecnologia, float frecuencia, int capacidad) {
        super(descrip, precio, fecha_carga, clasif);
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.frecuencia=frecuencia;
        this.capacidad=capacidad;
        setTipo("Ram");
    }
    
    @Override
    public String detalles(){
        String s = new SimpleDateFormat("dd'/'MM'/'yyyy").format(this.getFecha_carga());
        return  "Tipo:"+this.getTipo()+"\n" +
                "Fecha de Carga: "+s+"\n" +
                "Descripcion:" + this.getDescrip()+"\n" +
                "Precio"+this.getPrecio()+"\n" +
                "Desk/lap:"+this.getClasif()+"\n"+
                "Marca: "+this.marca+"\n"+
                "Tecnologia: "+this.tecnologia+"\n"+
                "Frecuencia: "+this.frecuencia+"\n"+
                "Capacidad: "+this.capacidad+"\n";
    }
    
    @Override
    public String minDetalles(){
        return this.getTipo() +" "+this.tecnologia+" "+this.frecuencia+" "+this.capacidad+"GB"+" "+this.getClasif()+" "+this.getPrecio()+" ";
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public float getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
