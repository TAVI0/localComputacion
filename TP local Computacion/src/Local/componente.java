package Local;

import java.util.Date;

public abstract class componente {


    private String descrip;
    private int precio;
    private Date fecha_carga;
    private String tipo; //disco, ram, grafica, etc
    private String clasif;//desktop, laptop, ambos
    
    
    public componente(String descrip, int precio, Date fecha_carga, String clasif) {
        this.descrip = descrip;
        this.precio = precio;
        this.fecha_carga = fecha_carga;
        this.clasif = clasif;
   }
    
    public abstract String detalles();
    public abstract String minDetalles();
    
    
    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(Date fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }
    
}
