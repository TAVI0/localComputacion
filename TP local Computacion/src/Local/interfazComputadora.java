package Local;



public interface interfazComputadora {
        
    public String detalles();
    public String minDetalles();
    public float sumPrecios();
    
    public procesador getProc();
    public void setProc(procesador proc);
    public disco getDisk();
    public void setDisk(disco disk);
    public ram getMram();
    public void setMram(ram mram);
    public String getTipo();
    public void setTipo(String tipo);
}
