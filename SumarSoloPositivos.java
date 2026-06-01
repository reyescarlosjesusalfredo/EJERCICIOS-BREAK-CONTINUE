import java.util.Scanner;

public class SumarSoloPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int num = entrada.nextInt();
            if (num < 0) {
                System.out.println("Número negativo ignorado.");
                continue;
            }
            suma += num;
        }
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
}