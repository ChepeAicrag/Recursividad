
/**
 * Write a description of class TestPerro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPerro
{
    public static void main(){
     Perro p = new Perro("Sheko","chihuahua");
     Perro p2 = new Perro("Melvin","buldog");
     Perro[] perros = {p,p2};
     for(int i=0; i< perros.length; i++)
     System.out.println(perros[i]+ " ");
     Busqueda bus = new Busqueda();
     bus.isThere(perros,0,perros.length-1,p);
    }
}
