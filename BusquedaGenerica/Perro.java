

public class Perro 
{
    final private String nombre;
    final private String raza;
    
    public Perro(String nombre, String raza){
      this.nombre = nombre;
      this.raza = raza;
    }
    
    public Perro(Perro p){
       nombre = p.nombre;
       raza = p.raza;
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
}
