
package mascotapp2;

import java.util.Scanner;
import mascotapp2.entidades.Mascota;


public class Mascotapp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //aqui llamo al constructor que tiene parametros nombre y tipo :
        Mascota m1 = new Mascota("Quiposo", sc.next()); // en tipo puse el metodo scanner para que lo lea
        
        

        
        System.out.println(m1.nombre+" "+m1.edad+" "+m1.tipo+" "+m1.color);// muestra 0 en edad y null color porque no se le asigno ningun valor.
    
    }// main end
    
}// class end
