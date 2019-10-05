
/**
 * Buscar en un arreglo de int, el valor dado, utilizando recursividad
 * Retornar las posiciones donde se encuentra el número
 */
public class Busqueda
{   
    static int c = 0;
    public String isThere(int [] data, int first, int last, int buscar){     
     String s = "";
     if(first <= last){
        if(data [first] == buscar){
            c++;
            s += first + ",";
            if(first == last && !s.isEmpty())
              return s.substring(0,s.length()-1);
       }
       return  s += isThere(data,first+1,last,buscar);
     }else if(c<1 ){ 
       return " No se encontro ese valor";
     } 
     c=0;
    return s;
   }
}
