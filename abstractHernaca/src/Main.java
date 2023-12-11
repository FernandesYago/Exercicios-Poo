public class Main {
    public static void main(String[] args) {
        PessoasFisicas pessoaFisica = new PessoasFisicas(
                "123.456.789-01",
                "123456789",
                "João da Silva",
                "30",
                "Mestrado",
                "Rua A",
                "123",
                "Bairro B",
                "Cidade C",
                "UF",
                "987654321",
                "joao@email.com",
                "Matemática"
        );

        PessoasJuridicas pessoaJuridica = new PessoasJuridicas(
                "Rua X",
                "456",
                "Bairro Y",
                "Cidade Z",
                "UF",
                "987654321",
                "empresa@email.com",
                "Computação",
                "Razão Social XYZ",
                "Nome Fantasia XYZ",
                "123456",
                "789012",
                "9876543210001",
                "www.empresa.com"
        );

        System.out.println("Informações da Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        System.out.println("Titulação: " + pessoaFisica.getTitulação());
        System.out.println();

        System.out.println("Informações da Pessoa Jurídica:");
        System.out.println("Razão Social: " + pessoaJuridica.getRazaoSocial());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Inscrição Estadual: " + pessoaJuridica.getInscricaoEstadual());
        System.out.println("Website: " + pessoaJuridica.getWebsite());
    }
}
