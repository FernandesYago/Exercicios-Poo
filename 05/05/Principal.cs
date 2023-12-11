using System.Security.Cryptography.X509Certificates;

namespace _05
{
    class Principal
    {
        public static void Main(string[] args)
        {
            
            char opcao;
            Console.WriteLine("Olá, tudo bem? este é nosso painel de cadastro...");
            Console.WriteLine("Selecione a função que você deseja :");
            Console.WriteLine("1 - Cadastro de clientes ");
            Console.WriteLine("2 - Cadastro de veículos ");

            opcao = Console.ReadKey().KeyChar;
            switch (opcao)
            {
                case '1':
                    Console.WriteLine("");
                    Console.WriteLine(" Você selecionou Cadastro de clientes");
                    Clientes c1 = new Clientes();

                    Console.Write("Insira o CPF: ");
                    c1.Cpf = Console.ReadLine();

                    Console.Write("Insira o Nome: ");
                    c1.Nome = Console.ReadLine();

                    Console.Write("Insira o Endereço: ");
                    c1.Endereco = Console.ReadLine();

                    Console.Write("Insira o Telefone: ");
                    c1.Telefone = Console.ReadLine();

                    Console.Write("Insira o Email: ");
                    c1.Email = Console.ReadLine();
                    Console.WriteLine("");
                    Console.WriteLine("");
                    Console.WriteLine("Seus dados: ");
                    Console.WriteLine("Dados do cliente cadastrado:");
                    Console.WriteLine("CPF: " + c1.Cpf);
                    Console.WriteLine("Nome: " + c1.Nome);
                    Console.WriteLine("Endereço: " + c1.Endereco);
                    Console.WriteLine("Telefone: " + c1.Telefone);
                    Console.WriteLine("Email: " + c1.Email);
                    break;

                case '2':
                    Console.WriteLine("Você selecionou Cadastro de veículos");
                    Console.WriteLine("Você selecionou Cadastro de carros");
                    Carro carro = new Carro();

                    Console.Write("Insira a Placa: ");
                    carro.Placa = Console.ReadLine();

                    Console.Write("Insira o Modelo: ");
                    carro.Modelo = Console.ReadLine();

                    Console.Write("Insira o Ano: ");
                    carro.Ano = int.Parse(Console.ReadLine());

                    Console.Write("Insira o Fabricante: ");
                    carro.Fabricante = Console.ReadLine();

                    Console.WriteLine("Insira a Cor: ");
                    carro.Cor = Console.ReadLine();
                    break;

                default:
                        Console.WriteLine("Opção inválida, Por favor, selecione a opção '1' ou '2' ");
                    
                    break;
            }
        }
    }
}