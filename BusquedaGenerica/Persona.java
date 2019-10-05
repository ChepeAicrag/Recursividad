
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private int edad;
    private int edad_Clone;
    public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    edad_Clone = edad;
    }
    
    public String getNombre(){
    return new String(nombre);
    }
    
    public int getEdad(){
    return edad_Clone;
    }
    
    public String toString(){
    return "Nombre: "+ nombre + " edad : " + edad; 
    }
    
    public boolean equals(Object obj){
    Persona p = (Persona) obj;
    if(p.nombre.equals(nombre) && p.edad == edad)
    return true;
    return false;
    }
}
