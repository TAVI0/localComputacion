package Local;


public class laptopDecorator extends computadoraDecorador {
    private String marca;
    private String modelo;
    private float pantalla;
    
    public laptopDecorator(interfazComputadora computadoraDecorada, String marca, String modelo, float pantalla) {
        super(computadoraDecorada);
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
    }
    
    @Override
    public String detalles() {
        return this.computadoraDecorada.detalles()
                +"\nMarca: "+getMarca()
                +"\nModelo: "+getModelo()
                +"\nPantalla: "+getPantalla();
    }
    
    @Override
    public String minDetalles() {
        return this.computadoraDecorada.minDetalles();
    }
    
    @Override
    public float sumPrecios() {
        return this.computadoraDecorada.sumPrecios();
    }
        
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPantalla() {
        return pantalla;
    }
    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
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