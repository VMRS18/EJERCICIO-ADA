package pkg5.ada;
import java.util.Scanner;
public class ADA {
    public static void main(String[] args) {
        //Ejercicio 5: Verificar simetría de una matriz
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese las dimensiones de la matriz: ");
        int N=scanner.nextInt();
        int [][] A=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese valor de fila "+(i+1)+", columna "+(j+1)+": ");
                A[i][j]=scanner.nextInt();
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
        
        int [][]B=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[j][i]=A[i][j];
            }
        }
        int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j]==B[i][j]) {
                    sum+=1;
                }
            }
        }
        if (sum==(N*N)) {
            System.out.println("La matriz SI es simetrica");
        }else{
            System.out.println("La matriz NO es simetrica");
        }
    }
    
}
