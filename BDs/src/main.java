
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
         
        String boleta, nombre, apellidos, programa_academico, telefono; 
        
        Scanner scan  =  new Scanner(System.in);
        
        portada();
        System.out.print("\n\nBoleta: ");
        boleta = scan.nextLine();
        
        System.out.print("\nNombre(s): ");
        nombre = scan.nextLine();
        
        System.out.print("\nApellidos: ");
        apellidos = scan.nextLine();
        
        System.out.print("\nTelefono: ");
        telefono = scan.nextLine();
        
        System.out.print("\nPrograma Academico: ");
        programa_academico = scan.nextLine();
        
        System.out.println("\n\n ** Datos del Alumno ** \n Boleta "+ boleta +"\n Nombre: "+nombre +" " + apellidos+"\n Telefono: "+telefono+"\n Programa Academico: "+ programa_academico);
          
    }
    
    static void portada()
    {        
        System.out.println("***************************************");
        System.out.println("\n\t UPIICSA - IPN \n\n Rico Carlos Gerardo Msiael \n\t     3CM40 \n Programacion Orientada a Objetos");
        System.out.println("***************************************");
    }
    
}
