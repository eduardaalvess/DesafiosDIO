// Solução de Problemas com Java
// 7 / 7 - Barras de Ouro

/* 

O feudo da Mesopotâmia é rico e o povo é cordial e alegre. Mas quando o
assunto são impostos, é praticamente um roubo. Todo final de ano, cada feudo
do país deve pagar uma determinada quantidade de quilos de ouro em impostos.
Quando é chegado o momento de coletar os impostos, o Rei envia sua carruagem
real para recolher o ouro devido, usando as estradas do reino.
Cada estrada liga dois feudos diferentes e podem ser percorridos em duas
direções. Com as estradas é possível ir de um feudo a outro, possivelmente
passando por feudos intermediários. Mas há apenas um caminho entre dois feudos
diferentes.
Em cada feudo há um cofre real, utilizado para armazenamento do ouro de
impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade
de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo
principal, percorrendo as estradas do reino, visitando os feudos para recolher
o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente
uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro
devido por todas os feudos devem estar armazenados no cofre real do feudo
principal.
José como é o Rei, contratou o seu time para, dados a quantidade de ouro a ser
recolhido em cada feudo (em kg), a lista das estradas do reino, com os
respectivos comprimentos (em km) e a capacidade de carga da carruagem real
(em kg), determine qual é a mínima distância que a carruagem deve percorrer
para recolher todo o ouro devido.

Entrada -

A primeira linha contém dois inteiros N e C indicando respectivamente o número
de cidades e a capacidade de carga da carruagem (2 ≤ N ≤ 104 e 1 ≤ C ≤ 100). O
feudo principal é identificado pelo número 1 e os outros feudos são identificadas
 por inteiros de 2 a N . A segunda linha contém N inteiros Ei representando a 
 quantidade de imposto devido por cada feudo i (0 ≤ Ei ≤ 100 para 1 ≤ i ≤ N ). 
 Cada uma das N-1 linhas seguintes contém três inteiros A , B e C , indicando 
 que uma estrada liga o feudo A e o feudo B (1 ≤ A, B ≤ N ) e tem comprimento 
 C (1 ≤ C ≤ 100).

Saída -

Seu programa deve produzir uma única linha com um inteiro representando a menor
distância que a carruagem real deve percorrer para recolher todo o imposto
devido, em km.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarrasDeOuro {

    static int capacidadeCarroagem;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdeCidades = leitor.nextInt();
        capacidadeCarroagem = leitor.nextInt();
        List<Cidade> cidades = new ArrayList<>();
        List<Integer> ouroCadaCidade = new ArrayList<>();

        for (int i = 0; i < qtdeCidades; i++) {
            ouroCadaCidade.add( leitor.nextInt());
            Cidade cidade = new Cidade(ouroCadaCidade.get(i));
            cidades.add(cidade);
        }


        int a, b, c;

        for (int i = 0; i < qtdeCidades - 1; i++) {
            a = leitor.nextInt() - 1;
            b = leitor.nextInt() - 1;
            c = leitor.nextInt();

            cidades.get(a).addCaminho(cidades.get(b), c);
            cidades.get(b).addCaminho(cidades.get(a), c);

        }

        System.out.println(cidades.get(0).calcularDistanciaTotal(null));
    }


    static class Cidade {
        double ouroCidade;
        List<Caminho> caminhos;

        public Cidade(int ouroCidade) {
            this.ouroCidade = ouroCidade;
            this.caminhos = new ArrayList<>();
        }

        public void addCaminho(Cidade cidadeDestino, int distancia) {
            caminhos.add(new Caminho(cidadeDestino, distancia));
        }

        public int calcularDistanciaTotal(Cidade cidadeAnterior) {
            int distanciaTotal = 0;
            int numeroViagens = 0;

            for (var caminho : caminhos) {
                if (caminho.cidadeDestino == cidadeAnterior) {
                    continue;
                }

                distanciaTotal += caminho.cidadeDestino.calcularDistanciaTotal(this);
                numeroViagens = (int) Math.ceil(caminho.cidadeDestino.ouroCidade / capacidadeCarroagem) * 2;
                distanciaTotal += numeroViagens * caminho.distancia;
                this.ouroCidade += caminho.cidadeDestino.ouroCidade;
            }
            return distanciaTotal;
        }
    }

    static class Caminho {
        Cidade cidadeDestino;
        int distancia;

        Caminho(Cidade cidadeDestino, int distancia) {
            this.cidadeDestino = cidadeDestino;
            this.distancia = distancia;
        }
    }
}