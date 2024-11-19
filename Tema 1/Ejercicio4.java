import java.util.Scanner;                                     // Incluimos la clase Scanner

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // Creamos el objeto Scanner para capturar el teclado

        System.out.println("Introduzca el número de hormigas capturadas");   // Mostramos texto y preguntamos cantidades
        int hormigas = sc.nextInt();                                         // Asignamos el resultado dado a una variable

        System.out.println("Introduzca el número de arañas capturadas");
        int arañas = sc.nextInt();

        System.out.println("Introduzca el número de cochinillas capturadas");
        int cochinillas = sc.nextInt();

        int patas = hormigas*6 + arañas*8 + cochinillas*14;              // Multiplicamos variable * patas y sumamos
        System.out.println("El número de patas es: " + patas);           // Mostramos el resultado
    }
}

