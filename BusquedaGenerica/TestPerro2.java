
import java.util.*;
public class TestPerro2
{
    public static void main(){
    Perro2 p = new Perro2("manolo","buldog");
    Perro2 p2 = new Perro2("firulais","chihuahua");
    Perro2 p3 = new Perro2("chop","pitbull");
    Perro2 p4 = new Perro2("tila","pug");
    Perro2 [] perros = {p,p2,p3,p4};
    Arrays.sort(perros,0,perros.length-1);
    for(int i = 0; i < perros.length-1; i++)
    StdOut.println(perros[i].toString());
    StdOut.println("Buscando el perro chop \nUbicado en posición " + new Busqueda2().isThere2(perros,0,perros.length-1,new Perro2("chop","nose")));
    
   
    }
}
