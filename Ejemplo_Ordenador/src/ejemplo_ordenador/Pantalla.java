package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    public Pantalla(){
        
    }
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
    }
    public String getMarca(){
        return marca;
    }
    public float getPulgadas(){
        return pulgadas;
    }
    public void setMarca(String mar){
        marca=mar;
    }
    public void setPulgadas(float pulg){
        pulgadas=pulg;
    }
}
