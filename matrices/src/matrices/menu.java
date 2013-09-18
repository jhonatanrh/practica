
package matrices;

/**
 *
 * @author Estudiante
 */
public class menu {
  public static void main(String[] args) {
       
      Matrices ob1,ob2,ob3;
       
       ob1= new Matrices();
       ob2= new Matrices();
       ob3= new Matrices();
       
       ob1.cargar();
       ob2.cargar();
       ob3.mul(ob1,ob2);
       
       ob1.imprimir();
       ob2.imprimir();
       ob3.imprimir();
       
       
    }  
}
