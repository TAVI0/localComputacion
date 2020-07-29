package Local;

public class desktopDecorator extends computadoraDecorador {
    
    public desktopDecorator(interfazComputadora computadoraDecorada) {
        super(computadoraDecorada);
    }
    

    @Override
    public String detalles() {
        return this.computadoraDecorada.detalles();
    }

    @Override
    public float sumPrecios() {
        return this.computadoraDecorada.sumPrecios();
    }

    @Override
    public String minDetalles() {
        return this.computadoraDecorada.minDetalles();
    }
    
    ///////////////////////////////////////////////////////////
    
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
