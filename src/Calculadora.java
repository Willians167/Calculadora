import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Selecione a operação: ");
        System.out.println("1 para Somar");
        System.out.println("2 para Subtrair");
        System.out.println("3 para Multiplicar");
        System.out.println("4 para Dividir");
        System.out.print("Aguardando... ");

        int operacao = scanner.nextInt();


        if (operacao >= 1 && operacao < 5) {
            switch (operacao){
                case 1 :
                    System.out.println("vamos somar!");
                    break;
                case 2:
                    System.out.println("vamos subtrair!");
                    break;
                case 3 :
                    System.out.println("vamos multiplicar!");
                    break;
                case 4 :
                    System.out.println("vamos somar!");
                    break;
                default:
                    System.out.println("Tente novamente!");
                    break;
            }
            System.out.print("Digite o primeiro número: ");
            int a = scanner.nextInt();


            System.out.print("Digite o segundo número: ");
            int b = scanner.nextInt();



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


            System.out.println("Resultado: " + res);
        } else {
            System.out.println("Opção inválida!");
        }
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
