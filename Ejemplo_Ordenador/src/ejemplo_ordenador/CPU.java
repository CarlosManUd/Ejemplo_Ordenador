package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
public class CPU {
    private int velocidad;
    private int memoria;
    
    public CPU(){
        velocidad=memoria=0;
    }
    
    public CPU(int vel, int mem){
        velocidad=vel;
        memoria=mem;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    public int getMemoria(){
        return memoria;
    }
    public void setVelocidad(int vel){
        velocidad=vel;
    }
    public void setMemoria(int mem){
        memoria=mem;
    }
}
