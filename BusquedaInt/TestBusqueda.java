
/**
 * Test de la clase Busqueda
 */
public class TestBusqueda
{
    public static void main(){
    int [] array = {10,1,1,1,1,10};
    Busqueda busqueda = new Busqueda();
    System.out.println("El arreglo tiene 10 en la pos \n" + busqueda.isThere(array,0,array.length-1,10));
    System.out.println("El arreglo tiene 1 en la pos \n" + busqueda.isThere(array,0,array.length-1,1));
    System.out.println("El arreglo tiene 15 en la pos \n" + busqueda.isThere(array,0,array.length-1,15));
    
   } 
}
