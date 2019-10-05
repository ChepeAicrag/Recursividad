
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
      long [] arrayEnteros = {1,2,3,4,5,1};
      Long [] arrayNew = new Long[arrayEnteros.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Long(arrayEnteros[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
      
      bus.isThere(arrayNew,0,arrayNew.length-1,9);
      bus.isThere(arrayNew,0,arrayNew.length-1,2);
      bus.isThere(arrayNew,0,arrayNew.length-1,1);
    }
}
