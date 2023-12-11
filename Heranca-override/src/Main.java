import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(comprimento, largura);
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
    }
}
