package one.digitalinnovation.basecamp;

/*
*Classe exemplo para o exercício da Aula 1 de variáveis, Tipos de Dado e Operadores aritméticos.
*/

public class Main {
    public static void main(String[] args) {

        int i;
        //int i; - não pode haver variáveis iguais
        int I; //não ha erro pois é um case sensetive, ou seja um é diferente do outro
        //int 1a; - não pode iniciar com números
        int _1a; // não é boa prática
        int $aq; // também não é boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; - constante não pode ser alterada
        int asrn24678md;
        //int asrn246 78md; - não é permitido espaços nas variaveis
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md = 10; - não é permitido caracteres eseciais

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; - POR  BOAS PRÁTICAS NÃO SE INICIA COM MAIUSCULA
        final int NUMERO_TENTATIVAS = 5; // - variaveis final, são maiusculas e separadas por_
        //inal int numero_tentativas = 5; - fora de padrao
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd; - nao entendivel


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}