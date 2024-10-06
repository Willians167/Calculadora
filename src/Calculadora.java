import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir opções de operação
        System.out.println("Selecione a operação: ");
        System.out.println("1 para Somar");
        System.out.println("2 para Subtrair");
        System.out.println("3 para Multiplicar");
        System.out.println("4 para Dividir");
        System.out.print("Aguardando... ");

        // Ler a operação selecionada
        int operacao = scanner.nextInt();

        // Solicitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        // Solicitar o segundo número
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        // Processar a operação
        int res = 0;
        switch (operacao) {
            case 1:
                res = somar(a, b);
                break;
            case 2:
                res = subtrair(a, b);
                break;
            case 3:
                res = multiplicar(a, b);
                break;
            case 4:
                res = dividir(a, b);
                break;
            default:
                System.out.println("Opção inválida: " + operacao);
                return;
        }

        // Exibir o resultado
        System.out.println("Resultado: " + res);
    }


    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Divisão por zero não é permitida.");
            return 0; 
        }
    }
}
