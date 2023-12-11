public class PessoasFisicas  extends  Colaboradores {

    protected String cpf, rg, nome, idade, titulação;

    public PessoasFisicas(String cpf, String rg, String nome, String idade, String titulação,
                          String logradouro, String numero, String bairro, String cidade, String uf,
                          String telefone, String email, String disciplinaMinistrada) {
        super(logradouro, numero, bairro, cidade, uf, telefone, email, disciplinaMinistrada);
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
        this.titulação = titulação;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }
}
