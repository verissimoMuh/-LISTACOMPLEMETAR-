package tpa;
import java.util.Scanner;

public class NumPrimo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam = 11;

        int[] A = new int[tam];
        
       for (int i = 0; i < tam; i++) {
            A[i] = (int) Math.pow(2, i);
        }

       
      
      System.out.println("resultados:");
       
      for (int i = 0; i < tam; i++) {
            System.out.println(+ i +" = "+ A[i]);
        }
	}
}
