import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double resultado = 0;
        char op;

        System.out.print("ESCOLHA UMA OPERACAO (+ - * /): ");
        op = scanner.next().charAt(0);

        while (true) {

            System.out.print("Digite um numero ou '=' para terminar: ");
            String entrada = scanner.next();

            if (entrada.equals("=")) {
                break;
            }

            double num = Double.parseDouble(entrada);

            if (op == '+') {
                resultado += num;
            } else if (op == '-') {
                resultado -= num;
            } else if (op == '*') {
                if (resultado == 0) resultado = 1;
                resultado *= num;
            } else if (op == '/') {
                if (resultado == 0) resultado = num;
                else resultado /= num;
            }
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}