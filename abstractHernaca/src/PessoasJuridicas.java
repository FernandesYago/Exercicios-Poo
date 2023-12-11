public class PessoasJuridicas extends  Colaboradores {
    protected String razaoSocial, nomeFantasia, inscricaoMunicipal, inscricaoEstadual, cnpj, website;

    public PessoasJuridicas(String logradouro, String numero, String bairro, String cidade, String uf, String telefone, String email, String disciplinaMinistrada, String razaoSocial, String nomeFantasia, String inscricaoMunicipal, String inscricaoEstadual, String cnpj, String website) {
        super(logradouro, numero, bairro, cidade, uf, telefone, email, disciplinaMinistrada);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
        this.website = website;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
