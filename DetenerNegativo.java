import java.util.Scanner;

public class DetenerNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa números secuencialmente:");
        
        while (true) {
            System.out.print("Número: ");
            int num = entrada.nextInt();
            if (num < 0) {
                System.out.println("Se detectó un número negativo. Terminando bucle.");
                break;
            }
        }
    }
}