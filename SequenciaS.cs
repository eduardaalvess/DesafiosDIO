// 3 / 6 - Sequência S - Programando em C#

// Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
// S = 1 + 1/2 + 1/3 + … + 1/100

// Entrada
// Não há nenhuma entrada neste problema.

// Saída
// A saída contém um valor correspondente ao valor de S.
// O valor deve ser impresso com dois dígitos após o ponto decimal.

using System; 

namespace Dio
{
    class SequenciaS
    {
        static void Main(string[] args)
        {
            double a = 1.19, c, S = 0;
            for (int i = 1; i <= 2; i++)
            {
                c = 1; 
                S += 1 + 1 / 2 + 1 / 3 + c + 1 / 100;
            }
            S = S + a;
            var x = Math.Round(S, 2);
            Console.WriteLine(S);
        }
    }
}