//Fundamentos Aritméticos em JavaScript
//3 / 5 - Análise de Números

/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.
- Entrada
Você receberá 5 valores inteiros.
- Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */

let n1= gets();
let n2= gets();
let n3= gets();
let n4= gets();
let n5= gets();

let pares=0;
let impares=0;
let positivos=0;
let negativos=0;

let n = [n1,n2,n3,n4,n5];

for(let i=0; i<n.length;i++){
  if (n[i] % 2 === 0){pares++;}
  if (n[i] % 2 !== 0){impares++}
  if (n[i] > 0 ){positivos++}
  if (n[i] < 0 ){negativos++}
}

console.log(pares + " valor(es) par(es)");
console.log(impares + " valor(es) impar(es)");
console.log(positivos + " valor(es) positivo(s)");
console.log(negativos + " valor(es) negativo(s)");