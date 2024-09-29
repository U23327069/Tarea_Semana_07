import java.util.Scanner;
public class Tarea1_semana7 {
    public static void main(String[] args) {
        //declaramos las variables
        Scanner lectura= new Scanner(System.in);
        double venta, totalVentas = 0;
        int dias = 0;
        do {
            System.out.print("Ingresa la venta del dia (0 para terminar): ");
            venta = lectura.nextDouble();
            if (venta != 0) {
                totalVentas += venta;
                dias++;
            }
        } while (venta != 0);
        if (dias > 0) {
            double promedioVentas = totalVentas / dias;
            System.out.println("Total de dias registrados: " + dias);
            System.out.println("Promedio de ventas: " + promedioVentas);
        } else {
            //Salida de datos
            System.out.println("No se registraron ventas.");
        }
    } 
}
