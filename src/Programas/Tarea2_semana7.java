import java.util.Scanner;
public class Tarea2_semana7 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //ingresamos las variables
                int asistencia, presentes = 0, ausentes = 0, totalEstudiantes = 0;
        do {
            System.out.print("Ingrese 1 si el estudiante asistio, 0 si estuvo ausente (9 para terminar): ");
            asistencia = lectura.nextInt();
            if (asistencia == 1) {
                presentes++;
            } else if (asistencia == 0) {
                ausentes++;
            }
            if (asistencia == 1 || asistencia == 0) {
                totalEstudiantes++;
            }
        } while (asistencia != 9);
        //Mostrar los resultados
        System.out.println("Total de estudiantes registrados: " + totalEstudiantes);
        System.out.println("Estudiantes presentes: " + presentes);
        System.out.println("Estudiantes ausentes: " + ausentes);
    }    
}
