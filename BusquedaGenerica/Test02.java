

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
       
      bus.isThere(arrayNew,0,arrayNew.length-1,1.9);
      bus.isThere(arrayNew,0,arrayNew.length-1,2.5);
      bus.isThere(arrayNew,0,arrayNew.length-1,1);
      bus.isThere(arrayNew,0,arrayNew.length-1,6.2);
      bus.isThere(arrayNew,0,arrayNew.length-1,8.5);
      
    }
}
