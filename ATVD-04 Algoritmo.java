import java.util.Scanner;
public class OrdemContraria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[50];
        
        System.out.println("Digite 50 números inteiros:");
        int i = 0; 
        while (i < 50) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        System.out.println("\nOrdem inversa dos números digitados:");
        int j = 49;
        while (j >= 0) {
            System.out.print(numeros[j]);
            if (j > 0) {
                System.out.print(", ");
            }
            j--; 
        }
    }
}



//correto da ide

package app;

import java.util.Scanner;

public class MainOrdemcontraria{
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				int tamanho = 50;
				int[] A = new int[tamanho];
 System.out.println("Digite 50 valores inteiros:");
				int i = 0;
				while (i < A.length) {
				    System.out.print("Digite o valor " + (i + 1) + ": ");
				    A[i] = scanner.nextInt();
				    i++;
				    }
				System.out.println("\nOrdem contrária:");
				int j = tamanho - 1;
				while (j >= 0) {
				    System.out.print(A[j]);
				    if (j > 0) {
				        System.out.print(", ");
				    }
				    j--;
				}
			}
	    }
	}
