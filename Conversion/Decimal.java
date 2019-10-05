
/**
 * Conversion de binario a decimal
 */
public class Decimal
{
     public static void main(){
    System.out.printf("El binario 110 a decimal es %.2f",con("110"));
    }
    
    public static double con(String s){
    if(s.length()-1 == 0) return 1*Integer.parseInt(s.valueOf(s.charAt(0)));
    return con(s.substring(1,s.length())) + (Integer.parseInt(s.valueOf(s.charAt(0)))*(int)(Math.pow(2,s.length()-1)));
    }
}
