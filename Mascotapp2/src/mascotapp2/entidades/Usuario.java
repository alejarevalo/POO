
package mascotapp2.entidades;

import java.util.Date;


public class Usuario {
    
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    
    public Usuario(){
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }
    
    
}
