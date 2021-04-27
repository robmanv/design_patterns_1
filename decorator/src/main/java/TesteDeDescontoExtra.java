public class TesteDeDescontoExtra {
    public static void main(String[] args) {

        // Design Pattern: STATE
        // =====================
        // Neste padrão de projeto temos:
        //
        // CLASSE qualquer com:
        // -> Com atributo PROTECTED de uma CLASSE DE ESTADOS do tipo INTERFACE, abaixo dela teremos N CLASSES DE ESTADO
        // -> Construtor efetuando NEW no atributo CLASSE DE ESTADOS no 1o ESTADO (exemplo EmAprovacao)
        // -> Com métodos void efetuando NEW em cada ESTADO
        //
        // CLASSE --> INTERFACE DE ESTADO --> CLASSES DE ESTADOS (COM MÉTODOS ESPECIFICOS PARA CADA ESTADO)

        Orcamento reforma = new Orcamento(500.0);
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.aprova();
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.finaliza();
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

    }
}
