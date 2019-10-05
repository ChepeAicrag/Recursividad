
/**
 * Write a description of class TestPersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPersona
{
    public static void main(){
    Persona p1 = new Persona("Juan",10);
    Persona p2 = new Persona("Melvin",17);
    Persona p3 = new Persona("Sheko",18);
    Persona [] personas = {p1,p2,p3};
    for(int i=0 ; i < personas.length-1; i++)
    System.out.println(personas[i]);
    Busqueda bus = new Busqueda();
    bus.isThere(personas,0,personas.length-1,new Persona("Juan",10));
    
}
}
