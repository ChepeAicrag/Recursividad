

public class Largos
{
   public static void main(){ 
   long [] arrayLargos = {1L,2L,3L,4L,5L,1L};
      Long [] arrayNew = new Long[arrayLargos.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Long(arrayLargos[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
    StdOut.println("\nEl numero 9 está en " + new Busqueda2().isThere2(arrayNew,0,arrayNew.length-1,9L));
    }
}    
