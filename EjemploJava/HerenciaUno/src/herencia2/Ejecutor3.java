/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
        En el método *main*, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine();
            cedula = entrada.nextLine()
            edad = nextINt();
        
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        System.out.println("Elija una opcion del Estudiante: ");
        System.out.println("Presencial  [1]");
        System.out.println("Distancia   [2]");
        int opcion = entrada.nextInt();

        if (opcion != 1 && opcion != 2) {
            System.out.println("ERROR OPCION NO VALIDA!!");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombre del estudiante: ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese apellido del estudiante: ");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese identifiacion del estudiante: ");
            String identificacion = entrada.nextLine();

            System.out.println("Ingrese edad del estudiante: ");
            int edad = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el número de créditos: ");
                int numCreditos = entrada.nextInt();
                System.out.println("Ingrese el costo de los créditos: ");
                double costoCredito = entrada.nextDouble();
                EstudiantePresencial estudiantePresencial = new EstudiantePresencial();
                estudiantePresencial.establecerNombresEstudiante(nombre);
                estudiantePresencial.establecerApellidoEstudiante(apellido);
                estudiantePresencial.establecerIdentificacionEstudiante(identificacion);
                estudiantePresencial.establecerEdadEstudiante(edad);
                estudiantePresencial.establecerNumeroCreditos(numCreditos);
                estudiantePresencial.establecerCostoCredito(costoCredito);
                estudiantePresencial.calcularMatriculaPresencial();
                System.out.printf("%s\n", estudiantePresencial);

            } else {
                if (opcion == 2) {
                    System.out.println("Ingrese número de asignaturas: ");
                    int numAsignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo de las asignaturas: ");
                    double costoAsignaturas = entrada.nextDouble();
                    EstudianteDistancia estudianteDistancia = new EstudianteDistancia();
                    estudianteDistancia.establecerNombresEstudiante(nombre);
                    estudianteDistancia.establecerApellidoEstudiante(apellido);
                    estudianteDistancia.establecerIdentificacionEstudiante(identificacion);
                    estudianteDistancia.establecerEdadEstudiante(edad);
                    estudianteDistancia.establecerNumeroAsginaturas(numAsignaturas);
                    estudianteDistancia.establecerCostoAsignatura(costoAsignaturas);
                    estudianteDistancia.calcularMatriculaDistancia();
                    System.out.printf("%s\n", estudianteDistancia);
                }
            }
        }
    }
}