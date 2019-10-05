
/**
 * Calcular la raiz cuadrada de un numero con recursividad
 * Utilizando el método babilonico
 */
public class RaizCuadrada
{
    public static double RaizCuadrada(int A,int n){
    if(n == 0) 
        return A;
    return 0.5 * (A/RaizCuadrada(A,n-1) + RaizCuadrada(A,n-1));
    }
    
    public static void main(){
        System.out.println("La raiz cuadrada de 15 es " + RaizCuadrada(52,2));        
    }
}
