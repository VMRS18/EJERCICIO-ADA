package pkg3.ada;
import java.util.Random;
import java.util.Scanner;
public class ADA {
    public static void main(String[] args) {
        //Ejercicio 3: Perímetro de la matriz
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
        int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==0 || i==(N-1)) {
                    sum+=A[i][j];
                }
                
            }
        }
        for (int i = 1; i < N-1; i++) {
            for (int j = 0; j < N; j++) {
                if (j==0 || j==N-1) {
                    sum+=A[i][j];
                }
            }
        }
        
        System.out.println("El perimetro es: "+sum);
    }
    
}
