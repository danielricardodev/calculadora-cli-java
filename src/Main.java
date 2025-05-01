import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto que irá ler os inputs do usuário

        while (true) {
            out.println("Digite 'sair' para encerrar ou pressione Enter para continuar:");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando a calculadora. Até logo!");
                break;
            }


        out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        scanner.nextLine();

        out.println("Digite o operador: ");
        char operador = scanner.next().charAt(0);

        out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        scanner.nextLine();

        double resultado;
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 == 0) {
                    out.println("Erro: divisão por zero!");
                    continue;
                }
            resultado = numero1 / numero2;
                break;
            default:
                out.println("Operador inválido.");
                continue;
        }


        out.println("O resultado da sua operação é: " + resultado);
    }
        scanner.close();
    }
}