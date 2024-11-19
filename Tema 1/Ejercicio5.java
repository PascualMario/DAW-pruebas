import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una temperatura en grados centígrados");
        int temperatura = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el nombre de un mes");
        String mes = sc.nextLine();

        System.out.println("Introduce un día del mes en número");
        int dia = sc.nextInt();

        // (OPCIONAL) Creamos un condicional, si la temperatura es mayor o igual que 30, aparece un texto, de lo contrario (else) aparece otro
        if (temperatura >= 30) {
            System.out.println("El " + dia + " de " + mes + " hace la bochornosa temperatura de " + temperatura + " grados centígrados");
        } else {
            System.out.println("El " + dia + " de " + mes + " hace una temperatura de " + temperatura + " grados centígrados");
        }
    }
}