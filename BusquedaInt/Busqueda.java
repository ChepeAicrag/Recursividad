
/**
 * Buscar en un arreglo de int, el valor dado, utilizando recursividad
 * Retornar las posiciones donde se encuentra el número
 */
public class Busqueda
{
   
   /** Mi método */
    
    public String isThere(int [] data, int first, int last, int buscar){
    String s = "";
     if(first <= last){
        if(data [first] == buscar){
            if(first == last){
                s += " "+ first;
            }else{
                s += ""+ first + ",";}
       }
       s += isThere(data,first+1,last,buscar);
    }else if( first>last+1 && s.isEmpty() ){ 
       s += " No se encontro ese valor";
    } 
    return s;
   }
}
