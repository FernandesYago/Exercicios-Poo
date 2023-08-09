using System.ComponentModel.Design;
using System.Globalization;

namespace _02
  
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Funcionarios f1 = new Funcionarios();
            Funcionarios f2 = new Funcionarios();


            Console.WriteLine("Dados do primeiro funcionario : ");
            Console.WriteLine("Nome: ");
            f1.nome = Console.ReadLine();
            Console.WriteLine("Salario: ");
            f1.salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Dados do segundo funcionario: ");
            Console.WriteLine("Nome: ");
            f2.nome = Console.ReadLine();
            Console.WriteLine("Salario: ");
            f2.salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

            double media = (f1.salario + f2.salario) / 2;

            Console.WriteLine("A media de salárial dos funcionarios citados é de: " + media + " Reais");

            if (f1.salario > f2.salario) 
            {
                Console.WriteLine("e o salario de " + f1.nome + " é maior!");
            }
            else 
            {
                Console.WriteLine("e o salario de " + f2.nome + " é maior!"); 
            }

          

        }
    }
}