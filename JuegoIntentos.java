import java.util.Scanner;

public class JuegoIntentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String secreta = "abril20";
        int intentosMax = 3;
        
        for (int i = 1; i <= intentosMax; i++) {
            System.out.print("Intento " + i + " - Digita la clave: ");
            String entradaUsuario = entrada.nextLine();
            
            if (entradaUsuario.equals(secreta)) {
                System.out.println("¡Clave Correcta! Bienvenido al sistema.");
                break;
            } else {
                if (i == intentosMax) {
                    System.out.println("Se agotaron los 3 intentos. Cuenta bloqueada.");
                } else {
                    System.out.println("Incorrecto. Intenta de nuevo.");
                }
            }
        }
    }
}