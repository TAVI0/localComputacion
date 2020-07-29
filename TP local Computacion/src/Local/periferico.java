/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;

/**
 *
 * @author tavio
 */
public class periferico {
    private String nombre;
    private int precio;
    private String tipo;

    public periferico(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    
        public String detalles(){
        return  "Nombre:"+this.nombre+"\n" +
                "Precio: "+this.precio+"$\n" +
                "Tipo: "+ this.tipo+"\n";
                            
    }
       
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
