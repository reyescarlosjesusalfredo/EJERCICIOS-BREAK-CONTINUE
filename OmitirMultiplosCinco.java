public class OmitirMultiplosCinco {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 50 omitiendo los múltiplos de 5:");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}