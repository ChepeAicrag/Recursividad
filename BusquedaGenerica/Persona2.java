

public class  Persona2 implements Comparable<Persona2>
{
    public String nombre;
    public int edad;
    public Persona2 Clone;
    public Persona2(String nom, int ed){
        nombre = nom;
        edad = ed;
    }
    
    public String getNombre(){
    return new String(Clone.nombre); //Clone para regresar y modificar 
    }
    
    public int getEdad(){
    return Clone.edad; //Clone para regresar y modificar
    }
    
    public int compareTo(Persona2 o){
      if(nombre.compareTo(o.nombre)==0 && Integer.compare(edad,o.edad) == 0)
      return 0;
    return 1;  
    }
    public String toString(){
    return "Nombre: "+ nombre + " edad : " + edad;  //Nombre reales
    }
}
