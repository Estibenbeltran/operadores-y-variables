/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variejer1;

/**
 * Este programaa permite saber cual es el porcentaje de alumnos
 * del salon 301 que son menores de edad, teniedno en total 240 alumno, 
 * donde 35 de ellos son los menores de edad
 * @version 1.0
 * @author Dairo Estiben Beltran Martinez
 * 
 */
/**
 * clase que contiene los atributos
 */
class Estudiantes{
    int estudiantes = 240;//cantidad de estudiantes
    int menores = 35;//cantidad de estudiantes menores de edad
    float por;//porcentaje de estudiantes
}
/**
 * 
 * clase principal
 */
public class Variejer1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes estudi = new Estudiantes();//declaracion del objeto estudiante
        estudi.por = (estudi.menores * 100)/ estudi.estudiantes;//operacion para saber el pporcentaje de estudiantes menores de edad
        System.out.println("La cantidad de estudinates en el salon 301 es "+estudi.estudiantes);//muestra de datos
        System.out.println("la cantidad de menores de edad en el salon 301 es "+estudi.menores);//muestra de datos
        System.out.println("El porcentaje de menores de edad en el salon 301 es "+estudi.por);//muestra de datos
        
    }
    
}
