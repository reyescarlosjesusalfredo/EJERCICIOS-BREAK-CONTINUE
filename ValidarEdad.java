import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        while (true) {
            System.out.print("Ingresa tu edad (0-120): ");
            edad = entrada.nextInt();
            
            if (edad < 0 || edad > 120) {
                System.out.println("Edad no válida de acuerdo al rango.");
                continue;
            }
            break;
        }
        System.out.println("Edad guardada correctamente: " + edad);
    }
}