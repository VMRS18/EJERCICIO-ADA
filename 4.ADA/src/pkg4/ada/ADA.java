package pkg4.ada;
import java.util.Random;
import java.util.Scanner;
public class ADA {
    public static void main(String[] args) {
        //Ejercicio 4: Transpuesta de una matriz
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int N=scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int M=scanner.nextInt();
        int [][] A=new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int xd=random.nextInt(10);
                A[i][j]=xd;
            }
        }
        System.out.println("La matriz original es:");
        for (int i = 0; i < N; i++) {
            System.out.print("| ");
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("|");
        }
        
        int [][]B=new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[j][i]=A[i][j];
            }
        }
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < M; i++) {
            System.out.print("| ");
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("|");
        }
    }
    
}
