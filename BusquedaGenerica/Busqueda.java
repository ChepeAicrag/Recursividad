
/**
 * Write a description of class Busqueda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Busqueda
{
    private static <T> String isThere(T[] data, int first, int last, T buscar){
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
   
   public static void main(){
    
    }
}
