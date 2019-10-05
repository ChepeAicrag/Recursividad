
/**
 * Impresion de un String con Recursvidad de forma normal e inversa 
 */
public class Letrero
{
    public static void main(){
        System.out.println("\nDE FORMA NORMAL\n " + Impresion("Huatulco"));
        System.out.println("\nDE FORMA INVERSA" + Impresion2("Huatulco"));   
    }
    
    public static String Impresion(String s){
        if(s.isEmpty()) return "";
        return s.charAt(0) + "\n " + Impresion(s.substring(1));
    }
    
    public static String Impresion2(String s){
        if(s.isEmpty()) return "";
        return Impresion2(s.substring(1)) + "\n " + s.charAt(0);
    }
}
