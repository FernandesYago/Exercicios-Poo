class Caracteristicas extends Veiculo {

    private String corEx, corIN, combustivel, motor, opcionais;
    private int quilometragem, consumoMED, portas, passageiros;

    public Caracteristicas(String tipo, String corEx, String corIN, String combustivel, String motor, String opcionais,
                           int quilometragem, int consumoMED, int portas, int passageiros) {
        super(tipo);
        this.corEx = corEx;
        this.corIN = corIN;
        this.combustivel = combustivel;
        this.motor = motor;
        this.opcionais = opcionais;
        this.quilometragem = quilometragem;
        this.consumoMED = consumoMED;
        this.portas = portas;
        this.passageiros = passageiros;
    }

    public String getCorEx() {
        return corEx;
    }

    public void setCorEx(String corEx) {
        this.corEx = corEx;
    }

    public String getCorIN() {
        return corIN;
    }

    public void setCorIN(String corIN) {
        this.corIN = corIN;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getConsumoMED() {
        return consumoMED;
    }

    public void setConsumoMED(int consumoMED) {
        this.consumoMED = consumoMED;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "Caracteristicas{" +
                "corEx='" + corEx + '\'' +
                ", corIN='" + corIN + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", motor='" + motor + '\'' +
                ", opcionais='" + opcionais + '\'' +
                ", quilometragem=" + quilometragem +
                ", consumoMED=" + consumoMED +
                ", portas=" + portas +
                ", passageiros=" + passageiros +
                '}';
    }
}
