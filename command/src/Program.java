public class Program {
    public static void main(String[] args) {
        /* COMAND - Gerar uma classe com uma Lista de Comandos (Interface) chamada FilaDeTrabalho, com método de adicionar e processar todos os elementos
                    Gerar cada uma das classes especificas pra mudar algo do OBJETO de ENTIDADE
                    No programa principal, declarar as ENTIDADES, FILADETRABALHO (LISTA na qual vou adicionar os comandos), ADICIONAR COMANDOS NA FILA E PROCESSAR FILA

                    COMPORTAMENTOS PRA ENCAPSULAR E EXECUTAR COMANDO NO FUTURO, SEMELHANTE AO CALLBACK
        */



        Pedido p1 = new Pedido("Mauricio", 150.0);
        Pedido p2 = new Pedido("Marcelo", 250.0);

        FilaDeTrabalho fila = new FilaDeTrabalho();

        fila.adiciona(new PagaPedido(p1));
        fila.adiciona(new PagaPedido(p2));
        fila.adiciona(new ConcluiPedido(p1));

        fila.processa();
    }
}
