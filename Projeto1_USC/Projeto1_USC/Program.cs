using System;
using System.Globalization;

namespace Projeto1_USC
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno Aluno1 = new Aluno();

            Console.WriteLine("Digite o nome do Aluno: ");
            Aluno1.Nome = Console.ReadLine();
            Console.WriteLine("Qual o endereço do aluno " + Aluno1.Nome);
            Aluno1.Endereco = Console.ReadLine();
            Console.WriteLine("Agora, insira um telefone para contato");
            Aluno1.Contato = Console.ReadLine();
            Console.WriteLine("Qual o email do aluno " + Aluno1.Nome);
            Aluno1.email = Console.ReadLine();
            Console.WriteLine("E qual a matrícula? ");
            Aluno1.Matricula = int.Parse(Console.ReadLine());

            Console.WriteLine("");
            Console.WriteLine("Estas são as informações do(a) " + Aluno1.Nome);
            Console.WriteLine("Nome : " + Aluno1.Nome);
            Console.WriteLine("Endereço : " + Aluno1.Endereco);
            Console.WriteLine("Telefone : " + Aluno1.Contato);
            Console.WriteLine("E-mail : " + Aluno1.email);
            Console.WriteLine("Matrícula : " + Aluno1.Matricula);
            Console.ReadLine();
        }
    } 
}