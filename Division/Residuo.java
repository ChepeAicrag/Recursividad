
/**
 * Calcular el residuo de la division de forma recursiva
 */
public class Residuo
{
    private static int residuo(int a, int b){
        if(a<b) 
        return a;
        return residuo(a-b,b);
    }
}
