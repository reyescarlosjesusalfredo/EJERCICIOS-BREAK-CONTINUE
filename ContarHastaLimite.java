import java.util.Scanner;

public class ContarHastaLimite {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaMax = 50;
        int acumulado = 0;
        int contador = 0;
        
        System.out.println("Ingresa números de forma sucesiva. El programa para si la suma supera " + sumaMax);
        while (true) {
            System.out.print("Ingresa un número: ");
            int num = entrada.nextInt();
            acumulado += num;
            if (acumulado > sumaMax) {
                System.out.println("Límite superado. Suma final: " + acumulado);
                break;
            }
            contador++;
        }
        System.out.println("Ingresaste con éxito " + contador + " números antes del límite.");
    }
}