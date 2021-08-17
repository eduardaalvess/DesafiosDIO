//Fundamentos Aritméticos em JavaScript
//2 / 5 - Exibindo Números Pares

/* Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.
- Entrada
Você receberá 1 valor inteiro N, onde N > 0.
- Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. */

let N = [gets()];

for ( i = 2; i <= N; i++) {
  if(i %2===0){
 console.log(i)
  }

}