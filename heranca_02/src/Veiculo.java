public class Veiculo {
    private String tipo;
    private String placa, marca, modelo, chassi, procedencia;

    public Veiculo(String tipo) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }
}
