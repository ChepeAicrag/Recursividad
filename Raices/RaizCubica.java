
/**
 * Write a description of class RaizCubica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaizCubica
{
    public static double RaizCubica(int A,int n){
    if(n == 0) 
        return A;
    return 0.5 * (A/Math.pow(RaizCubica(A,n-1),2) + RaizCubica(A,n-1));
    }    
    
    public static void main(){
        System.out.println("La raiz cuadrada de 8 es " + RaizCubica(8,1));
    }
}
