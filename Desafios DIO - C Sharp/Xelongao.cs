// 1 / 6 Xelongão - Programando em C#

// Kogu está buscando as esferas do dragão para invocar Xenlongão e 
// pedir para ele reviver seu amigo Kuriri, que infelizmente morreu 
// de novo na última batalha dos guerreiros Zê.

// Porém Kogu está tendo muita dificuldade para encontrar as esferas, 
// por isso Xenlongão que é seu conhecido há muito tempo, decidiu 
// abrir uma exceção e aceitou ser invocado caso Kogu encontre todas 
// as esferas cujo o número de divisores da quantidade de estrelas da 
// esfera sejam par.

// Por exemplo se existem sete esferas, Kogu não precisaria encontrar 
// as esferas de uma e quatro estrelas, pois elas tem uma quantidade ímpar 
// de divisores, então ele só precisa pegar 5 esferas para invocar 
// Xenlongão.

// Como Kogu não é muito bom em contas, ele pediu para você escrever um 
// programa que dado o total de esferas existentes, mostre a quantidade 
// mínima de esferas que ele precisa procurar.

using System;
using System.Collections.Generic;
using System.Text;

namespace Dio

{
  class Xenlongao 
{
  static void Main(string[] args) 
  { 
    var testes = int.Parse(Console.ReadLine());

    for (int i = 0; i < testes; i++)

    {

    var esferas = int.Parse(Console.ReadLine());

    Console.WriteLine(esferas - Math.Floor(Math.Sqrt(esferas)));

    }

  }

}

}