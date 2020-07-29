package Local;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sistema {

    private final stockComponentes sc;
    private final stockComputadoras spc;
    private final stockPerifericos sp;

    public sistema() {
        sc = new stockComponentes();
        sp = new stockPerifericos();
        spc = new stockComputadoras();
    }

    void arrancar() {
        Date hoy = new Date();
        Date unAño = new Date(hoy.getTime() - 86400000*365);
        
        disco di = new disco("nada", 100, unAño, "ambos", "toshiba", "ssd", 1500);
        ram ra = new ram("anda", 100, unAño, "ambos", "asd", "ddr3", 333, 1200);
        procesador pr = new procesador("asd", 100, unAño, "ambos", "intel", "i5", 333);
        grafica gr = new grafica("yoqse", 100, unAño, "ambos", "nvidia", "gtx", 20);
        
        
        computadora comp = new computadora(pr, di, ra, "desk");
        computadoraBase comb=new computadoraBase(comp);
        graficaDecorator compug = new graficaDecorator(comb, gr);

        sc.agregar(di);
        sc.agregar(ra);
        sc.agregar(pr);
        sc.agregar(gr);
        spc.agregar(compug);
        
        String opc;
        do {
            opc = entradaSalida.leerString("Que desea realizar?\n"
                    + "1) Añadir componente\n"
                    + "2) Añadir perifericos\n"
                    + "3) Armar pc\n"
                    + "4) Listado componentes\n"
                    + "5) Vender PC\n"
                    + "6) Vender Componente\n"
                    + "0) SALIR\n");
            switch (opc) {
                case "1":
                    añadirComponente();
                    break;
                case "2":
                    añadirPeriferico();
                    break;
                case "3":
                    añadirComputadora();
                    break;
                case "4":
                    entradaSalida.mostrarString(sc.obtenerListadoComponente());
                    break;
                case "5":
                    venderPc();
                    break;
                case "6":
                    venderComponente();
                    
            }
        } while (!("0".equals(opc)));
    }

    void añadirComponente() {
        Date hoy = new Date();
        String opc;
        opc = entradaSalida.leerString("Que componente desea agregar?\n"
                + "1) Disco\n"
                + "2) Procesador\n"
                + "3) Ram\n"
                + "4) Tarjeta Grafica\n"
                + "5) SALIR\n");
        switch (opc) {
            case "1":
                añadirDisc(hoy);
                break;
            case "2":
                añadirProcesador(hoy);
                break;
            case "3":
                añadirRam(hoy);
                break;
            case "4":
                añadirGrafica(hoy);
                break;
        }
    }
    
    componente setComponentesDefault (componente c){
        Date hoy = new Date();
        
        int opc;
        c.setDescrip(entradaSalida.leerString(c.detalles() + "\n\nIngrese descripcion"));
        c.setPrecio(entradaSalida.leerInt(c.detalles() + "\n\nIngrese precio"));
        c.setFecha_carga(hoy);
        
        do{
            opc = entradaSalida.leerInt(c.detalles() + "\n\n [1]desktop  [2]laptop  [3]ambos");
        }while(opc !=1 && opc!=2 && opc!=3);
        
        switch(opc){
            case 1:
                c.setClasif("desk");
                break;
            case 2:
                c.setClasif("lap");
                break;
            case 3:
                c.setClasif("ambos");
        }
        return c;
    }
    
    void añadirDisc(Date hoy) {
        String opc;
        disco c = new disco("", 0, hoy , "", "", "", 0);

        do {
            c = (disco) setComponentesDefault(c);
            c.setMarca(entradaSalida.leerString(c.detalles() + "\n\nIngrese marca"));
            c.setModelo(entradaSalida.leerString(c.detalles() + "\n\nIngrese modelo"));
            c.setCapacidad(entradaSalida.leerInt(c.detalles() + "\n\nIngrese capacidad"));

            opc = entradaSalida.leerString(c.detalles() + "\n\nTODOS LOS DATOS SON CORRECTOS? [0]No [1]Si");
        } while (opc.equals("0"));

        sc.agregar(c);
        entradaSalida.mostrarString("Se ha agregado el/la " + c.getTipo() + " correctamente");
    }

    void añadirRam(Date hoy) {
        String opc;
        ram c = new ram("", 0, hoy, "", "", "", 0, 0);
        do {
            c = (ram) setComponentesDefault(c);
            c.setMarca(entradaSalida.leerString(c.detalles() + "\n\nIngrese marca"));
            c.setTecnologia(entradaSalida.leerString(c.detalles() + "\n\nIngrese teconologia"));
            c.setFrecuencia(entradaSalida.leerInt(c.detalles() + "\n\nIngrese frecuencia"));
            c.setCapacidad(entradaSalida.leerInt(c.detalles() + "\n\nIngrese capacidad"));

            opc = entradaSalida.leerString(c.detalles() + "\n\nTODOS LOS DATOS SON CORRECTOS? [0]No [1]Si");
        } while (opc.equals("0"));

        sc.agregar(c);
        entradaSalida.mostrarString("Se ha agregado el/la " + c.getTipo() + " correctamente");
    }

    void añadirProcesador(Date hoy) {
        String opc;
        procesador c = new procesador("", 0, hoy, "", "", "", 0);
        do {
            c = (procesador) setComponentesDefault(c);
            c.setFabricante(entradaSalida.leerString(c.detalles() + "\n\nIngrese fabricante"));
            c.setModelo(entradaSalida.leerString(c.detalles() + "\n\nIngrese modelo"));
            c.setFrecuencia(entradaSalida.leerInt(c.detalles() + "\n\nIngrese frecuencia"));

            opc = entradaSalida.leerString(c.detalles() + "\n\nTODOS LOS DATOS SON CORRECTOS? [0]No [1]Si");
        } while (opc.equals("0"));

        sc.agregar(c);
        entradaSalida.mostrarString("Se ha agregado el/la " + c.getTipo() + " correctamente");
    }

    void añadirGrafica(Date hoy) {
        String opc;
        grafica c = new grafica("", 0, hoy, "", "", "", 0);
        do {
            c = (grafica) setComponentesDefault(c);
            c.setFabricante(entradaSalida.leerString(c.detalles() + "\n\nIngrese fabricante"));
            c.setModelo(entradaSalida.leerString(c.detalles() + "\n\nIngrese modelo"));
            c.setCapacidad(entradaSalida.leerInt(c.detalles() + "\n\nIngrese capacidad"));

            opc = entradaSalida.leerString(c.detalles() + "\n\nTODOS LOS DATOS SON CORRECTOS? [0]No [1]Si");
        } while (opc.equals("0"));

        sc.agregar(c);
        entradaSalida.mostrarString("Se ha agregado el/la " + c.getTipo() + " correctamente");
    }

    void añadirPeriferico() {
        String opc;
        periferico p = new periferico("", 0, "");
        do {
            p.setNombre(entradaSalida.leerString(p.detalles() + "\n\nIngrese nombre"));
            p.setPrecio(entradaSalida.leerInt(p.detalles() + "\n\nIngrese precio"));
            p.setTipo(entradaSalida.leerString(p.detalles() + "\n\nIngrese tipo"));

            opc = entradaSalida.leerString(p.detalles() + "\n\nTODOS LOS DATOS SON CORRECTOS? [0]No [1]Si");
        } while (opc.equals("0"));

        sp.agregar(p);
        entradaSalida.mostrarString("Se ha agregado el/la " + p.getTipo() + " correctamente");

    }

    void añadirComputadora() {
        String opc = entradaSalida.leerString("Que desea realizar? \n"
                + "1) Desktop.\n"
                + "2) Laptop");

        if (opc.equals("1")) {
            computadora comp = ensambladorComp("desk");
            computadoraBase compu = new computadoraBase(comp);
            
            interfazComputadora compu1= agregarTarjeta(compu);                        
            interfazComputadora desktop = new desktopDecorator(compu1);
            
            entradaSalida.mostrarString(desktop.detalles());
            
            spc.agregar(desktop);
        }
        
        if (opc.equals("2")) {
            computadora comp = ensambladorComp("lap");
            computadoraBase compu = new computadoraBase(comp);

            interfazComputadora compu1= agregarTarjeta(compu);  
            var laptop = new laptopDecorator(compu1, "", "", 0);
                        
            laptop.setMarca(entradaSalida.leerString(laptop.detalles() + "\n\n Ingrese marca"));
            laptop.setModelo(entradaSalida.leerString(laptop.detalles() + "\n\n Ingrese modelo"));
            laptop.setPantalla(entradaSalida.leerInt(laptop.detalles() + "\n\n Ingrese pulgadas de pantalla"));
   
            spc.agregar(laptop);
        }
    }

    computadora ensambladorComp(String clasif) {
        computadora comp = new computadora(null, null, null, clasif);
        
        comp.setDisk((disco)seleccionaObjetos("Disco", clasif));
        comp.setMram((ram) seleccionaObjetos("Ram", clasif));
        comp.setProc((procesador) seleccionaObjetos("Procesador", clasif));
        comp.setTipo(clasif);
                        
        return comp;
    }

    componente seleccionaObjetos(String tipo, String clasif) {
        List<componente> comp = new ArrayList();
        componente encontrado;

        for (componente p : sc.getComponentes()) {
            if ((p.getClasif().equals(clasif) || p.getClasif().equals("ambos")) && p.getTipo().equals(tipo)) {
                comp.add(p);
            }
        }     
        String lista = "";
        for (int i = 0; i < comp.size(); i++) {
            if (comp.get(i).getTipo().equals(tipo)) {
                lista += "[" + i + "] " + comp.get(i).minDetalles() + "\n";
            }
        }
        int opc = entradaSalida.leerInt(lista + "\n\n seleccione componente");       
        encontrado = comp.get(opc);
        sc.getComponentes().remove(encontrado);
        entradaSalida.mostrarString(encontrado.detalles() + "\n seleccionado");
        return encontrado;
    }

    interfazComputadora agregarTarjeta(interfazComputadora compu){
        int opc2 = entradaSalida.leerInt("Incluye Tarjeta Grafica? \n\n [0]No [1]Si");
            if (opc2==1){
            graficaDecorator compu1 = new graficaDecorator(compu, (grafica)seleccionaObjetos("Grafica", "desk"));
            interfazComputadora compu2 = (interfazComputadora) compu1;
            
            return compu2;
            }
            else return compu;
    }
    
    void venderPc(){
        if(!spc.getComputadoras().isEmpty()){
            int opc = entradaSalida.leerInt(spc.listaPC()+"\n\n Seleccione PC");
            int confirm = entradaSalida.leerInt(spc.getComputadoras().get(opc).detalles()+"\n\n Vender esta PC? [0]No [1]Si");
        if(confirm==0){
            venderPc();
        }else{
            spc.getComputadoras().remove(opc);
            entradaSalida.mostrarString("La PC a sido vendida y retirada del catalogo");
        }
        
    }else entradaSalida.mostrarString("No hay PC en stock");
    }
    
    void venderComponente(){
        if(!spc.getComputadoras().isEmpty()){
            int select = 0;
            int opc = entradaSalida.leerInt(spc.listaPC()+"\n\nSeleccione PC");
            int confirm = entradaSalida.leerInt(spc.getComputadoras().get(opc).detalles()+"\n\nVerder piezas de esta PC [0]No [1]Si");
            
            if(confirm==1){
                interfazComputadora comp = spc.getComputadoras().get(opc);
                
                do{
                    int pieza = entradaSalida.leerInt(comp.detalles() +"\n\n Que pieza desea vender\n[1]Procesador [2]Disco [3]Ram [4]Grafica");    
                    
                    switch(pieza){
                        case 1:
                            select = entradaSalida.leerInt(comp.getProc().detalles()+"Vender componetne?\n[0]No [1]Si");
                            if(select==1){
                            sc.agregar(comp.getDisk());
                            sc.agregar(comp.getMram());
                            try{
                                graficaDecorator compgraf = (graficaDecorator)spc.getComputadoras().get(opc);
                                sc.agregar(compgraf.getGraf());
                            }catch(Exception e){
                                
                            }
                            entradaSalida.mostrarString("Se han devuelto los componentes restantes al stock\n\nPrecio a pagar: "+comp.getProc().getPrecio());
                            spc.getComputadoras().remove(comp);
                            select = 0;
                            
                            }else venderComponente();
                            
                            break;
                        case 2:
                            select = entradaSalida.leerInt(comp.getDisk().detalles()+"[0]No [1]Si");
                            if(select==1){
                            sc.agregar(comp.getProc());
                            sc.agregar(comp.getMram());
                            try{
                                graficaDecorator compgraf = (graficaDecorator)spc.getComputadoras().get(opc);
                                sc.agregar(compgraf.getGraf());
                            }catch(Exception e){
                                
                            }
                            entradaSalida.mostrarString("Se han devuelto los componentes restantes al stock\n\nPrecio a pagar: "+comp.getDisk().getPrecio());
                            spc.getComputadoras().remove(comp);
                            select = 0;
                            
                            }else venderComponente();
                            break;
                        case 3:
                            select = entradaSalida.leerInt(comp.getMram().detalles()+"[0]No [1]Si");
                            if(select==1){
                            sc.agregar(comp.getDisk());
                            sc.agregar(comp.getProc());
                            try{
                                graficaDecorator compgraf = (graficaDecorator)spc.getComputadoras().get(opc);
                                sc.agregar(compgraf.getGraf());
                            }catch(Exception e){
                                
                            }
                            entradaSalida.mostrarString("Se han devuelto los componentes restantes al stock\n\nPrecio a pagar: "+comp.getProc().getPrecio());
                            spc.getComputadoras().remove(comp);
                            select = 0;
                            
                            }else venderComponente();
                            break;
                            
                        case 4:
                            
                            try{
                                graficaDecorator compgraf = (graficaDecorator)spc.getComputadoras().get(opc);
                                select = entradaSalida.leerInt(compgraf.getGraf().detalles()+"[0]No [1]Si");
                                if(select==1){
                            sc.agregar(comp.getDisk());
                            sc.agregar(comp.getProc());
                            sc.agregar(comp.getMram());
                            
                            entradaSalida.mostrarString("Se han devuelto los componentes restantes al stock\n\nPrecio a pagar: "+compgraf.getProc().getPrecio());
                            spc.getComputadoras().remove(comp);
                            select = 0;
                            
                            }else venderComponente();
                                break;
                                
                            }catch(Exception e){
                                entradaSalida.mostrarString("Esta PC no tiene Tarjeta Grafica");
                                select = 0;
                                break;
                            }
                    }
                }while(select!=0);
                
            }else venderComponente();
        }else entradaSalida.mostrarString("No hay PC en stock");  
    }
    
    
}
