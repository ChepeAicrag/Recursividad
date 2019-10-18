
/**
 * Write a description of class Perro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro2 implements Comparable<Perro2>
{
    private String nombre;
    private String raza;
    
    public Perro2(String nombre, String raza){
      this.nombre = nombre;
      this.raza = raza;
    }
    
    public String getNombre(){
    return new String(nombre);
    }
    
    public String getRaza(){
    return new String(raza);
    }
    
    public String toString(){
    return getNombre()+ "  " + getRaza();
    }
    
    public int compareTo(Perro2 p ){
    return this.nombre.compareTo(p.nombre);
    }
}
