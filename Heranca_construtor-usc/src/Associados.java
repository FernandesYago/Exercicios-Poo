public class Associados {
    private int id, numero, cep, telefone, numeroAssociado;
    private String nome, logradouro, bairro, cidade, uf, cpf_cnpj;
    public Associados(int id, int numero, int cep, int telefone, int numeroAssociado,
                      String nome, String logradouro, String bairro, String cidade, String uf, String cpf_cnpj) {

        this.id = id;
        this.numero = numero;
        this.cep = cep;
        this.telefone = telefone;
        this.numeroAssociado = numeroAssociado;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cpf_cnpj = cpf_cnpj;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getNumeroAssociado() {
        return numeroAssociado;
    }
    public void setNumeroAssociado(int numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
}
