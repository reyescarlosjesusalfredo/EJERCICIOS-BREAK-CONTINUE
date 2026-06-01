import java.util.Scanner;

public class FiltrarCaracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un texto mixto (letras y números): ");
        String texto = entrada.nextLine();
        
        System.out.print("Resultado sin números: ");
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isDigit(caracter)) {
                continue;
            }
            System.out.print(caracter);
        }
        System.out.println();
    }
}