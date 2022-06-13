/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import herencia1.EstudianteDistancia;

public class Ejecutor {
    public static void main(String[] args){
       EstudianteDistancia estudiante = new EstudianteDistancia();
       estudiante.establecerNombresEstudiante("Joseph");
       estudiante.establecerApellidoEstudiante("Martinez");
       estudiante.establecerIdentificacionEstudiante("1105117392");
       estudiante.establecerEdadEstudiante(19);
       estudiante.establecerCostoAsignatura(30);
       estudiante.establecerNumeroAsginaturas(5);
       estudiante.calcularMatriculaDistancia();
       /*
       System.out.printf("%s - (%.2f)\n", 
               estudiante.obtenerApellidoEstudiante(),
               estudiante.obtenerMatriculaDistancia());
       */
       System.out.printf("%s\n", estudiante);
    }
}
