/**
 * Desafio - Uniformes de Final de Ano
 * 
 * O professor Girafales organizou a confecção de um uniforme para as turmas
 * da escola para comemorar o final do ano. Após algumas conversas, ficou
 * decidido com os alunos que eles poderiam escolher a cor do uniforme entre
 * branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar
 * as listas de quem quer o uniforme em cada uma das turmas, relacionando estas
 * camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.
 * 
 * Entrada -
 * 
 * Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que
 * indica a quantidade de uniformes a serem feitas para aquela turma. As próximas
 * N*2 linhas contêm informações de cada um dos uniformes (serão duas linhas de
 * informação para cada uniforme). A primeira linha irá conter o nome do
 * estudante e a segunda linha irá conter a cor do uniforme ("branco" ou
 * "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G".
 * A entrada termina quando o valor de N for igual a zero (0) e está valor não
 * deverá ser processado.
 * 
 * Saída -
 * 
 * Para cada caso de entrada deverão ser impressas as informações ordenadas pela
 * cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por
 * último por ordem ascendente de nome, conforme o exemplo abaixo.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class UniformesDeFinalDeAno {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        List<Uniforme> uniformes = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {

            var p = br.readLine();

            if(p.equals("0")) {

                break;

            }
            Uniforme uniforme = new Uniforme();
            uniforme.setNome(p);
            var camiseta = br.readLine().split(" ");
            uniforme.setCor(camiseta[0]);
            uniforme.setTamanho(camiseta[1]);
            uniformes.add(uniforme);
        }
        Comparator<Uniforme> comparator = Comparator
                .comparing(Uniforme::getCor).reversed()
                .thenComparing(Uniforme::getTamanho).reversed()
                .thenComparing(Uniforme::getNome);
        
        uniformes.stream().sorted(comparator).forEach(System.out::println);
    }
    
    public static class Uniforme {
        private String nome;
        private String cor;
        private String tamanho;
        
        @Override
        public String toString() {
            return cor + " " + tamanho + " "+ nome;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getCor() {
            return cor;
        }
        
        public void setCor(String cor) {
            this.cor = cor;
        }
        
        public String getTamanho() {
            return tamanho;
        }
        
        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
    }
}
