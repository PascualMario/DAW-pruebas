import java.util.Scanner;                                   // Incluimos la clase Scanner

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Creamos el objeto escaner para capturar el teclado

        System.out.println("¿Cuál es valor de a?");         // Mostramos texto y preguntamos el valor
        int a = sc.nextInt();                               // Asignamos el resultado a una variable

        System.out.println("¿Cuál es el valor de b");
        int b = sc.nextInt();

        System.out.println("¿Cuál es el valor de c");
        int c = sc.nextInt();

        System.out.println("¿Cuál es el valor x");
        int x = sc.nextInt();

        double y = a*Math.pow(x,2) + b*x + c;        // Operamos normalmente y utilizamos el metodo Math para elevar
        System.out.println("Resultado del polinomio de segundo grado: y = " + y);              // Mostramos el resultado
    }
}
