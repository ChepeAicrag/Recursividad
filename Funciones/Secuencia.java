
/**
 * Write a description of class Secuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secuencia
{
    public static void main(){
    System.out.println("La secuencia 1  de 5 es " + fun(5));
    System.out.println("La secuencia 2 de 3 es " + fun2(3));
    System.out.println("La secuencia 3 de 5 es " + fun3(5));
    }
    
    private static int fun(int n){
    //if(n == 0) return 5;
    /**Tambien funcion con */
    if(n == 1 ) 
        return 10;
    return fun(n-1) + 5;
    }
    
    private static int fun2(int n){
    if(n == 1) 
        return 3;
    return 2 * fun2(n-1); 
    }
    
    /**Funcion de fibonacci*/
    private static int fun3(int n){  
    if(n == 0) 
        return 0;
    if(n == 1) 
        return 1;
    return fun3(n-1) + fun3(n-2);
    }
}
