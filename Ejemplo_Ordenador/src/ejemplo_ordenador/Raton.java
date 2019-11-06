package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
    public class Raton {
    private String tipo;
    /**
     * Constructor por defecto, inicializa el atributo tipo en null
     */
    public Raton(){
        
    }
    /**
     * Constructor parametrizado que recibe un string
     * @param tipo Variable de tipo String para inicializar el atributo de la clase
     */
    public Raton(String tipo){
        this.tipo=tipo;
    }
    /**
     * retorna un string indicando el tipo de raton
     * @return tipo String
     */
    public String getTipo(){
        return tipo;
    }
    /**
     * recibe un string y modifica el atributo tipo
     * @param tipo String
     */
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}