
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int introduceNumero = 11;
        
        numeroPrimo(introduceNumero);

        inprimirNumerosPrimos();
    }

    private static void inprimirNumerosPrimos() {
        for (int x = 2; x < 1000; x++) {
            if (metodoPrimo(x)) {
                System.out.print(x + " ");
            }
        }
    }

    private static void numeroPrimo(int iN) {
        if (metodoPrimo(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }
    }

    public static boolean metodoPrimo(int dato) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != dato)) {
            if (dato % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}