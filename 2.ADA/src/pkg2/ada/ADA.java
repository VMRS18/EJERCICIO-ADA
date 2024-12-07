package pkg2.ada;
import java.util.Random;
import java.util.Scanner;
public class ADA {
    public static void main(String[] args) {
        //Ejercicio 2: Rotación de una matriz 90°
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese las dimensiones de la matriz: ");
        int N=scanner.nextInt();
        int [][] A=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int xd=random.nextInt(10);
                A[i][j]=xd;
            }
        }
        System.out.println("La matriz original es:");
        for (int i = 0; i < N; i++) {
            System.out.print("| ");
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("|");
        }
        int [][]B=new int [N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[j][i]=A[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=B[i][(N-1)-j];
            }
        }
        System.out.println("La matriz girada 90º es:");
        for (int i = 0; i < N; i++) {
            System.out.print("| ");
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("|");
        }
    }
    
}
