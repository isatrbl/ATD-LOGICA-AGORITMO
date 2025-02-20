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