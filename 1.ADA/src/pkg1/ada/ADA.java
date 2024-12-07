package pkg1.ada;
import java.util.Random;
import java.util.Scanner;

public class ADA {

    public static void main(String[] args) {
        //Ejercicio 1: Suma de la diagonal principal y secundaria
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las dimensiones de la matriz: ");
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int xd = random.nextInt(10);
                A[i][j] = xd;
            }
        }
        System.out.println("La matriz original es:");
        for (int i = 0; i < N; i++) {
            System.out.print("| ");
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("|");
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    sum += A[i][j];
                    sum += A[i][(N - 1) - i];
                }
            }
        }
        if (N % 2 != 0) {
            sum -= A[(N / 2)][(N / 2)];
        }
        System.out.println("La suma de las diagonales es: " + sum);
    }

}
