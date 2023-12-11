 class Informacoes extends Veiculo {
    private String placa, marca, modelo, chassi, procedencia;

    private int ano, fabricacao, renavam, capKg, altura, largura, profundidade;

    public Informacoes(String tipo, String placa, String marca, String modelo, String chassi, String procedencia, int ano, int fabricacao, int renavam, int capKg, int altura, int largura, int profundidade) {
        super(tipo);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.procedencia = procedencia;
        this.ano = ano;
        this.fabricacao = fabricacao;
        this.renavam = renavam;
        this.capKg = capKg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public int getCapKg() {
        return capKg;
    }

    public void setCapKg(int capKg) {
        this.capKg = capKg;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Informacoes{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", ano=" + ano +
                ", fabricacao=" + fabricacao +
                ", renavam=" + renavam +
                ", capKg=" + capKg +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
