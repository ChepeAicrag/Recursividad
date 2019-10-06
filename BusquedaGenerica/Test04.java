
/**
 * Write a description of class Test04 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test04
{
    public static void main(){ 
      Busqueda bus = new Busqueda();
      char [] arrayCaracteres = {'a','b','c','d'};
      Character [] arrayNew = new Character[arrayCaracteres.length];
      for(int i =0;i < arrayNew.length; i++  )
        arrayNew[i] = new Character(arrayCaracteres[i]);
      for(int i=0; i < arrayNew.length; i++)
        System.out.print(arrayNew[i]+" ");
      
      System.out.println("\nEl caracter 'a' está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,'a'));
      System.out.println("\nEl numero 'f' está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,'f'));
      System.out.println("\nEl numero 'c' está en la posición " + bus.isThere2(arrayNew,0,arrayNew.length-1,'c'));
    }
}
