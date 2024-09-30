import java.util.Scanner;
public class Tarea3_semana7 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //insertamos las variables
                double tiempo, mejorTiempo = Double.MAX_VALUE;
        int corredores = 0;
        do {
            System.out.print("Ingrese el tiempo del corredor (0 para terminar): ");
            tiempo = lectura.nextDouble();
            if (tiempo != 0) {
                corredores++;
                if (tiempo < mejorTiempo) {
                    mejorTiempo = tiempo;
                }
            }
        } while (tiempo != 0);
        if (corredores > 0) {
            //Salida de datos finales
            System.out.println("Número de corredores registrados: " + corredores);
            System.out.println("Mejor tiempo registrado: " + mejorTiempo + " segundos");
        } else {
            System.out.println("No se registraron tiempos.");
            //Fin programa
        }
    }    
}
