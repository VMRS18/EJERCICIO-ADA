package ada.jijijiji;
import java.util.Scanner;
import java.util.Random;
public class ADAJIJIJIJI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random=new Random();
        System.out.print("Ingrese N: ");
        int N=scanner.nextInt();
        int [][]BRANDON=new int [N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int xd=random.nextInt(10);
                BRANDON[i][j]=xd;
            }
        }
        System.out.println("Matriz original es:");
            for (int i = 0; i < N; i++) {
                System.out.print("|");
                for (int j = 0; j < N; j++) {
                    System.out.print(BRANDON[i][j]+" ");
                }
                System.out.println("|");
            }
        System.out.print("Ingrese valor k del anillo:");
        int k=scanner.nextInt();
        if (k==(N/2)+1) {
            int sum=0;
            sum=BRANDON[k-1][k-1];
            System.out.println("La suma es: "+sum);
        }else{
            if (k<=N/2) {
                int extremo=0;
                int sum=0;
                for (int i = (k-1); i < N-(k-1); i++) {
                    sum+=BRANDON[i][k-1];
                    sum+=BRANDON[i][N-(k-1)-1];
                    
                    sum+=BRANDON[k-1][i];
                    sum+=BRANDON[N-(k-1)-1][i];
                    if (i==k-1 || i==N-(k-1)-1  ) {
                        extremo+=BRANDON[i][k-1];
                        extremo+=BRANDON[i][N-(k-1)-1];
                    }
                }
            sum=sum-extremo;
            System.out.println("La suma del anilo "+k+" es: "+sum);
            }
        }
    }
    
}
