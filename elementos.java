package tpa;
import java.util.Scanner;
public class elementos {
public static void main(String[] args) {
	int[] A = new int[20];
    int[] B = new int[20];
    int Par=0;
    
    for(int i=0,j=19;i<A.length;i++){
        A[i]=(int)Math.round(Math.random()*100);
        if(A[i]%2==0){
            B[i]=A[i];
            Par++;
        } else {
            B[i]=A[i];
            j--;
        }
        
    }
    
    for(int i=0;i<B.length;i++){
        if(i<Par){
            System.out.println("Números pares: " + B[i]);
        } else {
            System.out.println("Números impares: " + B[i]);
        
    }
}
}
}