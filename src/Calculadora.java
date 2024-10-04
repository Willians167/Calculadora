public class Calculadora {


        public static void main(String[] args) {

            int operacao = 1;

            int res = switch (operacao){
                case 1 ->  res = Somar(5,5);

                case 2 ->  res = Subtrair(23,3);
                case 3 ->  res = Mulplicar(5,5);
                case 4 ->  res = Dividir(100,5);
                default ->  throw new IllegalArgumentException(" opção inválida "+operacao);
            };

            System.out.println(res);
        }

        public static  int Somar(int a , int b){

            return a + b;
        };
        public static  int Subtrair(int a , int b){

            return a - b;
        };

        public static  int Mulplicar(int a , int b){

            return a * b;
        };

        public static  int Dividir(int a , int b){

            return a / b;
        };


}
