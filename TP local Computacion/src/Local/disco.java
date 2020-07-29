package Local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class disco extends componente {
    private String marca;
    private String modelo;
    private int capacidad;

    public disco(String descrip, int precio, Date fecha_carga, String clasif,String marca, String modelo, int capacidad) {
        super(descrip, precio, fecha_carga,clasif);
        this.marca= marca;
        this. modelo =modelo;
        this.capacidad=capacidad;
        this.setTipo("Disco");    
    }
    


    @Override
        public String detalles(){
        String s = new SimpleDateFormat("dd'/'MM'/'yyyy").format(this.getFecha_carga());
        return  "Tipo:"+this.getTipo()+"\n" +
                "Fecha de Carga: "+s+"\n" +
                "Descripcion:" + this.getDescrip()+"\n" +
                "Precio: "+this.getPrecio()+"$\n" +
                "desk/lap: "+this.getClasif()+"\n" +
                "Marca: "+ this.marca +"\n" +
                "Modelo: " +this.modelo +"\n" +
                "Capacidad: "+this.capacidad +" GB\n";             
    }
        public String minDetalles(){
            return this.getTipo()+" "+this.marca+" "+this.capacidad+" "+this.getClasif()+" "+this.getPrecio()+" ";
        }
    
 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
