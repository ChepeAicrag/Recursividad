
/**
 * Write a description of class Integer01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enteros
{
    public static void main(){
     int [] arrayEnteros = {1,2,3,4,5,1};
     Integer [] arrayNew = new Integer[arrayEnteros.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Integer(arrayEnteros[i]);
      for(int i=0; i < arrayNew.length; i++)
        StdOut.print(arrayNew[i]+" ");
     StdOut.println("\nEl numero 1 se encuentra en la posicion " + new Busqueda2().isThere2(arrayNew,0,arrayNew.length-1,1));
    }
}
