import java.util.Scanner;                               // Incluimos la clase Scanner

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // Creamos el objeto Scanner para capturar el teclado

        System.out.println("¿Cuál es tu nota en Entornos de Desarrollo?");  // Mostramos texto y preguntamos la nota
        double EDE = sc.nextDouble();                                       // Asignamos el resultado dado a una variable

        System.out.println("¿Cuál es tu nota en Programación");
        double PRG = sc.nextDouble();

        System.out.println("¿Cuál es tu nota en Sistemas Informáticos");
        double SIN = sc.nextDouble();

        System.out.println("¿Cuál es tu nota en Bases de Datos?");
        double BD = sc.nextDouble();
        double promedio = (EDE + PRG + SIN + BD) / 4;             // Sumamos las 4 notas (variables) que nos han dado y las dividimos

        // Creamos un condicional, si la media es mayor o igual que 5, aparecen dos textos, de lo contrario (else) aparecen otros dos distintos
        if (promedio >= 5) {
            System.out.println("Vaya! tu nota media es: " + promedio);
            System.out.println("Felicidades, has aprobado.");
        } else {
            System.out.println("Mm... tu nota media es: " + promedio);
            System.out.println("Lo siento, has suspendido la evaluación.");
        }
    }
}