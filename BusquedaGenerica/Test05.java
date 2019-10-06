
public class Test05
{
    public static void main(){
    Busqueda bus = new Busqueda();
      boolean [] arrayBooleanos = {true,false,true,false};
      Boolean [] arrayNew = new Boolean[arrayBooleanos.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Boolean(arrayBooleanos[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
      System.out.println("\n\nEl boolaeno true está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,true));  
      System.out.println("\nEl boolaeno false está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,false));  
    }
}
