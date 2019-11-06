package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */

    public class Ordenador {
    private Raton rat;
    private Pantalla pant;
    private CPU cpu;

    public Ordenador(){
        rat=new Raton();
        pant=new Pantalla();
        cpu=new CPU();
    }

    public Ordenador(Raton rat, Pantalla pant, CPU cpu){
        this.rat=rat;
        this.pant=pant;
        this.cpu=cpu;
    }
    public Raton getRaton(){
        return rat;
    }
    public Pantalla getPantalla(){
        return pant;
    }
    public CPU getCPU(){
        return cpu;
    }
    public void setRaton(Raton rat){
        this.rat=rat;
    }
    public void setPantalla(Pantalla pant){
        this.pant=pant;
    }
    public void setCPU(CPU cpu){
        this.cpu=cpu;
    }
}
