
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;


public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese la identificacion del estudiante: ");
        String identificacion = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        
        System.out.println("Ingrese el costo de la asignatura: ");
        
        System.out.println("Ingrese numero de creditos del estudiante: ");
        int creditos = entrada.nextInt();
        
        System.out.println("Ingrese el costo de creditos: ");
        double costo = entrada.nextDouble();
        
        EstudiantePresencial estudiante = new EstudiantePresencial();
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(creditos);
        estudiante.establecerCostoCredito(costo);
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudiante);
        
    }
}
