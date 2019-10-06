
/**
 * Write a description of class Test03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test03
{
   public static void main(){ 
      Busqueda bus = new Busqueda();
      long [] arrayLargos = {1,2,3,4,5,1};
      Long [] arrayNew = new Long[arrayLargos.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Long(arrayLargos[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
      
      System.out.println("\nEl numero 9 está en " + bus.isThere2(arrayNew,0,arrayNew.length-1,9));
      System.out.println("\nEl numero 2 está en " + bus.isThere2(arrayNew,0,arrayNew.length-1,2));
      System.out.println("\nEl numero 1 está en " + bus.isThere2(arrayNew,0,arrayNew.length-1,1));
    }
}
