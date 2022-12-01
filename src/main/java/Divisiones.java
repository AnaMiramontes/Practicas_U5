
/**
 *
 * @author anamiramontes
 */
public class Divisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=15;
        double y=0; //Se divide entre 0
        
        try{
        System.out.println("El resultado de la division de: "+x+" entre "+y+" es: "+division(x,y));
        // Se crea mi_exception para guardar el error
    }catch(Exception mi_exception){
            System.out.println("Uste' ha intentado dividir entre cero");
            System.out.println("El objeto exception lanzado es: "+mi_exception.toString());
    }
    }
    public static double division(double dividendo, double divisor){
        return(dividendo/divisor);
     }
    
}
