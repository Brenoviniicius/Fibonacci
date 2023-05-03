import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean pertence = false;

        int anterior = 0;
        int atual = 1;
        int proximo;

        if (numero == anterior || numero == atual) {
            pertence = true;
        } else {
            while (atual <= numero) {
                proximo = anterior + atual;
                if (proximo == numero) {
                    pertence = true;
                    break;
                }
                anterior = atual;
                atual = proximo;
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
