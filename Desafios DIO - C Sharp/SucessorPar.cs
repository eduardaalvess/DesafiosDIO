// 6 / 6 - Sucessor Par - Programando em C#

// Para se preparar para os outros problemas, 
// vamos fazer um teste. Dado um número X, 
// retorne o menor número par maior do que X.

// Entrada -

// Uma linha contendo um número  0 < X < 107.

// Saída -

// Uma linha contendo a resposta do problema.

using System;
namespace Dio
{
    class SucessorPar
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());

            if ((x + 1) % 2 == 0)//escreva aqui o seu código
            {
                Console.WriteLine(x + 1);
            }
            else
            {
                Console.WriteLine(x + 2);
            }
        }
    }
}