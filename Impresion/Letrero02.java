
/**
 * Una solución diferente a la priemra
 */
public class Letrero02
{
   public static void main(){
        System.out.println("Impresion de la palabra Oaxaca \n"+ Letrero("Oaxaca"));
        System.out.println("\nImpresion inversa de la palabra Oaxaca: "+ Letrero2("Oaxaca"));        
    }
    
    public static String Letrero(String s){
    if(s.length()-1 == 0 ) return "" +s.charAt(0);
    return s.charAt(0) + "\n" + Letrero(s.substring(1));
    }
    
    public static String Letrero2(String s){
    if(s.length()-1 == 0 ) return  "\n" + s.charAt(0);
    return Letrero2(s.substring(1)) + "\n" + s.charAt(0) ;
    }
}
