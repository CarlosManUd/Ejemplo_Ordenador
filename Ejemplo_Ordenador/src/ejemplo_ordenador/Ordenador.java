package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */

    public class Ordenador {
    private Raton rat;
    private Pantalla pant;
    private CPU cpu;
    /**
     * Constructor por defecto, construye 3 objetos que la componen
     */
    public Ordenador(){
        rat=new Raton();
        pant=new Pantalla();
        cpu=new CPU();
    }
    /**
     * Constructor parametrizado que recibe como parametros 3 objetos
     * @param rat Objeto Raton
     * @param pant Objeto Pantalla
     * @param cpu Objeto CPU
     */
    public Ordenador(Raton rat, Pantalla pant, CPU cpu){
        this.rat=rat;
        this.pant=pant;
        this.cpu=cpu;
    }
    /**
     * Retorna un objeto tipo raton
     * @return atributo de la clase
     */
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