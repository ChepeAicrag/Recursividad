
/**
 * Calcular el cociente de la division de forma recursiva
 */
public class Cociente
{
    private static int cociente(int a, int b){
        if(a<b)
        return 0;
        return 1 + cociente(a-b,b);
    }
    public static void main(){
        System.out.println("El cociente de 10 y 3\n " + cociente(10,3));
    }
}
