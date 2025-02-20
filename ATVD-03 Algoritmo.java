import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite três números separados por espaço: ");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(" ");
        int num1 = Integer.parseInt(numerosStr[0]);
        int num2 = Integer.parseInt(numerosStr[1]);
        int num3 = Integer.parseInt(numerosStr[2]);
        scanner.close();
        int menor, meio, maior;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }
        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);
    }
}
