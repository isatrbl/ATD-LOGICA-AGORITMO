package app;

public class MainSomatoria {
	import java.util.Scanner;

	public class Somatorio {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int tamanho;
			double[] A = new double[tamanho];
	        int tamanho1 = 100;
	        double somatorio = 0;

	        int i = 0;
	        
	      System.out.println("Digite os 100 valores para o vetor A:");
	        while (i < tamanho1) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            A[i] = scanner.nextDouble();
	            somatorio += A[i];
	            i++;  
	        }
	        System.out.println("\nSomatória = " + somatorio);
	    }
	}
