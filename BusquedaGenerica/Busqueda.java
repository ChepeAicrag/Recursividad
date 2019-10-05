

public class Busqueda
{
   static boolean nota = false;
   public <T> void  isThere(T [] data, int first, int last, T buscar){
    if( first <= last ){
        if(data[first].equals( buscar)){
        System.out.println("\n" + buscar +" se encuentra en posición " + first);
        nota = true;
       }
        isThere(data,first+1,last,buscar);
    }else if(!nota){
        System.out.println("\n" + buscar + " no está");
    }
    nota = false;
    }
}
