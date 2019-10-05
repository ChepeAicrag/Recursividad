
/**
 * Contar las cifras de un numero de forma recursiva
 */
public class Cifras
{
   public static void main(){
        System.out.println("El numero -100 tiene "+ contar(-100) +" cifras");
        System.out.println("El numero -100 tiene "+ contar2(-100) +" cifras");
    }
    
   private static int contar(int n){    
    if(n != 0) return 1 + contar(n/10); //caso recursivo
    //El else es el caso base
    return 0; 
   }
    
    private static int contar2(int n){
    if(n == 0 ) return 0; //Caso base
    return 1 + contar2(n/10); //Caso recursivo
    }
}
