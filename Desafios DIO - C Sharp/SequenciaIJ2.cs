// 4 / 6 - Sequencia IJ 2 - Programando em C#

using System; 

namespace Dio 
{
    class SequenciaIJ2
    {
        static void Main(string[] args)
        {
            int a, b, c = 7;

            for (int i = 1; i <= 9; i++)
            {
                c = 7;
                for (int j = 1; j <= 3; j++)    
                {
                    if (i % 2 != 0)
                    {
                        Console.WriteLine($"I={i} J={c}");
                        c--;
                    }
                }
            }
        }
    }
}