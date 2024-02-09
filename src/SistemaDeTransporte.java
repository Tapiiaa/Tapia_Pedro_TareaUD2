import java.util.Scanner;

public class SistemaDeTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la distancia recorrida
        System.out.println("Introduzca la distancia recorrida (km): ");
        double distancia = scanner.nextDouble();

        // Solicitar al usuario el tiempo tomado
        System.out.println("Introduzca el tiempo tomado (horas): ");
        double tiempo = scanner.nextDouble();

        // Calcular la velocidad media
        double velocidadMedia = calcularVelocidadMedia(distancia, tiempo);

        // Mostrar el resultado
        System.out.println("La velocidad media es: " + velocidadMedia + " km/h");
    }

    public static double calcularVelocidadMedia(double distancia, double tiempo) {
        return distancia / tiempo;
    }
}

