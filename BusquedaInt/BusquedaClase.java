
/**
 * MétodoRealizado en clase
   */
public class BusquedaClase
{
   static boolean nota = false;
   public void isThere2(int [] data, int first, int last, int buscar){
    if( first <= last ){
        if(data[first] == buscar){
        System.out.println("El valor " + buscar +"se encuentra en " + first);
        nota = true;
       }
        isThere2(data,first+1,last,buscar);
    }else if(!nota){
        System.out.print("-1");
        nota = false;
    }
    }
}
