
import java.util.Scanner;



/**
 *
 * @author anamiramontes
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner nums = new Scanner(System.in);
       int x=0,y=0,z=0,k=0;
       boolean repetir;
       do{
          repetir=false;
       
       try{
           System.out.println("Introduzca el primer valor: ");
           x=nums.nextInt();
           
           System.out.println("Introduzca el segundo valor: ");
           y=nums.nextInt();
           
           System.out.println("Introduzca el tercer valor: ");
           z=nums.nextInt();
           
           System.out.println("Introduzca el cuarto valor: ");
           k=nums.nextInt();
           
         // Se crea la variable e para atrapar el error   
       }catch(inputMismatchException e ){
           //SE COMCATENA EL METODO "TO.STRING" A LA VARIABLE ASIGNADA EN CATCH PARA OBTENER EL VALOR DE ESTA
           System.err.println("Valor NO Valido"+e.toString());
       nums.nextLine();
       repetir=true;
       }
    }while(repetir);
        System.out.println("Valor introducido: "+x);
        System.out.println("Valor introducido: "+y);
        System.out.println("Valor introducido: "+z);
        System.out.println("Valor introducido: "+k);
       } 
}
    
 
