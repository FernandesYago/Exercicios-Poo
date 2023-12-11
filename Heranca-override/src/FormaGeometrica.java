class FormaGeometrica {
    protected double comprimento;
    protected double largura;

    public FormaGeometrica(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }
}

class Retangulo extends FormaGeometrica {
    public Retangulo(double comprimento, double largura) {
        super(comprimento, largura);
    }
    public double calcularArea() {
        return comprimento * largura;
    }
}
