
/**
 * Suma los primeros N numeros positivos con recursividad
 */
public class Suma
{
    public static void main(){
    System.out.println("La suma de los 10 primeros numeros es " + suma(10));
    System.out.println("La suma de los 3 primeros numeros es " + suma(3));
    System.out.println("La suma de los 25 primeros numeros es " + suma(25));
    System.out.println("La suma de los 50 primeros numeros es " + suma(50));
    System.out.println("La suma de los 75 primeros numeros es " + suma(75));
    }
    
    public static int suma(int n){
        if(n == 1) return 1;
        return n + suma(n-1);
    } 
}
