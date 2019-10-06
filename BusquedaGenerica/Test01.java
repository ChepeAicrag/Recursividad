

import java.util.*;
public class Test01
{
    public static void main(){
      Busqueda bus = new Busqueda();
      int [] arrayEnteros = {1,2,3,4,5,1};
      Integer [] arrayNew = new Integer[arrayEnteros.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Integer(arrayEnteros[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
      /*  
      bus.isThere(arrayNew,0,arrayNew.length-1,9);
      bus.isThere(arrayNew,0,arrayNew.length-1,2);
      bus.isThere(arrayNew,0,arrayNew.length-1,1);
      */
      System.out.println("\nEl numero 1 se encuentra en la posicion " + bus.isThere2(arrayNew,0,arrayNew.length-1,1));
      System.out.println("El numero 2 se encuentra en la posicion " + bus.isThere2(arrayNew,0,arrayNew.length-1,2));
      System.out.println("El numero 9 se encuentra en la posicion " + bus.isThere2(arrayNew,0,arrayNew.length-1,9));
    
    }
    
}
