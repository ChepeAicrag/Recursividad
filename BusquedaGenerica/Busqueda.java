

public class Busqueda
{
   /**Método del profesor*/ 
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
    /**Mi método */
    static int c = 0;
    public <T>String isThere2(T [] data, int first, int last, T buscar){     
     String s = "";
     if(first <= last){
        if(data [first].equals(buscar)){
            c++;
            s += "/" + first + " ";
           //if(first == last && !s.isEmpty())
            //return s.substring(0,s.length()-1);
            }     
       return s+= isThere2(data,first+1,last,buscar); 
    }else if(c<1 ){ 
       return "/-1";
     } 
     c=0;
    return s;
   } 
}
