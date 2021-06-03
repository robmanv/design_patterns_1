public class program {
    public static void main(String[] args) {
        /* NO CASO DO INTERPRETER --> TEMOS UMA ARVORE DE EXPRESSÃO ONDE CADA NÓ SE AUTO-AVALIA E VAI RETORNANDO ALGO */
        /* MUITO INDICADO PARA DSL */

        /* Criamos uma INTERFACE com um método retornando um valor, com outras SUB-CLASSES implementando essa INTERFACE */
        /* Cada sub-classe tem seus critérios, SOMA, SUBTRACAO, DIVISAO, ETC, sendo que o NUMERO tb retorna só o valor em */
        /* cada sub-classe pra traduzir a expressao */

        /* Quando tiver um encadeamento de nós, e cada nó deve responder um resultado semelhante sob critérios diferentes. */

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        int resulta = soma.avalia();

        System.out.println("Expressao 10 - 5 + 2 + 10 =" + resulta);

        Expressao divisao = new Divisao(new Numero(10), new Numero(5));
        System.out.println("Divisao de 10 por 5 = " + divisao.avalia());

        Expressao multiplicacao = new Multiplicacao(new Numero(10), new Numero(5));
        System.out.println("Multiplicacao de 10 por 5 = " + multiplicacao.avalia());

        Expressao raizQuadrada = new RaizQuadrada(new Numero(10));
        System.out.println("Raiz quadrada de 10 = " + raizQuadrada.avalia());

        /* VISITOR - Pra cada CLASSE tem o método aceita que pesquisana IMPRESSORA seu método de impressao */
        /*           e na impressao, chamo o aceita de cada parte da EXPRESSAO pra ir no objeto e pesquisar seu método de impressão */
        /*           até chegar na ponta do nó que é NUMERO */
        /*
        /*           Criando a INTERFACE VISITOR consigo desacoplar a classe Impressora
         */

        Visitor impressoraVisitor = new ImpressoraVisitor();
        soma.aceita(impressoraVisitor);

        System.out.println();

        Visitor impressoraPreVisitor = new ImpressoraPreVisitor();
        soma.aceita(impressoraPreVisitor);



    }
}
