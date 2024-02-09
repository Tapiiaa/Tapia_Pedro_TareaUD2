import java.util.Scanner;

public class SistemaDeTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la distancia recorrida en kilométros
        System.out.println("Introduzca la distancia recorrida (km): ");
        double distancia = scanner.nextDouble();

        // Pedimmos el tiempo del viaje en horas
        System.out.println("Introduzca el tiempo tomado (horas): ");
        double tiempo = scanner.nextDouble();

        // Calculamos la velocidad media
        double velocidadMedia = distancia/tiempo;
        // Mostrar el resultado
        System.out.println("La velocidad media es: " + velocidadMedia + " km/h");
    }
    }
