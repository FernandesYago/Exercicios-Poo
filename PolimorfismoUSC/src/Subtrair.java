public class Subtrair  implements Calcular {
    double resultado;
    @Override
    public double calcular(double num1, double num2) {
        resultado = num1 - num2;
        return resultado;
    }
}
