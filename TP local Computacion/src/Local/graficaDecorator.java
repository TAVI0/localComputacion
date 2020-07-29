package Local;

import java.util.Date;

public class graficaDecorator extends computadoraDecorador{
    
    private grafica graf;
    
    public graficaDecorator(interfazComputadora computadoraDecorada, grafica graf) {
        super(computadoraDecorada);
        this.graf = graf; 
    }

    @Override
    public String detalles(){
        return this.computadoraDecorada.detalles()
                + "\n"+this.graf.getFabricante()+" "+this.graf.getModelo()+" "+this.graf.getCapacidad()+" GB";
    }
    
    @Override
    public float sumPrecios() {
        float suma = 0;
        Date hoy = new Date();
        Date unAño = new Date(hoy.getTime() - 86400000*365);
        
        
        if (this.graf.getFecha_carga().getTime() < unAño.getTime()){
            suma = this.graf.getPrecio()-(this.graf.getPrecio()*0.20f);
            if ("desk".equals(this.computadoraDecorada.getTipo()))
                suma=suma-(suma*0.15f);
            return this.computadoraDecorada.sumPrecios()+suma;
        }
        if ("desk".equals(this.computadoraDecorada.getTipo()))
            suma=suma-(suma*0.15f);
        suma = this.graf.getPrecio();
        
        
        return this.computadoraDecorada.sumPrecios()+suma;
    }
        
        @Override
    public String minDetalles() {
        return this.computadoraDecorada.minDetalles()+" | "+this.graf.getFabricante()+" "+this.graf.getModelo();
    }
    public grafica getGraf() {
        return graf;
    }
    public void setGraf(grafica graf) {
        this.graf = graf;
    }
    
    
       @Override
    public procesador getProc() {
        return this.computadoraDecorada.getProc();
    }

    @Override
    public void setProc(procesador proc) {
        this.computadoraDecorada.setProc(proc);
    }

    @Override
    public disco getDisk() {
        return this.computadoraDecorada.getDisk();
    }

    @Override
    public void setDisk(disco disk) {
        this.computadoraDecorada.setDisk(disk);
    }

    @Override
    public ram getMram() {
        return this.computadoraDecorada.getMram();
    }

    @Override
    public void setMram(ram mram) {
        this.computadoraDecorada.setMram(mram);
    }

    @Override
    public String getTipo() {
        return this.computadoraDecorada.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        this.computadoraDecorada.setTipo(tipo);
    }
    
    
}
