package br.com.unimater.aed2023;
import java.util.Random;
import java.util.Scanner;
public class Trabalho2Bi_Exercicio02 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Random ran = new Random();
        int ano = 1990, pesquisa =0;
        int[][] livros = new int[33][2];
            
// AQUI ELE DA O VALOR PARA O ANO E A QUANTIDADE.    
        
            for (int i = 0; i < 33; i++) {
                int quantidade = ran.nextInt(50);
            livros[i][0] = ano;
            livros[i][1] = quantidade;
            ano++;
        }
            
// AQUI ELE FAZ A PERGUNTA QUE O USUARIO DEVE RESPONDER.            
            
            do {
            System.out.println("Qual o ano do livro que deseja?");
            pesquisa = ms.nextInt();
            if(pesquisa < 1990 || pesquisa > 2024){
                System.out.println("Ano inválido, só temos livros de 1990 até 2023!, tente de novo:");
            }
            } while (pesquisa < 1990 || pesquisa > 2023);
            
// AQUI ELE FAZ A PESQUISA BINARIA, E DIZ INFORMAÇÕES ADICIONAIS.            
            
            boolean encontrei = false;
        for (int i = 0; i < 33; i++) {
            if(livros[i][0] == pesquisa){
                System.out.println("Numero encontrado na prateleira "+i+", nessa prateleira contem "+livros[i][1]+" livros");
                encontrei = true;
                break;
            }
        }
        if(!encontrei){
            System.out.println("Não temos nenhum titulo desse ano!");
        }
            
// AQUI ELE ESCREVE A LISTA.
            
        System.out.println("Segue a lista dos nossos livros em ordem:");

for (int i = 0; i < 33; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" "+livros[i][j]);
            }
            System.out.print("\n");
        }       
    }
}