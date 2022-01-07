// 2 / 6 - Quadrado de Pares - Programando em C#

// Leia um valor inteiro N. 
// Apresente o quadrado de cada um dos valores pares, 
// de 1 até N, inclusive N, se for o caso.

// Entrada - 

// A entrada contém um valor inteiro N (5 < N < 2000).

// Saída - 

// Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

using System;

namespace Dio
{
    class QuadradoDePares
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine($"{i}^2 = {Math.Pow(i, 2)}");
                }
            }
            }
        }
    }
}