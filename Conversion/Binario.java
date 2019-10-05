
/**
 * Conversion de decimal a binario
 */
public class Binario
{
    public static String convert(int N){
        if(N == 1) return "1";
       return convert(N/2)+(N%2); 
    }
    
    public static void main(){
       System.out.println("El numero 10 en binario es " + convert(10));
    }
}
