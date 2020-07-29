package Local;

import java.util.Date;




public class computadoraBase implements interfazComputadora {
    
    private computadora comp;

    public computadoraBase(computadora comp) {
        this.comp = comp;
    }
    

    @Override
    public String detalles() {
        return "Procesador: "+ comp.getProc().getModelo()
                + "\nDisco: "+ comp.getDisk().getMarca()+" "+comp.getDisk().getCapacidad()
                + "\nRam: "+ comp.getMram().getMarca()+" "+comp.getMram().getCapacidad()
                + "\nDesk/Lap: "+comp.getTipo();        
    }
    
    @Override
    public String minDetalles(){
        return comp.getTipo()
                +" | "+comp.getProc().getModelo()
                +" | Disk "+comp.getDisk().getCapacidad()
                +"GB | Ram "+comp.getMram().getCapacidad()+"GB ";
    }
    
    @Override
    public float sumPrecios(){
        float suma =0;
        
        //86400000 un dia
        suma+=checkFecha(this.comp.getDisk());
        suma+=checkFecha(this.comp.getMram());
        suma+=checkFecha(this.comp.getProc());               
        
        if ("desk".equals(this.comp.getTipo()))
            suma=suma-(suma*0.15f);
                    
        return suma;
                
    }
    
    public float checkFecha(componente c){
        Date hoy = new Date();
        Date unAño = new Date(hoy.getTime() - 86400000*365);

        if (c.getFecha_carga().getTime() < unAño.getTime()){
            
            return c.getPrecio()-(c.getPrecio()*0.20f);
        }
        return c.getPrecio();
    }

    @Override
    public procesador getProc() {
        return this.comp.getProc();
    }

    @Override
    public void setProc(procesador proc) {
        this.comp.setProc(proc);
    }

    @Override
    public disco getDisk() {
        return this.comp.getDisk();
    }

    @Override
    public void setDisk(disco disk) {
        this.comp.setDisk(disk);
    }

    @Override
    public ram getMram() {
        return this.comp.getMram();
    }

    @Override
    public void setMram(ram mram) {
        this.comp.setMram(mram);
    }

    @Override
    public String getTipo() {
        return this.comp.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        this.comp.setTipo(tipo);
    }
    
}
