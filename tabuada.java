package tpa;
import java.util.Scanner;
public class tabuada{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam = 5;
        
        int[] A = new int[tam];


        
        System.out.println("digite 5 n�meros:");
        for (int i = 0; i<tam; i++) {
            System.out.print("N�mero "+ (i+1) +": ");
            A[i] = in.nextInt();
            
         
            
            System.out.println("Tabuada do n�mero � igual a: " + A[i] + ":");
                for (int j = 0; j <= 10; j++) {
                    int resultado = A[i] * j;
                    System.out.println(A[i] + " x " + j + " = " + resultado);
                }
        }
        in.close();
    }
}
