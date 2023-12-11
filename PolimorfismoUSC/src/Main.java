    public class Main {
        public static void main(String[] args) {


            Soma s1 = new Soma();
                double resultadoSoma = s1.calcular(10, 20);

            Subtrair t1 = new Subtrair();
                double resultadoSubtrair = t1.calcular(10,20);

            Multiplicar m1 = new Multiplicar();
            double resultadoMultiplicar = m1.calcular(10, 20);

            Dividir d1 = new Dividir();
            double resultadoDividir = d1.calcular(10, 20);

            System.out.println("O resultado da operação de soma é de:" + resultadoSoma);
            System.out.println("O resultado da operação de subtrair é de:" + resultadoSubtrair);
            System.out.println("O resultado da operação de Multiplicação é de:" + resultadoMultiplicar);
            System.out.println("O resultado da operação de divisão é de:" + resultadoDividir);

        }
    }