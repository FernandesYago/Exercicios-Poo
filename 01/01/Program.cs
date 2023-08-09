using System.Security.Cryptography.X509Certificates;

namespace Exercicios
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Pessoas p1 = new Pessoas();
            Pessoas p2 = new Pessoas();

            Console.WriteLine("Digite os dados da primeira pessoa: ");
            Console.WriteLine("Nome: ");
            p1.nome = Console.ReadLine();
            Console.WriteLine("Idade: ");
            p1.idade = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite os dados da segunda pessoa: ");
            Console.WriteLine("Nome: ");
            p2.nome = Console.ReadLine();
            Console.WriteLine("Idade:");
            p2.idade = int.Parse(Console.ReadLine());

            if (p1.idade > p2.idade)
            {
                Console.WriteLine(p1.nome + " é mais velho(a)");
            }
            else
            {
                Console.WriteLine(p2.nome + " é mais velho(a)");
            }

        }
    }
}
