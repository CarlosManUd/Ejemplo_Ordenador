package ejemplo_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
public class Ejemplo_Ordenador {

    
    public static void main(String[] args) {
         Ordenador ord;
        ord=new Ordenador(new Raton("cable"),new Pantalla("Samsung", 15.7f), new CPU(3,2048));
        System.out.println("Ordenador:\nCPU: " + ord.getCPU().getVelocidad() + " GHz");
        System.out.println("Memoria: " + ord.getCPU().getMemoria() + " MB");
        System.out.println("Raton: " + ord.getRaton().getTipo());
        System.out.println("Pantalla:");
        System.out.println("Marca: " + ord.getPantalla().getMarca());
        System.out.println("Pulgadas: " + ord.getPantalla().getPulgadas());
    }
    
}