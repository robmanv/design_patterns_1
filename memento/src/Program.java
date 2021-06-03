import java.util.Calendar;

public class Program {
    public static void main(String[] args) {
        /* MEMENTO SERIA PRA TIRAR UMA FOTOGRAFIA DENTRO DA CLASSE DA ENTIDADE, COM LISTA DE ESTADOS, SALVA, RECUPERE-OS */

        Contrato c1 = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
        Historico h1 = new Historico();
        h1.adiciona(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        h1.adiciona(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        h1.adiciona(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        h1.adiciona(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        h1.adiciona(c1.salvaEstado());

        Estado e0= h1.pega(0);
        System.out.println(e0.getEstado().getTipo());

        Estado e1 = h1.pega(1);
        System.out.println(e1.getEstado().getTipo());

        Estado e2 = h1.pega(2);
        System.out.println(e2.getEstado().getTipo());

        Estado e3 = h1.pega(3);
        System.out.println(e3.getEstado().getTipo());


    }
}
