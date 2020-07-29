package Local;

public class computadora {

    private procesador proc;
    private disco disk;
    private ram mram;
    private String tipo;
    
    public computadora(procesador proc, disco disk, ram mram, String tipo) {
        this.proc = proc;
        this.disk = disk;
        this.mram = mram;
        this.tipo = tipo;
    }
    
    public procesador getProc() {
        return proc;
    }
    public void setProc(procesador proc) {
        this.proc = proc;
    }
    public disco getDisk() {
        return disk;
    }
    public void setDisk(disco disk) {
        this.disk = disk;
    }
    public ram getMram() {
        return mram;
    }
    public void setMram(ram mram) {
        this.mram = mram;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    

}
