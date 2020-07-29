package Local;



public abstract class computadoraDecorador implements interfazComputadora {
    
    public interfazComputadora computadoraDecorada;
    
    public computadoraDecorador (interfazComputadora computadoraDecorada){
        this.computadoraDecorada=computadoraDecorada;
    }
    

    @Override
    public String detalles(){
        return this.computadoraDecorada.detalles();
    }
    
}
