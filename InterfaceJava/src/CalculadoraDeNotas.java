public class CalculadoraDeNotas implements CalcularNotas {

    @Override
    public String notaMaxima() {
        return "Parabéns, você atingiu todos os indicadores de avaliação com excelência.";
    }

    @Override
    public String notaMedia() {
        return "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação.";
    }

    @Override
    public String notaMinima() {
        return "Você não atingiu o mínimo esperado para aprovação.";
    }

    @Override
    public String obterConceito(double nota) {
        if (nota >= 8.0 && nota <= 10.0) {
            return notaMaxima();
        } else if (nota >= 7.0 && nota < 8.0) {
            return notaMedia();
        } else if (nota >= 1.0 && nota < 7.0) {
            return notaMinima();
        } else {
            return "Nota fora dos limites válidos!";
        }
    }
}
