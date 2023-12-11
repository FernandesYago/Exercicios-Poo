public class Main {
    public static void main(String[] args) {

        // Exemplo de Associados (todos por chat gpt )
        Associados a1 = new Associados(
                1,
                12,
                12230000,
                129971936,
                456,
                "Claudio da Silva",
                "Rua da Marmota",
                "Bairro Exemplo",
                "Cidade Modelo",
                "UF",
                "123.456.789-00"
        );

        System.out.println("=== Associados ===");
        System.out.println("ID: " + a1.getId());
        System.out.println("Número: " + a1.getNumero());
        System.out.println("CEP: " + a1.getCep());
        System.out.println("Telefone: " + a1.getTelefone());
        System.out.println("Número Associado: " + a1.getNumeroAssociado());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Logradouro: " + a1.getLogradouro());
        System.out.println("Bairro: " + a1.getBairro());
        System.out.println("Cidade: " + a1.getCidade());
        System.out.println("UF: " + a1.getUf());
        System.out.println("CPF/CNPJ: " + a1.getCpf_cnpj());

        Colaborador c1 = new Colaborador(
                2,
                15,
                12230000,
                129971936,
                789,
                "João da Silva",
                "Rua do Exemplo",
                "Bairro Teste",
                "Cidade Teste",
                "SP",
                "987.654.321-00", "Analista de TI");

        System.out.println("\n=== Colaborador ===");
        System.out.println("ID: " + c1.getId());
        System.out.println("Número: " + c1.getNumero());
        System.out.println("CEP: " + c1.getCep());
        System.out.println("Telefone: " + c1.getTelefone());
        System.out.println("Número Associado: " + c1.getNumeroAssociado());
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Logradouro: " + c1.getLogradouro());
        System.out.println("Bairro: " + c1.getBairro());
        System.out.println("Cidade: " + c1.getCidade());
        System.out.println("UF: " + c1.getUf());
        System.out.println("CPF/CNPJ: " + c1.getCpf_cnpj());
        System.out.println("Cargo: " + c1.getCargo());

        Fornecedores f1 = new Fornecedores(
                3,
                20,
                12230000,
                129971936,
                123,
                "Maria da Silva",
                "Rua do Fornecedor",
                "Bairro Fornecedor",
                "Cidade Fornecedora",
                "RJ",
                "111.222.333/0001-00",
                "Fantasia Fornecedor"
        );

        System.out.println("\n=== Fornecedores ===");
        System.out.println("ID: " + f1.getId());
        System.out.println("Número: " + f1.getNumero());
        System.out.println("CEP: " + f1.getCep());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Número Associado: " + f1.getNumeroAssociado());
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Logradouro: " + f1.getLogradouro());
        System.out.println("Bairro: " + f1.getBairro());
        System.out.println("Cidade: " + f1.getCidade());
        System.out.println("UF: " + f1.getUf());
        System.out.println("CPF/CNPJ: " + f1.getCpf_cnpj());
        System.out.println("Fantasia: " + f1.getFantasia());
    }
}
