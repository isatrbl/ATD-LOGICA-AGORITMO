import java.util.Scanner;
public class EntradaDeDados {
                        public class MaiorNumero {            
    public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       

                int[] numeros = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    numeros[i] = scanner.nextInt();
                }
        int maior = num1;
        for (int i= 1 ; i < numeros.length; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }

        
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }