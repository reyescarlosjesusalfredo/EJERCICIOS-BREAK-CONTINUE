public class PrimerMultiploSiete {
    public static void main(String[] args) {
        int inicio = 20;
        int fin = 50;
        
        for (int i = inicio; i <= fin; i++) {
            if (i % 7 == 0) {
                System.out.println("El primer múltiplo de 7 entre 20 y 50 es: " + i);
                break;
            }
        }
    }
}