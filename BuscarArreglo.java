import java.util.Scanner;

public class BuscarArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {12, 45, 78, 34, 89, 23, 56};
        System.out.print("Ingresa el valor a buscar: ");
        int objetivo = entrada.nextInt();
        boolean encontrado = false;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                System.out.println("Elemento encontrado en el índice: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
    }
}