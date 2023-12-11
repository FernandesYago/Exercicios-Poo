public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Carro");


        Informacoes informacoesCarro = new Informacoes("Automóvel", "ABC1234", "Toyota", "Corolla", "123456789",
                "Nacional", 2022, 2022, 123456789, 1000, 150, 180, 50);


        Caracteristicas caracteristicasCarro = new Caracteristicas("Automóvel", "Vermelho", "Preto",
                "Gasolina", "Motor 2.0", "Ar Condicionado, Vidros Elétricos", 5000, 12, 4, 5);


        System.out.println("Tipo de Veículo: " + veiculo.getTipo());
        System.out.println("Informações do Veículo: \n" + informacoesCarro);
        System.out.println("Características do Veículo: \n" + caracteristicasCarro);
    }
}
