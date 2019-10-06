

public class Test02
{
   public static void main(){
    Busqueda bus = new Busqueda();
      double [] arrayDobles = {1.9,8.5,7.9,6.2,8.5};
     Double [] arrayNew = new Double[arrayDobles.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Double(arrayDobles[i]);
      for(int i=0; i < arrayNew.length; i++)
         System.out.print(arrayNew[i]+" ");
       
      System.out.println("\n\nEl numero 1.9 está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,1.9));
      System.out.println("\nEl numero 2.5 está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,2.5));
      System.out.println("\nEl numero 1 está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,1));
      System.out.println("\nEl numero 6.2 está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,6.2));
      System.out.println("\nEl numero 8.5 está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,8.5));
      
    }
}
