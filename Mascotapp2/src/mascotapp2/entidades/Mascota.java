
package mascotapp2.entidades;


public class Mascota {
    private String nombre;
    private String tipo;
    private String raza;
    private String color;
    private boolean cola;
    private int edad;

    public Mascota(){
    }
    
    public Mascota(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        
        if (tipo.equals("Perro")||tipo.equals("Gato")||tipo.equals("Loro")){
            this.tipo = tipo;
        }
    }

    public Mascota(String nombre, String tipo, String raza, String color, boolean cola, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.cola = cola;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        if (nombre.length() > 0){
            this.nombre = nombre;
        }
    }
    
    
}
