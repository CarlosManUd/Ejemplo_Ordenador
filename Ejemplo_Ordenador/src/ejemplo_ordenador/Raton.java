package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
    public class Raton {
    private String tipo;

    public Raton(){
        
    }

    public Raton(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}