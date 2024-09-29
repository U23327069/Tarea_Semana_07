import java.util.Scanner;
public class Tarea1_semana7 {
    public static void main(String[] args) {
        //declaramos las variables
        Scanner sc = new Scanner(System.in);
        int cantidadEstudiantes = 0, aprobados = 0;
        double sumaNotas = 0;
        double nota;
        do {
            System.out.print("Ingrese la nota del estudiante (0 para terminar): ");
            nota = sc.nextDouble();
            if (nota != 0) {
                sumaNotas += nota;
                cantidadEstudiantes++;
                if (nota >= 11) {
                    aprobados++;
                }
            }
        } while (nota != 0);
        if (cantidadEstudiantes > 0) {
            double promedio = sumaNotas / cantidadEstudiantes;
            System.out.println("Promedio de las notas: " + promedio);
            System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
        } else {
            System.out.println("No se ingresaron notas.");
        }        
    }    
}
