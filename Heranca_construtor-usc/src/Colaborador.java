public class Colaborador extends  Associados {
    private String cargo;

    public Colaborador(int id, int numero, int cep, int telefone, int numeroAssociado, String nome, String logradouro, String bairro, String cidade, String uf, String cpf_cnpj, String analista_de_ti) {
        super(id, numero, cep, telefone, numeroAssociado, nome, logradouro, bairro, cidade, uf, cpf_cnpj);
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

