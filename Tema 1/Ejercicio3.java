import java.util.Scanner;                                           // Incluimos la clase Scanner

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                   // Creamos el objeto escaner para capturar el teclado

        System.out.println("Introduce una medida en milímetros");   // Mostramos texto y preguntamos la medida
        double mm = sc.nextDouble();                                // Asignamos el resultado dado a una variable

        System.out.println("Introduce una medida en centímetros");
        double cm = sc.nextDouble();

        System.out.println("Introduce una medida en metros");
        double m = sc.nextDouble();

        double sumacm = mm/10 + cm + m*100;                         // Mostramos operamos (pasamos entre medidas)
        System.out.println("El total son: " + sumacm + " cm");      // Mostramos el resultado con la variable
    }
}