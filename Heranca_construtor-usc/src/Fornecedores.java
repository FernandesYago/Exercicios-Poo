public class Fornecedores extends Associados {
    private String fantasia;

    public Fornecedores(int id, int numero, int cep, int telefone, int numeroAssociado, String nome, String logradouro,
                        String bairro, String cidade, String uf, String cpf_cnpj, String fantasia) {
        super(id, numero, cep, telefone, numeroAssociado, nome, logradouro, bairro, cidade, uf, cpf_cnpj);
        this.fantasia = fantasia;
    }
    public String getFantasia() {
        return fantasia;
    }
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
}
