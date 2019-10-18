
import java.util.*;
public class TestPersona2
{
    public static void main(){
    Persona2 per1 = new Persona2("Juan",10);
    Persona2 per2 = new Persona2("Kevin",18);
    Persona2 per3 = new Persona2("zergio",19);
    Persona2 per4 = new Persona2("Melvin",20);
    Persona2 per5 = new Persona2("Lorenzo",20);
    Persona2[] personas = {per1,per2,per3,per4,per5};
    StdOut.println("Desordenando el arreglo por nombre es \n");
    for(int i = 0; i < personas.length-1; i++)
    StdOut.print(personas[i].toString()+" \n");
    StdOut.println("\nOrdenando el arreglo por nombre es\n");
    Arrays.sort(personas,0,personas.length-1);
    for(int i = 0; i < personas.length-1; i++)
    StdOut.print(personas[i].toString()+" \n");
    StdOut.println("\nBuscando a Zergio en el arreglo\n Se encuentra en la posición " + new Busqueda2().isThere2(
                             personas,0,personas.length-1,new Persona2("zergio",19)));
   }
}
