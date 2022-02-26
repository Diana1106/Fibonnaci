
package seriedefibonacci;

import java.util.Scanner;

/**
 *
 * @author norah
 */
public class SerieDeFibonacci {

    Scanner a = new Scanner(System.in);
    int tm = Integer.parseInt(a.nextLine());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe un tamaño:");
        SerieDeFibonacci f1 = new SerieDeFibonacci();
        f1.mos();
    }

    int tamaño = tm;

    public void mos() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println(fibonacci(i));
        }
    }

    int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

}
