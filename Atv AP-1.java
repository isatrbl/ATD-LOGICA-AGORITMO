public class Main {
            public class TabuadaWhile {
                        public static void main(String[] args) {
            System.out.print("Digite um número maior que 1: ");
            int numero = scanner.nextInt();
            if (numero > 1) {
                int i = 1;  
                while (i <= 10) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                    i++;  
                }
            } else {
                System.out.println("O número precisa ser maior que 1.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, digite um número válido.");
        }
        
        scanner.close();
        