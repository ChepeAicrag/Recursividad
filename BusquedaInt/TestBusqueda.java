
/**
 * Test de la clase Busqueda
 */
public class TestBusqueda
{
    public static void main(){
    int [] array = {1,4,5,6,1};
    Busqueda busqueda = new Busqueda();
    System.out.printf("El arreglo tiene 1 en la pos " + busqueda.isThere(array,0,array.length-1,1));
    } 
}
