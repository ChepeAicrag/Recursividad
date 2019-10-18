
public class Busqueda2 
{
     /**Mi método */
    static int c = 0;
    public <T extends Comparable >String isThere2(T [] data, int first, int last, T buscar){     
     String s = "";
     if(first <= last){
        if(data [first].compareTo(buscar) == 0){
            c++;
            s += "/" + first + " ";
        }     
       return s+= isThere2(data,first+1,last,buscar); 
      }else if(c<1 ){ 
          return "/-1";
     } 
     c=0;
    return s;
   } 
}
